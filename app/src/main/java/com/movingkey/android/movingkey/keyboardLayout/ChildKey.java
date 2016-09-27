package com.movingkey.android.movingkey.keyboardLayout;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by iankim on 2016. 9. 26..
 */
public class ChildKey extends ParentKey
{
    TextView keyTextV;

    public ChildKey(Context context)
    {
        super(context);
    }

    public ChildKey(Context context, AttributeSet attrs)
    {
        super(context, attrs);
    }

    public ChildKey(Context context, AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void init(Context context)
    {
        super.init(context);

        keyTextV = new TextView(context);
        addView(keyTextV);

    }


    public void setTextView()
    {
        this.post(new Runnable()
        {
            @Override
            public void run()
            {
                RelativeLayout.LayoutParams layoutparamForTV = new RelativeLayout.LayoutParams(ChildKey.this.getWidth(),ChildKey.this.getHeight());

                Log.d("HWI","크기 확인 --> layoutparamForTV.width : "+layoutparamForTV.width+",  layoutparamForTV.height : "+layoutparamForTV.height);

                ChildKey.this.keyTextV.setLayoutParams(layoutparamForTV);
                ChildKey.this.keyTextV.setText(ChildKey.this.keyString);
                ChildKey.this.keyTextV.setGravity(Gravity.CENTER);
                ChildKey.this.keyTextV.setTextColor(0xff4188c7);
                ChildKey.this.keyTextV.setTextSize(TypedValue.COMPLEX_UNIT_PX,(int)(Math.round(ChildKey.this.getHeight() * 2.0 / 5.0)));
            }
        });


    }
}
