package edu.gsu.httpscs.yan2017summer.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.ArrayList;

import edu.gsu.httpscs.yan2017summer.R;

/**
 * Created by Tan-AlienwareTower on 6/17/2017.
 */

public class AdvanceListViewAdapter extends BaseAdapter {

    private final Context context;
    private final ArrayList<String> list;
    private final LayoutInflater inflater;

    public AdvanceListViewAdapter(Context context, ArrayList<String> list) {
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
        Log.d("ViewHolder","getView"); //Show how many time system calls getView Method in "Android Monitor"
        ViewHolder viewHolder = new ViewHolder();
        if(convertView == null){
            convertView = inflater.inflate(R.layout.activity_advance_list_item, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.rl_odd = (RelativeLayout) convertView.findViewById(R.id.odd);    //the findViewById converts the id to a java class
            viewHolder.rl_even = (RelativeLayout) convertView.findViewById(R.id.even);
            viewHolder.tv = (TextView)convertView.findViewById(R.id.activity_advance_list_item_tv);
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder) convertView.getTag();
        }

         viewHolder.tv.setText(list.get(position));
            if (position%2==0) {
                //Message from you
                viewHolder.rl_odd.setVisibility(View.INVISIBLE);
                viewHolder.rl_even.setVisibility(View.VISIBLE);
                viewHolder.tv.setBackgroundResource(R.drawable.chatfrom_bg_focused);
            }else{
                //Message from your friend
                viewHolder.rl_odd.setVisibility(View.VISIBLE);
                viewHolder.rl_even.setVisibility(View.INVISIBLE);
                viewHolder.tv.setBackgroundResource(R.drawable.chatfrom_bg_focused);
            }
            return convertView;
    }
    private class ViewHolder{
        RelativeLayout rl_odd;
        RelativeLayout rl_even;
        TextView tv;
    }
}