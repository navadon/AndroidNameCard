package com.example.navadon.androidnamecard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class InformationActivity extends AppCompatActivity {

    private View.OnClickListener onClickListener;
    private TextView link;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);
        initView();
    }

    private void initView(){
        initOnClickListener();
        findViewById(R.id.btnMain).setOnClickListener(onClickListener);
        link = findViewById(R.id.websiteView);
        link.setMovementMethod(LinkMovementMethod.getInstance());
    }

    private void initOnClickListener() {
        onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btnMain:
                        goToMain();
                        break;
                }
            }
        };
    }

    private void goToMain() {
        startActivity(new Intent(this,MainActivity.class));
    }
}
