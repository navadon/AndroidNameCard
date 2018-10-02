package com.example.navadon.androidnamecard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button tvOutputName;
    private TextView tvOutputAddr;
    private TextView tvOutputTel;
    private TextView tvOutputEmail;
    private int state = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindView();
    }

    // To bind views to this activity
    private void bindView(){

        tvOutputName = (Button) findViewById(R.id.nameT);
        tvOutputAddr = (TextView) findViewById(R.id.addressT);
        tvOutputTel = (TextView) findViewById(R.id.phoneT);
        tvOutputEmail = (TextView) findViewById(R.id.emailT);

    }


    public void process(View v) {
        if (v.getId() == R.id.nameT) {
            switch (state) {
                case 0:
                    tvOutputName.setText(getString(R.string.name2));
                    tvOutputAddr.setText(getString(R.string.add2));
                    tvOutputTel.setText(getString(R.string.phone2));
                    tvOutputEmail.setText(getString(R.string.email2));
                    state = 1;
                    break;
                case 1:
                    tvOutputName.setText(getString(R.string.name1));
                    tvOutputAddr.setText(getString(R.string.add1));
                    tvOutputTel.setText(getString(R.string.phone1));
                    tvOutputEmail.setText(getString(R.string.email1));
                    state = 0;
                    break;
            }
        }
    }

}
