package com.example.navadon.androidnamecard;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.A);


    }

    public void sawp(View v) {
        if(v.getId() == R.id.next) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }
