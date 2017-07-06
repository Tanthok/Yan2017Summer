package edu.gsu.httpscs.yan2017summer;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.gsu.httpscs.yan2017summer.dialog.CustomDialog;
import edu.gsu.httpscs.yan2017summer.fragment.DemoFragment;
import edu.gsu.httpscs.yan2017summer.fragment.WorkFragment;

/**
 * Created by TanSurface on 6/19/2017.
 */

public class WorkActivity extends BaseActivity {

        private int checkedID = 0;
        @BindView(R.id.activity_work_rdg)
        RadioGroup radioGroup;

        @OnClick(R.id.activity_work_ok)
        public void ok(View v) {
            switch (checkedID) {
                    case R.id.activity_work_custom:
                        CustomDialog customDialog =
                            new CustomDialog(this, new CustomDialog.ICustomDialongListener() {
                                @Override
                                public void onOKClicked(String msg) {
                                    shortToast(msg);
                                }
                });
                    //This ables the user to touch the empty space to go back
                    customDialog.setCanceledOnTouchOutside(true);
                    customDialog.show();
                    break;
                    default:
    }
        }

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.fragment_work);
                ButterKnife.bind(this);
                radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                        checkedID = checkedId;
                    }
                });

        }
    }



/*


    private void initialView() {
        bt_submit = (TextView) findViewById(R.id.activity_work_bt_submit);
        tv_work = (TextView) findViewById(R.id.activity_tool_work);

    }

    private void setListener() {
        final WorkFragment workFragment = new WorkFragment();
        final DemoFragment demoFragment = new DemoFragment();


//        "Work" way to make a clickable click reaction
        bt_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Toast is used for a Pop-up
                Toast.makeText(MainActivity.this,"You clicked demo",Toast.LENGTH_SHORT).show();
                tv_work.setTextColor(Color.BLACK); //Switch Color of Text Back and Forth
                bt_submit.setTextColor(Color.RED);   //Button "Work"
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.activity_main_fragment, demoFragment).commit();
            }
        });

    }
*/