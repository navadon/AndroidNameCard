package com.example.navadon.androidnamecard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView eMail,phone,age,bd,bdth;
    public int temp=0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindView();
    }

    public void process(View v){
        if(temp == 0){
            if(v.getId() == R.id.Chang) {
                setThai();
                temp+=1 ;
            }
        }
        else {
            if(v.getId() == R.id.Chang) {
                setEng();
                temp-=1 ;
            }
        }

    }

    private void bindView() {
        eMail = findViewById(R.id.email);
        phone = findViewById(R.id.phone);
        age = findViewById(R.id.age);
        bd = findViewById(R.id.bd);
        bdth = findViewById(R.id.bdth);
    }

    public void setThai(){
        eMail.setText(R.string.Emailthai);
        phone.setText(R.string.Phonethai);
        age.setText(R.string.Agethai);
        bd.setText(R.string.Date_Of_Birthdaythai);
        bdth.setText(R.string.Date_Of_BirthdayThaiis);
    }

    public void setEng(){
        eMail.setText(R.string.Email);
        phone.setText(R.string.Phone);
        age.setText(R.string.Age);
        bd.setText(R.string.Date_Of_Birthday);
        bdth.setText(R.string.Date_Of_Birthdayis);
    }
}
