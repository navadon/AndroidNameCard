package com.example.navadon.androidnamecard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int check = 0;
    private View.OnClickListener onClickListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView(){
        initOnClickListener();
        // To register click event to view
        findViewById(R.id.btn_change).setOnClickListener(onClickListener);
    }

    private void initOnClickListener(){
        // Only one OnclickListener is created to handle all onClick events.
        onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btn_change:
                        if(check == 0) check = 1;
                        else if(check == 1) check = 0;
                        changeInformation(check);
                        break;
                }
            }
        };
    }

    private void changeInformation(int check){

        TextView name = findViewById(R.id.name);
        TextView idCode = findViewById(R.id.idCode);
        TextView email = findViewById(R.id.email);
        TextView phone = findViewById(R.id.phone);

        if (check == 1){
            name.setText(getResources().getString(R.string._name));
            idCode.setText(getResources().getString(R.string._idCode));
            email.setText(getResources().getString(R.string._email));
            phone.setText(getResources().getString(R.string._phone));
        }else{
            name.setText(getResources().getString(R.string.name));
            idCode.setText(getResources().getString(R.string.idCode));
            email.setText(getResources().getString(R.string.email));
            phone.setText(getResources().getString(R.string.phone));
        }

    }
}
