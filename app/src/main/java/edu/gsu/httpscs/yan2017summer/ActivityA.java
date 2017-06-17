package edu.gsu.httpscs.yan2017summer;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Tan-AlienwareTower on 6/17/2017.
 */

public class ActivityA extends AppCompatActivity {

    @OnClick(R.id.test)
    public void click(View v){
        Toast.makeText(this,"click",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_a);
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
        ButterKnife.bind(this);
    }
}
