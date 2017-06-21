package edu.gsu.httpscs.yan2017summer;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.Toast;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Tan-AlienwareTower on 6/21/2017.
 */

public class ActivityB extends AppCompatActivity {


//    @OnClick



    public void gotoAActivity(View v){
        Intent intent = new Intent(this, ActivityA.class);
        startActivity(intent);
    }
    public void gotoBActivity(View v){
        Intent intent = new Intent(this, ActivityB.class);
        startActivity(intent);
    }
    public void gotoCActivity(View v){
        Intent intent = new Intent(this, ActivityC.class);
        startActivity(intent);
    }
    public void gotoDActivity(View v){
        Intent intent = new Intent(this, ActivityD.class);
        startActivity(intent);
    }
    @Override
    protected void onNewIntent(Intent intent){
        super.onNewIntent(intent);
        Toast.makeText(this, "onNewIntent", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);
        Toast.makeText(this, "onCreate", Toast.LENGTH_SHORT).show();
    }
}
