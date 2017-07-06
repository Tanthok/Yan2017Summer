package edu.gsu.httpscs.yan2017summer.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.IntDef;
import android.support.annotation.Nullable;

import java.util.Timer;
import java.util.TimerTask;

import edu.gsu.httpscs.yan2017summer.util.UtilLog;

/**
 * Created by TanSurface on 7/3/2017.
 */

public class TestService extends Service {
    private Timer timer;
    private int update = 0;
    public static final String UPDATE ="update";
    public static final String ACTION ="TextAction";

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        try{
            Thread.sleep(30000);
        }catch(InterruptedException e){
//            e.print   MISSING THIS
        }
        String value = intent.getStringExtra("Service");
        //This is a Homework
        if(value.equals("Start")){
            timer.schedule(new UpdateTask(),0,2000);
        }else{
            timer.cancel();
        }
        return super.onStartCommand(intent, flags, startId);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    private class UpdateTask extends TimerTask{
        public void run(){
            Intent intent = new Intent();
            intent.setAction(ACTION);
            intent.putExtra(UPDATE,++update);
            sendBroadcast(intent);
            UtilLog.d("Service",update+"");
        }
    }
}
