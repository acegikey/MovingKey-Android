package com.movingkey.android.movingkey.customLib;

import android.os.Handler;

/**
 * Created by hwi on 2016. 8. 12..
 */
public class HWILib
{
    private static HWILib sharedObj;


    public static HWILib getSharedObj()
    {
        if (sharedObj == null)
        {
            sharedObj = new HWILib();
        }

        return sharedObj;
    }


    public void func01_runOnDelay(Runnable runnable, long millisecond)
    {
        final Handler handler = new Handler();
        handler.postDelayed(runnable, millisecond);
    }
}
