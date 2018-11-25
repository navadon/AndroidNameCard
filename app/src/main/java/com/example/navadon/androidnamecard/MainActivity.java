package com.example.navadon.androidnamecard;

import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.os.Debug;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.example.navadon.androidnamecard.databinding.ActivityMainBinding;
import java.util.ResourceBundle;

public class MainActivity extends AppCompatActivity {
    private static int Invisible = View.INVISIBLE;
    private static int visiblele = View.VISIBLE;
    private MainViewModel viewModel;
    private static boolean isChange=false;
    ActivityMainBinding binding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewModel = new MainViewModel();
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
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setModel(viewModel);
        if(view.getId() == R.id.front){
            initial(visiblele);
            findViewById(R.id.front).setVisibility(View.INVISIBLE);
        }
        if(view.getId() == R.id.button){
            initial(Invisible);
            findViewById(R.id.front).setVisibility(View.VISIBLE);
        }
        if(view.getId() == R.id.back) {
            findViewById(R.id.front).setVisibility(View.INVISIBLE);
            Log.i("DataBinding", "showInformation: "+viewModel.getContrack_1());
            Log.i("DataBinding", "showInformation: "+viewModel.getContrack_2());
            if (isChange) {
                viewModel.setContrack_1(getResources().getString(R.string.address));
                viewModel.setContrack_2(getResources().getString(R.string.email));
                viewModel.setContrack_3(getResources().getString(R.string.phone));
                viewModel.setContrack_4(getResources().getString(R.string.webpage));
                isChange = !isChange;
            } else {
                viewModel.setContrack_1(getResources().getString(R.string.Nickname));
                viewModel.setContrack_2(getResources().getString(R.string.line));
                viewModel.setContrack_3("");
                viewModel.setContrack_4("");
                isChange = !isChange;
            }
        }

    }
    public void setInformation(){

    }
}
