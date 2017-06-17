package edu.gsu.httpscs.yan2017summer;

import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 The purpose of this activity is to have a
 fast way of calling a flexiable Toast for all acitivities
 * */

public class BaseActivity extends AppCompatActivity {
    public void showToast(String s){
        Toast.makeText(this,s,Toast.LENGTH_SHORT).show();

    }
}
