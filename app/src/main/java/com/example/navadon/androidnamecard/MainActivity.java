package com.example.navadon.androidnamecard;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.navadon.androidnamecard.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private MainViewModel viewModel;
    ActivityMainBinding binding;

    Button edit_btn;
    TextView phone_number;
    TextView name;
    TextView email;
    TextView address;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit_btn = (Button) findViewById(R.id.chains);
        phone_number = (TextView) findViewById(R.id.phone);
        name = (TextView) findViewById(R.id.name);
        email = (TextView) findViewById(R.id.email);
        address = (TextView) findViewById(R.id.address);

        private void initView(){
            viewModel = new MainViewModel();

            // TODO Step 2: Use DataBindingUtil instead of findViewById
            //textView = findViewById(R.id.tv_display);
            //textView.setText(viewModel.getString());
            binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
            binding.setViewmodel(viewModel);

        }

        edit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewModel.setName("Tanakorn Malajak");
                viewModel.setPhone("0954492510");
                viewModel.setEmail("dew4521@gamail.com");
                viewModel.setAddress("321 Huaykaew Rd. Muaeng, C.N. 51000");
            }
        });
    }
}
