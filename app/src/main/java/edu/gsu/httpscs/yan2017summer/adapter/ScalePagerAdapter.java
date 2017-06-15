package edu.gsu.httpscs.yan2017summer.adapter;

import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by Tan-AlienwareTower on 6/15/2017.
 * Step One Impliment method from give option(red)
 */

public class ScalePagerAdapter extends PagerAdapter {
    private final ArrayList<View> list;
    public ScalePagerAdapter(ArrayList<View> list) {
        this.list=list;
    }
    @Override
    public int getCount() {
        return list.size();
    }
    @Override
    public boolean isViewFromObject(View view, Object object) {
        return false;
    }
    @Override
    public void destroyItem(ViewGroup container, int position, Object object){
        container.removeView(list.get(position));   //given when generated

    }

    @Override
    public Object instantiateItem(ViewGroup container, int position){
        container.addView(list.get(position),0); //given when generated
        return list.get(position);  //given when generated
    }
}
