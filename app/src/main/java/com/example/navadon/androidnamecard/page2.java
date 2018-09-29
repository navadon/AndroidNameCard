package com.example.navadon.androidnamecard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class page2 extends AppCompatActivity {
    private ImageView img;
    private View.OnClickListener onClickListener;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2);
        img = findViewById(R.id.profile_image);
        initOnClickListener();
        findViewById(R.id.profile_image).setOnClickListener(onClickListener);
    }

    private void initOnClickListener(){
        onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(page2.this,MainActivity.class);
                startActivity(intent);
            }
        };
    }
}
