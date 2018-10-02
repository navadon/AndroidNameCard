package com.example.navadon.androidnamecard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtD, txtBtn;
    private View.OnClickListener onClickListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindView();
        initView();
    }

    private void bindView()
    {
        txtD = findViewById(R.id.textDisplay);
        txtBtn = findViewById(R.id.textButton);
    }

    private void initView()
    {
        initOnClick();
        txtBtn.setOnClickListener(onClickListener);
    }

    private void initOnClick()
    {
        onClickListener = new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(txtD.getText() == getResources().getString(R.string.text1))
                {
                    txtD.setText(R.string.text2);
                }
                else
                {
                    txtD.setText(R.string.text1);
                }
            }
        };
    }
}
