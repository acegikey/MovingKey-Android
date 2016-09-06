package com.movingkey.android.movingkey.customLib;

import android.os.Handler;
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


    public void func02_setListViewHeightBasedOnChildren(ListView listView) {
        ListAdapter listAdapter = listView.getAdapter();
        if (listAdapter == null) {
            // pre-condition
            return;
        }

        int totalHeight = 0;
        for (int i = 0; i < listAdapter.getCount(); i++)
        {
            View listItem = listAdapter.getView(i, null, listView);
            listItem.measure(0, 0);
            totalHeight += listItem.getMeasuredHeight();
        }

        totalHeight += listView.getPaddingTop() + listView.getPaddingBottom();

        ViewGroup.LayoutParams params = listView.getLayoutParams();
        params.height = totalHeight + (listView.getDividerHeight() * (listAdapter.getCount() - 1));
        listView.setLayoutParams(params);
        listView.requestLayout();
    }
}
