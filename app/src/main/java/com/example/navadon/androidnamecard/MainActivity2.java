package com.example.navadon.androidnamecard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity2 extends AppCompatActivity {

    private Button btn_contact;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bindView();
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
}
