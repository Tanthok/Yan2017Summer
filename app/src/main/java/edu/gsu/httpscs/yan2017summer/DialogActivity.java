package edu.gsu.httpscs.yan2017summer;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.support.annotation.IdRes;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.gsu.httpscs.yan2017summer.dialog.CustomDialog;

import static edu.gsu.httpscs.yan2017summer.R.style.dialog;

public class DialogActivity extends BaseActivity {
    private int checkedID = 0;
    @BindView(R.id.activity_dialog_rdg)
    RadioGroup radioGroup;

    @OnClick(R.id.activity_dialog_ok)
    public void ok(View v) {
        switch (checkedID) {
            case R.id.activity_dialog_rb1:
                normalDialog();
                break;
            case R.id.activity_dialog_rb2:
//                listDialog();
                break;
            case R.id.activity_dialog_rb3:
//                singleChoiceDialog();
                break;
            case R.id.activity_dialog_rb4:
//                multiChoiceDialog();
                break;
            case R.id.activity_dialog_rb5:
//                waitingDialog();
                break;
            case R.id.activity_dialog_rb6:
//                progressDialog();
                break;
            case R.id.activity_dialog_rb7:
//                inputDialog();
                break;
            case R.id.activity_dialog_rb8:
                CustomDialog customDialog =
                        new CustomDialog(this, new CustomDialog.ICustomDialongListener() {
                            @Override
                            public void onOKClicked(String msg) {
                                shortToast(msg);
                            }
                        });
                customDialog.setCanceledOnTouchOutside(true);       //This ables the user to touch the empty space to go back
                customDialog.show();
                break;
            default:
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);
        ButterKnife.bind(this);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
                checkedID = checkedId;
            }
        });
    }

    private void normalDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setIcon(R.mipmap.ic_launcher);
        builder.setTitle("AlertTitle");
        builder.setMessage("This is a normal Dialog");
        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                shortToast("You click Yes");
            }
        });
        builder.setNeutralButton("Neutral", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                shortToast("You click Neutral");
            }
        });
        builder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                shortToast("You click Cancel");
            }
        });
        builder.show();
    }

//    ProgessDialog waitingDialog;
//    private void waitingDialog(){
//        waitingDialog = new ProgressDialog(this);
//        waitingDialog.setTitle("Downloading");
//        waitingDialog.setMessage("Waiting...");
//            waitingDialog.setCancelable(false);
//        waitingDialog.setCancelable(true);
//        waitingDialog.show();
////        waitDialog.setOnDismissListener((dialog))
//    }
}