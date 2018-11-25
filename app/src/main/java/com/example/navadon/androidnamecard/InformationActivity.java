package com.example.navadon.androidnamecard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import android.databinding.DataBindingUtil;
import com.example.navadon.androidnamecard.databinding.ActivityInformationBindingImpl;

public class InformationActivity extends AppCompatActivity {

    private View.OnClickListener onClickListener;
    private TextView link;
    private InformationViewModel viewModel;
    ActivityInformationBindingImpl binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        initView();
    }

    private void initView(){
        viewModel = new InformationViewModel();
        binding = DataBindingUtil.setContentView(this, R.layout.activity_information);
        binding.setViewmodel(viewModel);

        initOnClickListener();
        binding.btnMain.setOnClickListener(onClickListener);
    }

    private void initOnClickListener() {
        onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btnMain:
                        goToMain();
                        finish(); // Close Intent
                        break;
                }
            }
        };
    }

    private void goToMain() {
        startActivity(new Intent(this,MainActivity.class));
    }
}
