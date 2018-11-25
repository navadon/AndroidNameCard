package com.example.navadon.androidnamecard;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.navadon.androidnamecard.databinding.ActivityMainBindingImpl;

public class MainActivity extends AppCompatActivity {

    private MainViewModel viewModel;
    ActivityMainBindingImpl binding;
    private Boolean state = true;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        viewModel = new MainViewModel();
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setViewmodel(viewModel);
        button = findViewById(R.id.btn);
    }

    public void onClick(View v){
        if (state == true){
            button.setText("Show More Info");
            viewModel.setString("Tanawat Klomklom " + "\n" + "First");
            binding.tvInfo.setText(viewModel.getString());
            state = false;
        }else if (state == false){
            button.setText("Show Less Info");
            viewModel.setString("Tanawat Klomklom " + "\n" + "First"
                    + "\n" + "580610645"
                    + "\n" + "CPE24"
                    + "\n" + "Mobile Application development");
            binding.tvInfo.setText(viewModel.getString());
            state = true;
        }
    }

}
