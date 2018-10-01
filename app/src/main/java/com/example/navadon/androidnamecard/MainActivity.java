package com.example.navadon.androidnamecard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private View.OnClickListener onClickListener;
    CardView cv_showData;
    boolean check;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        check = false;

//        if(savedInstanceState != null){
//            check = savedInstanceState.getBoolean("check");
//        }

        Log.d("AOF", "restored check state");

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
            Toast("สวัสดีครับ !!!");
            check = true;
        }
        else if (check == true){
            cv_showData.setVisibility(View.INVISIBLE);
            check = false;
        }
    }

    private void Toast(String text) {
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT)
                .show();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putBoolean("check", check);
        Log.d("AOF", "saved check state");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);



    }
}
