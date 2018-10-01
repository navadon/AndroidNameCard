package com.example.navadon.androidnamecard;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button about_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindView();
    }

    private void bindView() {
       about_button = findViewById(R.id.btn_next);
    }

    public void process(View v) {
        if (v == about_button) {
            next();
        }
        hideKeyboardInput(v);
    }

    public void next() {
        Intent i = new Intent(MainActivity.this, InfoActivity.class);
        MainActivity.this.startActivity(i);
    }

    private void hideKeyboardInput(View v){
        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
    }
}
