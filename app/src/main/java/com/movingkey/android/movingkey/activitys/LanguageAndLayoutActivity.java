package com.movingkey.android.movingkey.activitys;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.movingkey.android.movingkey.R;
import com.movingkey.android.movingkey.customLib.LangAndLayout;
import com.movingkey.android.movingkey.customLib.MovingKeyLib;
import com.movingkey.android.movingkey.customLib.MovingKeySetting;

public class LanguageAndLayoutActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language_and_layout);

        loadLanguageSettings();
    }


    void loadLanguageSettings()
    {
        final MovingKeyLib mvlib = MovingKeyLib.getSharedObj();

        if (mvlib.func01_getSharedSetting() == null)
        {
            mvlib.func02_loadMovingKeySettingFromFileAndLoadMemory(LanguageAndLayoutActivity.this);
        }

        MovingKeySetting curSetting = mvlib.func01_getSharedSetting();


        if( curSetting.setting04_selectedSetGroup.size() > 0 )
        {
            for(int i=0; i < curSetting.setting04_selectedSetGroup.size() ; i++)
            {
                LangAndLayout oneLangAndLayout = curSetting.setting04_selectedSetGroup.get(i);

                Log.d("HWI","언어 : "+oneLangAndLayout.language+" 레이아웃 : "+oneLangAndLayout.layout);

            }


        }
        else
        {
            Log.e("HWI","문제 발생 --> 선택한 언어+레이아웃 조합이 한개도 없는 경우는 있을 수 없습니다");
        }
    }




}
