package edu.gsu.httpscs.yan2017summer.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.view.View;
import android.app.Dialog;

import butterknife.ButterKnife;
import butterknife.OnClick;
import edu.gsu.httpscs.yan2017summer.R;
//*Inorder to do a Custom Dialog you must,
// create your style in the style folder, so you can make the call "R.style.dialog"*/
public class CustomDialog extends Dialog {

    private final ICustomDialongListener listener;

    public interface ICustomDialongListener{
        public void onOKClicked(String msg);
//        public void onCancleCLicked();
    }
    @OnClick(R.id.dialog_custom_ok)
    //OnClick always has to have a public method after
    public void ok(View view){
        listener.onOKClicked("You clicked OK");
        cancel();
    }
    public CustomDialog(@NonNull Context context, ICustomDialongListener listener){
        super(context, R.style.dialog);
        setContentView(R.layout.dialog_custom);
        ButterKnife.bind(this);
        this.listener = listener;
    }
}

