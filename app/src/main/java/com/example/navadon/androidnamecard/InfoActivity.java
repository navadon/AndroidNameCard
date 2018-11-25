package com.example.navadon.androidnamecard;

import android.app.Activity;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.navadon.androidnamecard.databinding.ActivityInfoBinding;
import com.example.navadon.androidnamecard.databinding.ActivityMainBinding;

public class InfoActivity extends Activity implements View.OnClickListener {

    protected ActivityInfoView object = new ActivityInfoView();
    protected ActivityInfoBinding bind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        bind = DataBindingUtil.setContentView(this,R.layout.activity_info);
        bind.setViewmodel(object);
        object.setTitlePhoneNum("Phone Number");
        object.setPhonenum("0882888459");
        object.setTitleEmail("E-mail");
        object.setEmail("warakornchamp@gmail.com");
        object.setTitleAddr("Address");
        object.setAddr("222/145 village No.1\nSuthep Amphoe Mueang Chiang Mai Chiang Mai 50200");
        findViewById(R.id.button1).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(((Button)v).getText().equals(getString(R.string.buttonLang))){
            ((Button)findViewById(R.id.button1)).setText(R.string.buttonLangTH);
            object.setTitlePhoneNum("เบอร์โทร");
            bind.textViewNum0.setText(object.getTitlePhoneNum());
            object.setTitleAddr("ที่อยู่");
            bind.textViewAddr0.setText(object.getTitleAddr());
            object.setAddr("222/145 หมู่ 1 \nต.สุเทพ อ.เมืองเชียงใหม่ จ.เชียงใหม่ 50200");
            bind.textViewAddr1.setText(object.getAddr());
//            ((TextView)findViewById(R.id.textViewNum0)).setText(R.string.phoneNumberTitleTH);
//            ((TextView)findViewById(R.id.textViewAddr0)).setText(R.string.addressTitleTH);
//            ((TextView)findViewById(R.id.textViewAddr1)).setText(R.string.addressTH);
        }else{
            ((Button)findViewById(R.id.button1)).setText(R.string.buttonLang);
            object.setTitlePhoneNum("Phone Number");
            bind.textViewNum0.setText(object.getTitlePhoneNum());
            object.setTitleAddr("Address");
            bind.textViewAddr0.setText(object.getTitleAddr());
            object.setAddr("222/145 village No.1\nSuthep Amphoe Mueang Chiang Mai Chiang Mai 50200");
            bind.textViewAddr1.setText(object.getAddr());
//            ((TextView)findViewById(R.id.textViewNum0)).setText(R.string.phoneNumberTitle);
//            ((TextView)findViewById(R.id.textViewAddr0)).setText(R.string.addressTitle);
//            ((TextView)findViewById(R.id.textViewAddr1)).setText(R.string.address);
        }
    }
}