package com.example.navadon.androidnamecard;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.navadon.androidnamecard.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    public int temp=0 ;
    private Model viewModel;
    ActivityMainBinding binding ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindView();
    }

    public void process(View v){
        if(temp == 0){
            if(v.getId() == R.id.Chang ) {
                setThai();
                binding.setModel(viewModel);
                temp+=1 ;
            }
        }
        else {
            if(v.getId() == R.id.Chang) {
                setEng();
                binding.setModel(viewModel);
                temp-=1 ;
            }
        }

    }

    private void bindView() {
        viewModel = new Model();
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setModel(viewModel);
    }

    public void setThai(){
        viewModel.setFirstName("ภคิน ชูเกียรติขจร");
        viewModel.setAge("อายุ : ");
        viewModel.setBdate("วัดเกิด : ");
        viewModel.setPhone("เบอร์ : ");
        viewModel.setSbdate("25/5/2540");
    }

    public void setEng(){
        viewModel.setFirstName("Phakin Chukiatkajohn");
        viewModel.setAge("Age : ");
        viewModel.setBdate("Birthday : ");
        viewModel.setPhone("Phone : ");
        viewModel.setSbdate("25/5/1997");
    }
}
