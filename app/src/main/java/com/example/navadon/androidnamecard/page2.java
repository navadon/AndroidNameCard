package com.example.navadon.androidnamecard;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.example.navadon.androidnamecard.databinding.ActivityMainBinding;

public class page2 extends AppCompatActivity {
    private ImageView img;
    private View.OnClickListener onClickListener;
    private Intent intent;


    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        initOnClickListener();
        initValue();
        findViewById(R.id.profile_image).setOnClickListener(onClickListener);
    }

    private void initOnClickListener(){
        onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(page2.this,MainActivity.class);
                startActivity(intent);
            }
        };
    }

    private void initValue(){
        DetailViewModel detailViewModel = new DetailViewModel();
        detailViewModel.setEt1("Magmanex");
        detailViewModel.setEt2("https://github.com/magmanex");
        detailViewModel.setImageResource(binding.profileImage,R.drawable.git);
//        binding.profileImage.setImageResource();
        binding.setData(detailViewModel);
    }
}
