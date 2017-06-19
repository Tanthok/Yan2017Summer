package edu.gsu.httpscs.yan2017summer;

import android.app.Application;

import edu.gsu.httpscs.yan2017summer.util.UtilLog;

/**
 * Created by TanSurface on 6/19/2017.
 */

public class YanApplication extends Application {
    @Override
    public void onCreate(){
        super.onCreate();
        UtilLog.setIsLog(true);
    }
}
