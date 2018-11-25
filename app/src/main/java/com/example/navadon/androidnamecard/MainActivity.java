package com.example.navadon.androidnamecard;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import com.example.navadon.androidnamecard.databinding.ActivityMainBinding;
import com.example.navadon.androidnamecard.databinding.ActivityMainBindingImpl;


public class MainActivity extends AppCompatActivity {
    private DataModel dataModel;
    //ActivityMainBindingImpl binding;
    ActivityMainBinding binding;

    private String name,email,age,addr;
    private int state = 0;
    private View.OnClickListener onClickListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindView();
        initView();
    }

    private void bindView(){
        dataModel = new DataModel();
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setData(dataModel);
    }


    private void initView() {
        initOnClickListener();
        binding.nameT.setOnClickListener(onClickListener);
    }

    private void initOnClickListener() {
        onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.nameT) {
                    switch (state) {
                        case 0:
                            name = getString(R.string.name1);
                            addr = getString(R.string.add1);
                            age = getString(R.string.age1);
                            email = getString(R.string.email1);
                            state = 1;
                            dataBinding();
                            break;
                        case 1:
                            name = getString(R.string.name2);
                            addr = getString(R.string.add2);
                            age = getString(R.string.age2);
                            email = getString(R.string.email2);
                            state = 0;
                            dataBinding();
                            break;
                    }
                    dataModel.setName(name);
                    dataModel.setAddress(addr);
                    dataModel.setAge(age);
                    dataModel.setEmail(email);
                }

            }
        };
    }

    private void dataBinding(){
        binding.setData(dataModel);
    }

}
