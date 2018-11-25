package com.example.navadroid.androiddatabinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
//import android.widget.TextView;

import com.example.navadroid.androiddatabinding.databinding.ActivityMainBindingImpl;

import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {

    private MainViewModel viewModel;

    // TODO Step 1: Declare binding instance instead view's (binding class is auto-generated)
    //private TextView textView;
    ActivityMainBindingImpl binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView(){
        viewModel = new MainViewModel();


        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setViewmodel(viewModel);

    }

    public void click(View view) {
       int current=parseInt(viewModel.getString(),10);
        current++;
        String strCurrent= String.valueOf(current);

        viewModel.setString(strCurrent);


        binding.textView2.setText(viewModel.getString());
    }


}
