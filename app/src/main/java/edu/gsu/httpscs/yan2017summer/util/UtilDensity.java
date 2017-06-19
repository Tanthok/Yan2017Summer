package edu.gsu.httpscs.yan2017summer.util;

import android.content.Context;

/**
Purpose:

 */

public class UtilDensity {
    public static int dip2px(Context context, float dpValue){
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue *scale + 0.5f);
    }
    public static int px2dip(Context context, float dpValue){
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue *scale + 0.5f);

    }
}
