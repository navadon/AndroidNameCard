package com.example.navadon.androidnamecard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView Output;
    private Button showage;
    private Button showbirthday;
    private View.OnClickListener onClickListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindView();
        initView();

    }

    private void bindView(){
        Output = (TextView) findViewById(R.id.text);
    }
    private void initView(){
        initOnClickListener();
        // To register click event to view
        findViewById(R.id.showage).setOnClickListener(onClickListener);
        findViewById(R.id.showbirthday).setOnClickListener(onClickListener);
    }

    private void initOnClickListener(){
        onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.showage:
                        show_age();
                        break;
                    case R.id.showbirthday:
                        show_birthday();
                        break;
                }

            }
        };
    }
    public void show_age() {
        Output.setText("Age : 21");


    }
    public void show_birthday() {
        Output.setText("Birthday : 25 February 1997");

    }
}
