package edu.gsu.httpscs.yan2017summer.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;

import java.util.ArrayList;

import edu.gsu.httpscs.yan2017summer.R;

/**
 * Created by Tan-AlienwareTower on 6/17/2017.
 */

public class AdcanceListViewAdapter extends BaseAdapter {

    private final Context context;
    private final ArrayList<String> list;
    private final LayoutInflater inflater;

    public AdcanceListViewAdapter(Context context, ArrayList<String> list) {
        this.context = context;
        this.list = list;
        inflater = (LayoutInflater)context.getSystemService
                (Context.LAYOUT_INFLATER_SERVICE);
    }
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
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.activity_advance_list_item, parent, false);
        RelativeLayout rl_odd = (RelativeLayout) convertView.findViewById(R.id.odd);
        RelativeLayout rl_even = (RelativeLayout) convertView.findViewById(R.id.even);
        return convertView;
    }
}
