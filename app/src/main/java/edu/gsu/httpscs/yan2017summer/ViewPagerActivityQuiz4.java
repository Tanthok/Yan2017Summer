package edu.gsu.httpscs.yan2017summer;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import edu.gsu.httpscs.yan2017summer.adapter.AdvanceListViewAdapter;
import edu.gsu.httpscs.yan2017summer.adapter.BaseViewPagerAdapter;
import edu.gsu.httpscs.yan2017summer.fragment.BlueFragment;
import edu.gsu.httpscs.yan2017summer.fragment.GreenFragment;
import edu.gsu.httpscs.yan2017summer.fragment.RedFragment;

public class ViewPagerActivityQuiz4 extends BaseActivity {
    private ViewPager viewPager;
    private ArrayList<Fragment> list = new ArrayList<Fragment>() ;//don't pick Fragment app one only for android 5 up

    @BindView(R.id.activity_advance_list_view) ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager_quiz4);
        Toast.makeText(this,"onCreate",Toast.LENGTH_SHORT).show();
        Log.d("LifeCycle","onCreate");
        viewPager = (ViewPager)findViewById(R.id.activity_view_pager_quiz4);
        //This is the Create of a Fragment Having Three Pages Green,Red,Blue
        list.add(new RedFragment());
        list.add(new GreenFragment());
        list.add(new BlueFragment());
        BaseViewPagerAdapter pagerAdapter = new BaseViewPagerAdapter(getSupportFragmentManager(),list);
        viewPager.setAdapter(pagerAdapter);
        viewPager.setNestedScrollingEnabled(true);
        viewPager.setCurrentItem(1); //Is a way to set what page you want the user to see first with in a fragment
//        starting the chat part
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
//more content here
        AdvanceListViewAdapter adapter = new AdvanceListViewAdapter(this, list);
        lv.setAdapter(adapter);

    }
    public ViewPagerActivityQuiz4() {
        super();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle","OnStart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeCycle","onResume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCycle","onPause");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle","onStop");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle","onDestroy");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LifeCycle","onRestart");
    }

}
