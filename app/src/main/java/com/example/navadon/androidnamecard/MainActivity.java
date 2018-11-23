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

    private View.OnClickListener onClickListener;

    private MainViewModel viewModel;
    ActivityMainBindingImpl binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }


    private void initView(){
//        initOnClickListener();
//        // To register click event to view
//        findViewById(R.id.btn).setOnClickListener(onClickListener);
//        observable

        viewModel = new MainViewModel();
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setViewmodel(viewModel);

        viewModel.setNumber("580610673");
        binding.textView2.setText(viewModel.getNumber());

        viewModel.setButton("you can click in the circle");
        binding.textView3.setText(viewModel.getButton());

        viewModel.setName("Wachirawit Kanpanluk");
        binding.textView.setText(viewModel.getName());


    }

    // You don't have to bind any functions to "android:onClick" in layout XML file.
    public void onClick(View v) {

        changePage(BackPageActivity.class);
        hideKeyboardInput(v);
    }

    private void changePage(Class i){
        startActivity(new Intent(this,i));
    }

    // To hide Android soft keyboard
    private void hideKeyboardInput(View v){
        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
    }
}
