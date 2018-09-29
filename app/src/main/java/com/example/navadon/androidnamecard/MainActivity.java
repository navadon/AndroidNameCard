package com.example.navadon.androidnamecard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView img;
    private View.OnClickListener onClickListener;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img = findViewById(R.id.profile_image);
        initOnClickListener();
        findViewById(R.id.profile_image).setOnClickListener(onClickListener);
    }

    private void initOnClickListener(){
        onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId() == R.id.profile_image) {
                    intent = new Intent(MainActivity.this,page2.class);
                    startActivity(intent);}
            }
        };
    }
}
