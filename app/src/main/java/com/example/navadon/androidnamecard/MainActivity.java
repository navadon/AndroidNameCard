package com.example.navadon.androidnamecard;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.navadon.androidnamecard.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ImageView img;
    private View.OnClickListener onClickListener;
    private Intent intent;

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        initOnClickListener();
        initValue();
        findViewById(R.id.profile_image).setOnClickListener(onClickListener);
    }

    private void initOnClickListener(){
        onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId() == R.id.profile_image) {
                    intent = new Intent(MainActivity.this,page2.class);
                    startActivity(intent);}
            }
        };
    }

    private void initValue(){
        DetailViewModel detailViewModel = new DetailViewModel();
        detailViewModel.setEt1("Arinchai Nanjaruwong");
        detailViewModel.setEt2("580610692");
        detailViewModel.setImageResource(binding.profileImage,R.drawable.profile);
//        binding.profileImage.setImageResource();
        binding.setData(detailViewModel);
    }
}
