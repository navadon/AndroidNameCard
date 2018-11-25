package com.example.navadon.androidnamecard;

import android.content.pm.ActivityInfo;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.navadon.androidnamecard.databinding.ActivityInfoBinding;

public class InfoActivity extends AppCompatActivity {

    ActivityInfoBinding binding;

    private MainViewModel viewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        viewModel = new MainViewModel();

        // TODO Step 2: Use DataBindingUtil instead of findViewById
        //textView = findViewById(R.id.tv_display);
        //textView.setText(viewModel.getString());
        binding = DataBindingUtil.setContentView(this, R.layout.activity_info);
        binding.setViewmodel(viewModel);

    }

    public void click(View view){

        viewModel.setString("I am Porn Star");

        // TODO Step 3: Use binding
        //textView.setText(viewModel.getString());
        binding.tvDisplay.setText(viewModel.getString());
    }

}
