package edu.gsu.httpscs.yan2017summer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Purpose:
 * of this activity is to have a
 * Methods that are called to in all Activities
 * */

public class BaseActivity extends AppCompatActivity {
    public void showToast(String s){
        Toast.makeText(this,s,Toast.LENGTH_SHORT).show();

    }
    //Is a method that can be called for a SHORT&LONG  Toast
    public void shortToast(String s){
        Toast.makeText(this,s,Toast.LENGTH_SHORT).show();
    }
    public void longToast(String s){
        Toast.makeText(this,s,Toast.LENGTH_LONG).show();
    }
    //Purpose is so that for each new activity we dont have to make a new "intent" keyword
    public void gotoActivity(Class c){
        Intent intent = new Intent(this,c);
        startActivity(intent);
    }
}
