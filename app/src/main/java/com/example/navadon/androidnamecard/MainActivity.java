package com.example.navadon.androidnamecard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private View effectOnContainer1;
    private ImageButton image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        overridePendingTransition(R.anim.anim_slide_back,R.anim.anim_slide_back);
        effectOnContainer1 = findViewById(R.id.container1);
        AlphaAnimation animation = new AlphaAnimation(0, 1);
        animation.setDuration(500);
        animation.setFillEnabled(true);
        animation.setFillBefore(true);
        animation.setFillAfter(true);
        effectOnContainer1.startAnimation(animation);


    }

    public void process(View view){
        if(view.getId() == R.id.EN ){
            EnClick();
        }
    }




    public void EnClick() {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);
    }

    public void imageClick(View view) {
        Animation anim = new RotateAnimation(0,360,view.getWidth()/2,view.getHeight()/2);


        anim.setDuration(500);
        view.startAnimation(anim);
        System.out.println("[Click]"+ view.getId());
    }
}
