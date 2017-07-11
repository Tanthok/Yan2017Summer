package edu.gsu.httpscs.yan2017summer;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.util.Pair;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;


import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import edu.gsu.httpscs.yan2017summer.adapter.AdvanceListViewAdapter;
import edu.gsu.httpscs.yan2017summer.adapter.ViewFragmentStateAdapter;
import edu.gsu.httpscs.yan2017summer.fragment.BlueFragment;
import edu.gsu.httpscs.yan2017summer.fragment.GreenFragment;
import edu.gsu.httpscs.yan2017summer.fragment.RedFragment;

public class AdvanceListViewActivity extends BaseActivity  {

    @BindView(R.id.activity_advance_list_view)
    ListView lv;

    @BindView(R.id.advance_list_view_pager)
    ViewPager viewPager;

//    private ArrayList<Pair<String,Fragment>> list2 = new ArrayList<Pair<String,Fragment>>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance);
        ButterKnife.bind(this);
        ArrayList<Pair<String,Fragment>> list2 = new ArrayList<Pair<String,Fragment>>();
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("Hello, how are you?");
        list.add("I am fine, thank you");
        list.add("Hello");
        list.add("Hello");
        list.add("Hello");
        list.add("Hello");
        list.add("Hello");
        list.add("Hello");
        list.add("Hello");
        list.add("Hello");
        list.add("Hello");
        list.add("Hello");
        AdvanceListViewAdapter adapter = new AdvanceListViewAdapter(this, list);
        lv.setAdapter(adapter);
//        Quiz 4 Stuff
        list2.add(new Pair<String, Fragment>("Red",new RedFragment()));
        list2.add(new Pair<String, Fragment>("Red",new BlueFragment()));
        list2.add(new Pair<String, Fragment>("Red",new GreenFragment()));
        ViewFragmentStateAdapter adapter2 =
                new ViewFragmentStateAdapter(this.getSupportFragmentManager(),list2);
        viewPager.setAdapter(adapter2);

//        Quiz 4 Stuff
//Add a Title to the Top of the Advance List
        //TextView tv = new TextView(this);
        //tv.setText("HeaderView");
        //tv.setTextSize(50);
        //lv.addHeaderView(tv);
//adds a Title to the Bottom of the Advance List
        TextView tv1 = new TextView(this);
        tv1.setText("FooterView");
        tv1.setTextSize(50);
        lv.addFooterView(tv1);

        //Shows a pop up for the position of the list/position of each of the Strings
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    showToast(String.valueOf(position));

            }
        });
    }
}
