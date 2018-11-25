package com.example.navadon.androidnamecard;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import com.example.navadon.androidnamecard.databinding.ActivityBillyBinding;

public class MainMark extends AppCompatActivity {

    private MainBillyViewModel viewModel;
    ActivityBillyBinding binding;
    private View.OnClickListener onClickListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mark);
        initView();
    }

    private void initView(){
        viewModel = new MainBillyViewModel();
        binding = DataBindingUtil.setContentView(this,R.layout.activity_billy);
        binding.setViewmodel(viewModel);

        viewModel.setName("MARK IRAWIN GOH");
        binding.txtName.setText(viewModel.getName());

        viewModel.setStudentid("610611801");
        binding.txtStudentID.setText(viewModel.getStudentid());

        viewModel.setCitizenid("H50885846");
        binding.txtID.setText(viewModel.getCitizenid());

        viewModel.setFaculty("Information System and Network Engineering");
        binding.txtFaculty.setText(viewModel.getFaculty());

//        initOnClickListener();
    }

//    private void initOnClickListener(){
//        // Only one OnclickListener is created to handle all onClick events.
//        onClickListener = new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                switch (v.getId()) {
//                    case R.id.btn_next0:
//                        Intent intent2 = new Intent(MainMark.this, MainBilly.class);
//                        startActivity(intent2);
//                        finish();
//                        break;
//
//                }
//            }
//        };
//    }

    public void click(View v) {

        changePage(MainBilly.class);
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
