package com.movingkey.android.movingkey.keyboardLayout;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by iankim on 2016. 9. 19..
 */
public class SmallTextV extends TextView
{
    Context context;

    int matrixX;
    int matrixY;
    String keyString;

    public SmallTextV(Context context)
    {
        super(context);
        init(context);
    }

    public SmallTextV(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        init(context);
    }

    public SmallTextV(Context context, AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    public void init(Context context)
    {
        this.context = context;
    }
}
