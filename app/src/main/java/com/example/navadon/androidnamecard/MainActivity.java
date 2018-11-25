package com.example.navadon.androidnamecard;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.navadon.androidnamecard.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity {

    private Button btn_profile;

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        bindView();
        initValue();
    }

    // To bind views to this activity
    private void bindView(){


        btn_profile =  findViewById(R.id.button_to_profile);

    }

    // This "process" method MUST be bound in the layout XML file, "android:onClick="process""
    public void process(View v) {
        if(v == btn_profile) {
            Intent intent = new Intent(this,MainActivity2.class);
            startActivity(intent);
        }

    }

    public void initValue(){
        ViewModels datamodel = new ViewModels();
        datamodel.setFullName("WIPHOB KAOIAN");
        datamodel.setMobileandAge("Mobile : 061  798  6601");
        binding.setData(datamodel);
    }
}
