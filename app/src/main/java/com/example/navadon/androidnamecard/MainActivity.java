package com.example.navadon.androidnamecard;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import com.example.navadon.androidnamecard.databinding.ActivityMainBindingImpl;


public class MainActivity extends AppCompatActivity {

    private  MainViewModel viewModel;
    ActivityMainBindingImpl binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        setText();

    }

    private void initView(){
        viewModel = new MainViewModel();
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setViewmodel(viewModel);

    }


    // This "process" method MUST be bound in the layout XML file, "android:onClick="process""
    public void process(View v) {
        if (v.getId() == R.id.button){
            nextPage();
        }
        hideKeyboardInput(v);
    }

    private void nextPage(){
        Intent next = new Intent(this,page2.class);
        startActivity(next);
    }


    // To hide Android soft keyboard
    private void hideKeyboardInput(View v){
        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
    }

    public void setText(){
        viewModel.setString("VorasonSi");
        binding.textView2.setText(viewModel.getString());
        viewModel.setString1("nice_faber");
        binding.textView3.setText(viewModel.getString1());
        viewModel.setString2("vorason.si@gmail.com");
        binding.textView5.setText(viewModel.getString2());
        viewModel.setString3("Vorasorn Siripankul");
        binding.textView4.setText(viewModel.getString3());
    }




}
