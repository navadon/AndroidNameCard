package com.example.navadon.androidnamecard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CardView cardView;
    Button button;
    private View.OnClickListener onClickListener;
    Boolean aboolean = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindView();
        initView();
    }

    private void bindView() {
        cardView = findViewById(R.id.cardview);
        button = findViewById(R.id.btn);
    }

    private void initView() {
        initOnClickListener();

        findViewById(R.id.btn).setOnClickListener(onClickListener);
    }

    private void initOnClickListener() {
        onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.btn:
                        showData();
                        break;
                }
            }
        };
    }

    private void showData() {
       if (aboolean == true){
           cardView.setVisibility(View.VISIBLE);
           button.setText(getString(R.string.hide_data));
           aboolean = false;
       }else if (aboolean ==false){
           cardView.setVisibility(View.INVISIBLE);
           button.setText(getString(R.string.show_data));
           aboolean = true;
       }
    }

}
