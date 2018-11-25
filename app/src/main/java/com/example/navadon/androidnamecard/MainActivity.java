package com.example.navadon.androidnamecard;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.navadon.androidnamecard.databinding.ActivityMainBindingImpl;

public class MainActivity extends AppCompatActivity {
    private MainViewModel viewModel;
    ActivityMainBindingImpl binding;

    private View.OnClickListener onClickListener;
    boolean check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        check = false;

        initView();

    }


    private void initView() {

        viewModel = new MainViewModel();

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setViewmodel(viewModel);

        initOnclickListener();
        binding.btnShowData.setOnClickListener(onClickListener);

    }

    private void initOnclickListener() {
        onClickListener = new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.btn_showData:
                        checkButton();
                        break;

                }

            }
        };
    }

    private void checkButton() {
        if(check == false){
            binding.btnShowData.setText(viewModel.hideText);
            binding.cvAll.setVisibility(View.VISIBLE);
            Toast("สวัสดีครับ !!!");
            check = true;
        }
        else if (check == true){
            binding.btnShowData.setText(viewModel.showText);
            binding.cvAll.setVisibility(View.INVISIBLE);
            check = false;
        }
    }

    private void Toast(String text) {
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT)
                .show();
    }

//    @Override
//    protected void onSaveInstanceState(Bundle outState) {
//        super.onSaveInstanceState(outState);
//        outState.putBoolean("check", check);
//        Log.d("AOF", "saved check state");
//    }
//
//    @Override
//    protected void onRestoreInstanceState(Bundle savedInstanceState) {
//        super.onRestoreInstanceState(savedInstanceState);
//    }
}
