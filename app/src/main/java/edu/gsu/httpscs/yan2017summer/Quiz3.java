package edu.gsu.httpscs.yan2017summer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.gsu.httpscs.yan2017summer.dialog.CustomDialog;
import edu.gsu.httpscs.yan2017summer.dialog.CustomDialog2;

public class Quiz3 extends BaseActivity {

    @OnClick(R.id.activity_work_bt_submit)
    public void start(View v){
        Intent startNewActivity = new Intent(this, Quiz5Activity.class);
        startActivity(startNewActivity);
    }
    @OnClick(R.id.activity_quiz3_quiz1bt)
    public void ok(View v) {

        CustomDialog2 customDialog =
                new CustomDialog2(this, new CustomDialog2.ICustomDialongListener() {
                    @Override
                    public void onOKClicked(String msg) {
                        shortToast(msg);
                    }
                });
        //This ables the user to touch the empty space to go back
        customDialog.setCanceledOnTouchOutside(true);
        customDialog.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz3);
        ButterKnife.bind(this);

    }



}
