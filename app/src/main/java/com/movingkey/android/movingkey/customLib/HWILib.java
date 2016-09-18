package com.movingkey.android.movingkey.customLib;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.Random;

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


    public void func02_setListViewHeightBasedOnChildren(ListView listView)
    {
        ListAdapter listAdapter = listView.getAdapter();

        if (listAdapter == null)
        {
            // pre-condition
            return;
        }

        int desiredWidth = View.MeasureSpec.makeMeasureSpec(listView.getWidth(), View.MeasureSpec.UNSPECIFIED);
        int totalHeight=0;
        View view = null;

        for (int i = 0; i < listAdapter.getCount(); i++)
        {
            view = listAdapter.getView(i, view, listView);

            if (i == 0)
                view.setLayoutParams(new ViewGroup.LayoutParams(desiredWidth, ViewGroup.LayoutParams.MATCH_PARENT));

            view.measure(desiredWidth, View.MeasureSpec.UNSPECIFIED);
            totalHeight += view.getMeasuredHeight();

        }

        ViewGroup.LayoutParams params = listView.getLayoutParams();
        params.height = totalHeight + ((listView.getDividerHeight()) * (listAdapter.getCount()));

        Log.d("HWI","계산된 세로 크기 : "+params.height);
        listView.setLayoutParams(params);
        listView.requestLayout();

    }

    public int func03_getScreenSizeWidth(Context context)
    {
        DisplayMetrics metrics = context.getResources().getDisplayMetrics();
        int width = metrics.widthPixels;

        return width;
    }

    public int func03_getScreenSizeHeight(Context context)
    {
        DisplayMetrics metrics = context.getResources().getDisplayMetrics();
        int height = metrics.heightPixels;

        return height;
    }

    public int func04_getRandomColor()
    {
        Random rnd = new Random();
        int color = Color.argb(200, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        return color;
    }

    public int func05_getStatusBarHeight(Context context)
    {
        int statusBarHeight = 0;
        int resourceId = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            statusBarHeight = context.getResources().getDimensionPixelSize(resourceId);
        }

        return statusBarHeight;
    }

}
