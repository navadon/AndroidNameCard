package com.example.navadon.androidnamecard;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import com.example.navadon.androidnamecard.databinding.ActivityBackBindingImpl;

public class BackPageActivity extends AppCompatActivity {

    private BackPageViewModel viewModel;
    ActivityBackBindingImpl binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back);
        initView();
    }

    private void initView(){

        viewModel = new BackPageViewModel();
        binding = DataBindingUtil.setContentView(this, R.layout.activity_back);
        binding.setViewmodel(viewModel);

        viewModel.setUniversity("Chiang Mai University");
        binding.textView4.setText(viewModel.getUniversity());

        viewModel.setButton("you can click in the circle");
        binding.textView3.setText(viewModel.getButton());

        viewModel.setName("วินเนอร์ อะ");
        binding.textView.setText(viewModel.getName());

    }

    public void onclick(View v) {

        changePage(MainActivity.class);
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
