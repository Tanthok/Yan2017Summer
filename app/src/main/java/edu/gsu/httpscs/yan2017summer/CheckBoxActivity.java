package edu.gsu.httpscs.yan2017summer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;

import java.util.HashMap;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class CheckBoxActivity extends BaseActivity{
    private HashMap<String, Boolean> list = new HashMap<String,Boolean>();

    @BindView(R.id.activity_check_box_1)
    CheckBox checkbox1;

    @BindView(R.id.activity_check_box_2)
    CheckBox checkbox2;

    @BindView(R.id.activity_check_box_3)
    CheckBox checkbox3;

    @OnClick(R.id.activity_check_box_submit)
//    CheckBox    checkboxsubmit;
    public void  submit(View v){
        String s= "You Checked";
        for(Map.Entry<String,Boolean> entry: list.entrySet()){
            if(entry.getValue()){
                s=s+""+entry.getKey();
            }
        }
        shortToast(s);
    }
    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_check_box);
        ButterKnife.bind(this);
        checkbox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
                list.put(buttonView.getText().toString(),isChecked);
            }
        });

        checkbox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
                list.put(buttonView.getText().toString(),isChecked);
            }
        });
        checkbox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked){
                list.put(buttonView.getText().toString(),isChecked);
            }
        });
    }
}

