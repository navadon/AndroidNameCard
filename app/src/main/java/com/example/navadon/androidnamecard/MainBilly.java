package com.example.navadon.androidnamecard;

import android.content.Context;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

import com.example.navadon.androidnamecard.databinding.ActivityBillyBinding;

public class MainBilly extends AppCompatActivity {

    private MainBillyViewModel viewModel;
    ActivityBillyBinding binding;
    Boolean state=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_billy);
        initView();
    }

    private void initView(){
        viewModel = new MainBillyViewModel();
        binding = DataBindingUtil.setContentView(this,R.layout.activity_billy);
        binding.setViewmodel(viewModel);

        viewModel.setName("Naravit Sanmanorak");
        binding.txtName.setText(viewModel.getName());

        viewModel.setStudentid("580611030");
        binding.txtStudentID.setText(viewModel.getStudentid());

        viewModel.setCitizenid("1 500 7 00196 23 8");
        binding.txtID.setText(viewModel.getCitizenid());

        viewModel.setFaculty("Information System and Network Engineering");
        binding.txtFaculty.setText(viewModel.getFaculty());
    }

    public void click(View v) {
        if (state == true){
            viewModel.setName("Naravit Sanmanorak");
            binding.txtName.setText(viewModel.getName());

            viewModel.setStudentid("580611030");
            binding.txtStudentID.setText(viewModel.getStudentid());

            viewModel.setCitizenid("1 500 7 00196 23 8");
            binding.txtID.setText(viewModel.getCitizenid());

            viewModel.setFaculty("Information System and Network Engineering");
            binding.txtFaculty.setText(viewModel.getFaculty());
            state = false;
        }
        else {
            viewModel.setName("MARK IRAWIN GOH");
            binding.txtName.setText(viewModel.getName());

            viewModel.setStudentid("610611801");
            binding.txtStudentID.setText(viewModel.getStudentid());

            viewModel.setCitizenid("H50885846");
            binding.txtID.setText(viewModel.getCitizenid());

            viewModel.setFaculty("Information System and Network Engineering");
            binding.txtFaculty.setText(viewModel.getFaculty());
            state =true;
        }

//        changePage(MainMark.class);
//        hideKeyboardInput(v);
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
