package com.movingkey.android.movingkey.keyboardLayout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

import com.movingkey.android.movingkey.customLib.Const;
import com.movingkey.android.movingkey.customLib.MVInputManager;

/**
 * Created by iankim on 2016. 9. 19..
 */
public class ParentKey extends RelativeLayout implements View.OnClickListener
{
    Context context;
    public ChildKey childKey;

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


    @Override
    public void onClick(View view)
    {
        if(childKey.keyType == Const.KeyType.NORMAL)
        {
            MVInputManager.getSharedObj().addNormalText(childKey.keyString);
        }
        else if(childKey.keyType == Const.KeyType.DEL)
        {
            MVInputManager.getSharedObj().delete();
        }
    }
}
