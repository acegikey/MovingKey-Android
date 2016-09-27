package com.movingkey.android.movingkey.keyboardLayout;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.movingkey.android.movingkey.R;

/**
 * Created by iankim on 2016. 9. 26..
 */
public class ChildKey extends ParentKey implements View.OnTouchListener
{
    TextView keyTextV;

    float firstLeftMargin;
    float firstTopMargin;

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

        setOnTouchListener(this);

    }


    public void setTextView(final String keyString)
    {
        this.keyString = keyString;

        this.post(new Runnable()
        {
            @Override
            public void run()
            {
                RelativeLayout.LayoutParams layoutparamForTV = new RelativeLayout.LayoutParams(ChildKey.this.getWidth(),ChildKey.this.getHeight());

                Log.d("HWI","크기 확인 --> layoutparamForTV.width : "+layoutparamForTV.width+",  layoutparamForTV.height : "+layoutparamForTV.height);

                ChildKey.this.keyTextV.setLayoutParams(layoutparamForTV);
                ChildKey.this.keyTextV.setText(keyString);
                ChildKey.this.keyTextV.setGravity(Gravity.CENTER);
                ChildKey.this.keyTextV.setTextColor(0xff4188c7);
                ChildKey.this.keyTextV.setTextSize(TypedValue.COMPLEX_UNIT_PX,(int)(Math.round(ChildKey.this.getHeight() * 2.0 / 5.0)));
                ChildKey.this.setBackgroundResource(R.drawable.rectangle_2);

                ChildKey.this.firstLeftMargin = ((LayoutParams)(ChildKey.this.getLayoutParams())).leftMargin;
                ChildKey.this.firstLeftMargin = ((LayoutParams)(ChildKey.this.getLayoutParams())).rightMargin;

            }
        });

    }



    float firstEnterTouchX;
    float firstEnterTouchY;

    @Override
    public boolean onTouch(View view, MotionEvent event)
    {
        float eventX = event.getX();
        float eventY = event.getY();


        // get masked (not specific to a pointer) action
        int maskedAction = event.getActionMasked();

        Log.d("HWI","좌표 추적 --> X : "+eventX+"  Y : "+eventY);

        switch (maskedAction)
        {

            case MotionEvent.ACTION_DOWN:
            {
                firstEnterTouchX = eventX;
                firstEnterTouchX = eventY;
                break;
            }
            case MotionEvent.ACTION_MOVE:
            {
                 float changeX = eventX - firstEnterTouchX;
                float changey = eventY - firstEnterTouchY;
                break;
            }
            case MotionEvent.ACTION_UP:
            {
                break;
            }
            case MotionEvent.ACTION_POINTER_UP:
            {
                break;
            }
            case MotionEvent.ACTION_CANCEL:
            {

                break;
            }
        }


        invalidate();




        return true;
    }
}
