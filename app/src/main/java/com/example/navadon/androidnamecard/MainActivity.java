package com.example.navadon.androidnamecard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private View.OnClickListener onClickListener;
    CardView cv_showData;
    boolean check =false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindView();
        initView();
    }

    private void bindView() {
        cv_showData = findViewById(R.id.cv_All);
    }

    private void initView() {

        initOnclickListener();
        findViewById(R.id.btn_showData).setOnClickListener(onClickListener);

    }

    private void initOnclickListener() {
        onClickListener = new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                switch (view.getId()){
                    case R.id.btn_showData:
                        checkButton();
                        break;

                }

            }
        };
    }

    private void checkButton() {
        if(check == false){
            cv_showData.setVisibility(View.VISIBLE);
            check = true;
        }
        else if (check == true){
            cv_showData.setVisibility(View.INVISIBLE);
            check = false;
        }
    }

}
