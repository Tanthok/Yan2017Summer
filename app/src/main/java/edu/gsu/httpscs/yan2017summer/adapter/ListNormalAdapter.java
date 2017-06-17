package edu.gsu.httpscs.yan2017summer.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import edu.gsu.httpscs.yan2017summer.R;

/**
 ListNormalAdapter is Java file in a Package, next
 SuperClass is BaseAdapter, next
 To get Methods alt+enter
 Purpose is to pull information for Tabs
 */

public class ListNormalAdapter extends BaseAdapter {
    private final Context context;
    private final LayoutInflater inflater;
    private final ArrayList<String> list;

    public ListNormalAdapter(Context context, ArrayList<String> list){
        this.context = context;
        this.list = list;
        //Reason4 inflater.. helps on Convert a Layout to a View
        inflater = (LayoutInflater)context.getSystemService
                (Context.LAYOUT_INFLATER_SERVICE);
    }
    //for STATIC   --Sets the Number on Items Ex.) "return 100" would have 100 items
    // for DYNAMIC --we add ArrayList<String> as parameter
    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }


    @Override//"getView" gets different View Taps you can navigate thou, ex.)ViewPager,ImageScaleType
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.list_normal_item, parent,false);
        TextView tv=(TextView) convertView.findViewById(R.id.item_normal_tv);
        tv.setText(list.get(position)); //Used for a Dynamic set of items
        //tv.setText("Text"); used for a Static set of items
        return tv;
//  Next we made a layout to put this pulled information into
    }
}
