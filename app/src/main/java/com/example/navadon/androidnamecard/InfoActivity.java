package com.example.navadon.androidnamecard;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class InfoActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
        findViewById(R.id.button1).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(((Button)v).getText().equals(getString(R.string.buttonLang))){
            ((Button)findViewById(R.id.button1)).setText(R.string.buttonLangTH);
            ((TextView)findViewById(R.id.textViewNum0)).setText(R.string.phoneNumberTitleTH);
            ((TextView)findViewById(R.id.textViewAddr0)).setText(R.string.addressTitleTH);
            ((TextView)findViewById(R.id.textViewAddr1)).setText(R.string.addressTH);
        }else{
            ((Button)findViewById(R.id.button1)).setText(R.string.buttonLang);
            ((TextView)findViewById(R.id.textViewNum0)).setText(R.string.phoneNumberTitle);
            ((TextView)findViewById(R.id.textViewAddr0)).setText(R.string.addressTitle);
            ((TextView)findViewById(R.id.textViewAddr1)).setText(R.string.address);
        }
    }
}