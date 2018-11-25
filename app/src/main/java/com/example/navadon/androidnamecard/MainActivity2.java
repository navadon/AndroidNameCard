package com.example.navadon.androidnamecard;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.navadon.androidnamecard.databinding.ActivityMainBinding;


public class MainActivity2 extends AppCompatActivity {

    private Button btn_contact;

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main2);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main2);
        bindView();
        initValue();
    }

    // To bind views to this activity
    private void bindView(){


        btn_contact =  findViewById(R.id.button_to_contact);

    }

    // This "process" method MUST be bound in the layout XML file, "android:onClick="process""
    public void process(View v) {
        if(v == btn_contact) {
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        }

    }

    public void initValue(){
        ViewModels datamodel = new ViewModels();
        datamodel.setFullName("wiphob kaoian");
        datamodel.setMobileandAge("Age : 21");
        binding.setData(datamodel);
    }
}
