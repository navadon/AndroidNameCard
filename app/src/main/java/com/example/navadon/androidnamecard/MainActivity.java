package com.example.navadon.androidnamecard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvName;
    private TextView tvCode;
    private TextView tvEmail;
    private TextView tvPhone;
    private TextView tvAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initInstances();
    }

    private void initInstances() {
        /**
         * Binding View
         */
        tvName = findViewById(R.id.tv_name);
        tvCode = findViewById(R.id.tv_code);
        tvEmail = findViewById(R.id.tv_email);
        tvPhone = findViewById(R.id.tv_phone);
        tvAddress = findViewById(R.id.tv_address);
    }

    /**
     * On Click Listener Button Click
     * Change Information
     * @param view
     */
    public void changeInformation(View view) {
        switch (view.getId()) {
            case R.id.btn_apirom: {
                tvName.setText(R.string.string_apirom);
                tvCode.setText(R.string.string_std_code);
                tvEmail.setText(R.string.string_email);
                tvPhone.setText(R.string.string_phone);
                tvAddress.setText(R.string.string_address);
                break;
            }
            case R.id.btn_nipitpon: {
                tvName.setText(R.string.nipitpon);
                tvCode.setText(R.string.string_std_code_33);
                tvEmail.setText(R.string.string_email_nipitpon);
                tvPhone.setText(R.string.string_phone_nipitpon);
                tvAddress.setText(R.string.string_address_nipitpon);
                break;
            }
            default:
        }
    }
}
