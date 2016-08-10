package com.movingkey.android.movingkey.keyboardLayout;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.RelativeLayout;

/**
 * Created by iankim on 2016. 8. 10..
 */
public class KeyboardContainerLayout extends RelativeLayout
{
    public KeyboardContainerLayout(Context context)
    {
        super(context);
        init(context);
    }

    public KeyboardContainerLayout(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        init(context);
    }

    public KeyboardContainerLayout(Context context, AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
        init(context);
    }


    public void init(Context context)
    {
        Log.d("HWI","KeyboardContainerLayout --> init() --> 호출 확인");

    }




}
