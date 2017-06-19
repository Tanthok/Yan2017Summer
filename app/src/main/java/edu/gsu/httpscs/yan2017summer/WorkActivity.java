package edu.gsu.httpscs.yan2017summer;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindString;
import butterknife.BindView;
import edu.gsu.httpscs.yan2017summer.fragment.DemoFragment;
import edu.gsu.httpscs.yan2017summer.fragment.WorkFragment;

/**
 * Created by TanSurface on 6/19/2017.
 */

public class WorkActivity extends BaseActivity {
    private TextView bt_submit;
    private TextView tv_work;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        initialView();
        setListener();

    }
    private void initialView() {
        bt_submit=(TextView)findViewById(R.id.activity_work_bt_submit);
        tv_work=(TextView)findViewById(R.id.activity_tool_work);

    }
    private void setListener() {
        final WorkFragment workFragment = new WorkFragment();
        final DemoFragment demoFragment = new DemoFragment();


//        "Work" way to make a clickable click reaction
        bt_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Toast is used for a Pop-up
                Toast.makeText(MainActivity.this,"You clicked demo",Toast.LENGTH_SHORT).show();*/
                tv_work.setTextColor(Color.BLACK); //Switch Color of Text Back and Forth
                bt_submit.setTextColor(Color.RED);   //Button "Work"
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.activity_main_fragment,demoFragment).commit();
            }
        });
//        "Demo" way to make a clickable click reaction
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                /*Toast is used for a Pop-up  */
                Toast.makeText(WorkActivity.this,"You clicked demo",Toast.LENGTH_SHORT).show();
//                tv_work.setTextColor(Color.RED);//Setting the ColorText of Buttons
//                tv_demo.setTextColor(Color.BLACK);//Button "Demo"
//                getSupportFragmentManager().beginTransaction()
//                        .replace(R.id.activity_main_fragment,workFragment).commit();
            }
        };
        tv_work.setOnClickListener(listener); //end of block two
    }
    //    login method-
//    Requirments- Same name as onClick under activity_main.xml, which is "login"
    public void login(View v){
        //Toast is what is going to pop-up
        Toast.makeText(WorkActivity.this,"You clicked login",Toast.LENGTH_SHORT).show();
    }
}
