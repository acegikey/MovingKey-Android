package com.movingkey.android.movingkey.customLib;

import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;

/**
 * Created by hwi on 2016. 9. 29..
 */
public class MVInputManager
{

    public InputConnection ipc;

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
        ipc.commitText(inputText,1);
    }

    public void delete()
    {
        ipc.sendKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN,KeyEvent.KEYCODE_DEL));
    }



}
