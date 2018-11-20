package com.example.navadon.androidnamecard;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.navadon.androidnamecard.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private MainViewModel viewModel;
    public ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        viewModel = new MainViewModel();
        binding.setViewModel(viewModel);
    }

    public void onChange(View view){
        viewModel.setText("Hi Binding");
        binding.text.setText(viewModel.text);
    }
}
