package com.example.navadon.androidnamecard;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ResourceBundle;

public class MainActivity extends AppCompatActivity {
    private static int Invisible = View.INVISIBLE;
    private static int visiblele = View.VISIBLE;


    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initial(Invisible);

    }

    private void initial(int status) {
        findViewById(R.id.logo_dev).setVisibility(status);
        findViewById(R.id.back).setVisibility(status);
        findViewById(R.id.logo_back).setVisibility(status);
        findViewById(R.id.text_name).setVisibility(status);
        findViewById(R.id.text_position).setVisibility(status);
        findViewById(R.id.button).setVisibility(status);
    }


    public void showInformation(View view) {

        if (view.getId() == R.id.front) {
            findViewById(R.id.front).setVisibility(View.INVISIBLE);
            initial(visiblele);

        } else if (view.getId() == R.id.button) {
            initial(Invisible);
            findViewById(R.id.front).setVisibility(View.VISIBLE);

        }else if(view.getId()==R.id.back){

            TextView textView1=findViewById(R.id.contrack_1);
            TextView textView2=findViewById(R.id.contrack_2);
            TextView textView3=findViewById(R.id.contrack_3);
            TextView textView4=findViewById(R.id.contrack_4);

            if(textView1.getText()==getResources().getString(R.string.address)){
                textView1.setText(R.string.Nickname);
                textView2.setText(R.string.line);
                textView3.setText("");
                textView4.setText("");
                findViewById(R.id.contrack_5).setVisibility(View.INVISIBLE);
            }else if(textView1.getText()==getResources().getString(R.string.Nickname)){
                textView1.setText(R.string.address);
                textView2.setText(R.string.email);
                textView3.setText(R.string.phone);
                textView4.setText(R.string.webpage);
                findViewById(R.id.contrack_5).setVisibility(View.VISIBLE);
            }
        }

    }
}
