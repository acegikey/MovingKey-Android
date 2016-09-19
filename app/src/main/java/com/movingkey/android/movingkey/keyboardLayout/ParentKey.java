package com.movingkey.android.movingkey.keyboardLayout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/**
 * Created by iankim on 2016. 9. 19..
 */
public class ParentKey extends RelativeLayout
{
    Context context;

    int matrixX;
    int matrixY;

    String keyString;
    String layoutType;

    public ParentKey(Context context)
    {
        super(context);
        init(context);
    }

    public ParentKey(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        init(context);
    }

    public ParentKey(Context context, AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    public void init(Context context)
    {
        this.context = context;

    }


}
