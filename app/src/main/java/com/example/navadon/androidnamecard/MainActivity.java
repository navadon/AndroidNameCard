package com.example.navadon.androidnamecard;

import android.databinding.DataBindingUtil;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.example.navadon.androidnamecard.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

//    private TextView depTV;
//    private TextView nameTV;
//    private TextView subnameTV;
//    private TextView addressTV;
    private TextView enTV;
    private TextView thTV;

    private MainViewModel viewModel;

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindview();
        initView();
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

    private void bindview(){
        enTV = findViewById(R.id.en_text_view);
        thTV = findViewById(R.id.th_text_view);
    }

    private void initView() {
        viewModel = new MainViewModel();
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setModel(viewModel);
    }

    public void setEN(View v) {
        if(v.getId() == R.id.en_text_view) {
            thTV.setTypeface(null, Typeface.NORMAL);
            enTV.setTypeface(null, Typeface.BOLD_ITALIC);
            engToThai();
        }
    }

    public void engToThai() {
        viewModel.setAddress("ชั้น 4 อาคาร 30 ปี\nคณะวิศวกรรมศาสตร์ มหาวิทยาลัยเชียงใหม่\nอีเมล: supakarn_chaidaroon@cmu.ac.th");
        viewModel.setDepname("ภาควิชาวิศวกรรมคอมพิวเตอร์");
        viewModel.setMyname("ศุภการ  ชัยดรุณ");
        viewModel.setSubname("นักศึกษาชั้นปีที่ 4");
    }

    public void setTH(View v) {
        if(v.getId() == R.id.th_text_view) {
            enTV.setTypeface(null, Typeface.NORMAL);
            thTV.setTypeface(null, Typeface.BOLD_ITALIC);
            thaiToEng();
        }
    }

    public void thaiToEng() {
        viewModel.setAddress("4th Floor, 30 Years Building\nFaculty of Engineering, Chiang Mai University\nEmail: supakarn_chaidaroon@cmu.ac.th");
        viewModel.setDepname("Department of Computer Engineering");
        viewModel.setMyname("Supakarn Chaidaroon");
        viewModel.setSubname("4th year student");
    }

}
