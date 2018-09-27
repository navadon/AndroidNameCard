package com.example.navadon.androidnamecard;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private View.OnClickListener onClickListener;
    private TextView fullName;
    private int num = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bindView();
        initView();
    }
    private void bindView(){
        fullName = (TextView) findViewById(R.id.fn_1);
    }


    public void initView(){
        initOnClickListener();
        findViewById(R.id.btn_click_2).setOnClickListener(onClickListener);
        findViewById(R.id.cardView_2).setOnClickListener(onClickListener);

    }

    // You don't have to bind any functions to "android:onClick" in layout XML file.
    private void initOnClickListener() {
        onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btn_click_2:
                        Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.cardView_2:
                        changeName(num);
                        num +=1;

                }

            }
        };
    }

    private  void changeName(int val){
        if (val%2 != 0) {
            fullName.setText(getString(R.string.nameBeam));
        }
        else {
            fullName.setText("I'm BEAMMHEE. :)");
        }

    }

}
