package edu.gsu.httpscs.yan2017summer;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Tan-AlienwareTower on 6/16/2017.
 */

public class LaunchModeActivity extends AppCompatActivity {

//    @BindView(R.id.test)      
//    TextView test;
    @OnClick(R.id.test)
    public void click(View v){
        Toast.makeText(this,"click", Toast.LENGTH_SHORT);

    }
//    private TextView tv;       "Long way" part

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_mode);
        Toast.makeText(this,"onCreate", Toast.LENGTH_SHORT);
        ButterKnife.bind(this);
//  Long way to set a onClick
//        tv = (TextView) findViewById(R.id.test);
//        tv.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v){
//            Toast.makeText(LaunchModeActivity.this,"click", Toast.LENGTH_SHORT).show();
//        }
//    });
    }
}
