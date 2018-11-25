package com.example.navadon.androidnamecard;

import android.app.Activity;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.navadon.androidnamecard.databinding.ActivityMainBinding;

public class MainActivity extends Activity implements View.OnClickListener{

//    View inflatedView = getLayoutInflater().inflate(R.layout.activity_info, null);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainView object = new ActivityMainView();
        ActivityMainBinding bind = DataBindingUtil.setContentView(this,R.layout.activity_main);
        bind.setViewmodel(object);
        object.setName("Warakorn\nMeakpattanapinyo");
        findViewById(R.id.button0).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        startActivity(new Intent(this, InfoActivity.class));
    }
}
