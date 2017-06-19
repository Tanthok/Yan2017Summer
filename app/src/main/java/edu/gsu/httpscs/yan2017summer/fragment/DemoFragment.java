package edu.gsu.httpscs.yan2017summer.fragment;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import edu.gsu.httpscs.yan2017summer.AdvanceListViewActivity;
import edu.gsu.httpscs.yan2017summer.AdvanceViewPagerActivity;
import edu.gsu.httpscs.yan2017summer.LaunchModeActivity;
import edu.gsu.httpscs.yan2017summer.NotificationActivity;
import edu.gsu.httpscs.yan2017summer.R;
import edu.gsu.httpscs.yan2017summer.ScaleTypeActivity;
import edu.gsu.httpscs.yan2017summer.ViewPagerActivity;
import edu.gsu.httpscs.yan2017summer.adapter.ListNormalAdapter;

public class DemoFragment extends Fragment {

    private final ArrayList<String> contentList;
    private final Context context;
    private ListView listView;

    public DemoFragment() {
//        Fake Content
        context = getContext();
        contentList = new ArrayList<String>();
        contentList.add("ViewPager");
        contentList.add("ImageScaleType");
        contentList.add("9Patch");
        contentList.add("Notification");
        contentList.add("AdvanceListView");
        contentList.add("AdvanceViewPager");
        contentList.add("LaunchMode");
        contentList.add("E");
        contentList.add("F");
        contentList.add("G");
        contentList.add("H");
        contentList.add("I");
        contentList.add("J");
        contentList.add("K");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle saveInstanceState) {

        View view = inflater.inflate(R.layout.fragment_demo, container, false);
        listView = (ListView) view.findViewById(R.id.fragment_demo_lv);//Getting ID number of specific page of this ListView
        ListNormalAdapter adapter = new ListNormalAdapter(this.getContext(), contentList);//Pulling Content from specific View ID
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                This is list of Activities the user can pick from
                switch (position) {
                    case 0:
                        Intent intent = new Intent(getActivity(), ViewPagerActivity.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(getActivity(), ScaleTypeActivity.class);
                        startActivity(intent1);
                        break;
                    case 3:
                        Intent intent3 = new Intent(getActivity(), NotificationActivity.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(getActivity(), AdvanceListViewActivity.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(getActivity(), AdvanceViewPagerActivity.class);
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(getActivity(), LaunchModeActivity.class);
                        startActivity(intent6);
                    default:
                }
            }
        });
        return view; /*For Testing Purpose
        "return= (ListView)view.findViewById(R.id.fragment_demo_lv);//Getting ID number of specific page
        Can be used to show and empty view*/
    }
}

