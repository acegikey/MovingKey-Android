package com.movingkey.android.movingkey.customLib;

import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

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

}
