package com.movingkey.android.movingkey.customLib;

import android.view.KeyEvent;

import com.movingkey.android.movingkey.services.InputMethodServiceMovingKey;

/**
 * Created by hwi on 2016. 9. 29..
 */
public class MVInputManager
{
    public InputMethodServiceMovingKey ims;


    private static MVInputManager mvip;



    public static MVInputManager getSharedObj()
    {
        if(mvip == null)
        {
            mvip = new MVInputManager();
        }

        return mvip;
    }


    public void addNormalText(String inputText)
    {
        ims.getCurrentInputConnection().commitText(inputText,1);

    }

    public void delete()
    {
        ims.getCurrentInputConnection().sendKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN,KeyEvent.KEYCODE_DEL));

    }



}
