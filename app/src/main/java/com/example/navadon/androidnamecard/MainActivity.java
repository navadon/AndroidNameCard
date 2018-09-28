package com.example.navadon.androidnamecard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button edit_btn;
    TextView phone_number;
    TextView name;
    TextView email;
    TextView address;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit_btn = (Button) findViewById(R.id.edit_btn);
        phone_number = (TextView) findViewById(R.id.phone_number);
        name = (TextView) findViewById(R.id.name);
        email = (TextView) findViewById(R.id.email);
        address = (TextView) findViewById(R.id.address);
        edit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                name.setText("Tanakorn Malajak");
                phone_number.setText("0954492510");
                email.setText("dew4521@gamail.com");
                address.setText("321 Huaykaew Rd. Muaeng, C.N. 51000");
            }
        });
    }
}
