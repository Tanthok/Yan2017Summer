package edu.gsu.httpscs.yan2017summer;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class ScaleTypeActivity extends AppCompatActivity {

    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_scale_type);   //Video 8 @ 1:12
        viewPager = (ViewPager) findViewById(R.id.activity_scale_view_pager);
        //After making the viewpager, next make adapter for viewPager  Called "ScalePagerAdapter w/ super class PagerAdapter

    }
}
