package com.example.navadon.androidnamecard;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView depTV;
    private TextView nameTV;
    private TextView subnameTV;
    private TextView addressTV;
    private TextView enTV;
    private TextView thTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindView();
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        if (hasFocus) {
            hideSystemUI();
        }
    }

    private void hideSystemUI() {
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                        | View.SYSTEM_UI_FLAG_FULLSCREEN);
    }

    private void bindView() {
        depTV = findViewById(R.id.dep_text_view);
        nameTV = findViewById(R.id.name_text_view);
        subnameTV = findViewById(R.id.subname_text_view);
        addressTV = findViewById(R.id.address_text_view);
        enTV = findViewById(R.id.en_text_view);
        thTV = findViewById(R.id.th_text_view);
    }

    public void setEN(View v) {
        if(v.getId() == R.id.en_text_view) {
            thTV.setTypeface(null, Typeface.NORMAL);
            enTV.setTypeface(null, Typeface.BOLD_ITALIC);
            engToThai();
        }
    }

    public void engToThai() {
        depTV.setText(getString(R.string.dep_name));
        nameTV.setText(getString(R.string.my_name));
        subnameTV.setText(getString(R.string.sub_name));
        addressTV.setText(getString(R.string.address));
    }

    public void setTH(View v) {
        if(v.getId() == R.id.th_text_view) {
            enTV.setTypeface(null, Typeface.NORMAL);
            thTV.setTypeface(null, Typeface.BOLD_ITALIC);
            thaiToEng();
        }
    }

    public void thaiToEng() {
        depTV.setText(getString(R.string.dep_nameth));
        nameTV.setText(getString(R.string.my_nameth));
        subnameTV.setText(getString(R.string.sub_nameth));
        addressTV.setText(getString(R.string.addressth));
    }

}
