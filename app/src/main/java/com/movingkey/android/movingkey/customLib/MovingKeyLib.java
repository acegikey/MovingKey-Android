package com.movingkey.android.movingkey.customLib;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

/**
 * Created by iankim on 2016. 8. 10..
 */
public class MovingKeyLib
{
    private static MovingKeyLib sharedInstance;

    private MovingKeySetting settingInMemory;

    public static MovingKeyLib getSharedObj()
    {
        if(sharedInstance == null)
        {
            sharedInstance = new MovingKeyLib();
        }
        return sharedInstance;
    }



    public MovingKeySetting func01_getSharedSetting()
    {
        return  settingInMemory;
    }



    public void func02_loadMovingKeySettingFromFileAndLoadMemory(Context context)
    {
        SharedPreferences pref = context.getSharedPreferences("MovingKey",Context.MODE_PRIVATE);




        /// 사용자의 설정이 전혀 없을 경우 디폴트값으로 지정할 디폴트 객제 생성
        MovingKeySetting defaultSettingGroup = new MovingKeySetting();
        defaultSettingGroup.setting01_lastSelectedLang = "en";
        defaultSettingGroup.setting02_lastSelectedLayout = "qwerty";
        defaultSettingGroup.setting03_lastSelectedDesign = "default";

        defaultSettingGroup.setting04_selectedSetGroup = new ArrayList<LangAndLayout>();



        LangAndLayout defalutLangAndLayout = new LangAndLayout();
        defalutLangAndLayout.language = "en";
        defalutLangAndLayout.layout = "qwerty";

        defaultSettingGroup.setting04_selectedSetGroup.add(defalutLangAndLayout);



        defaultSettingGroup.setting05_isBalloonViewShow = "YES";
        defaultSettingGroup.setting06_keyboardSize = "Medium";











        Gson gson = new Gson();
        String jsonString_setting04_selectedSetGroup = gson.toJson(defaultSettingGroup.setting04_selectedSetGroup);


        /// 사용자가 저장한 마지막 선택 언어와 레이아웃을 가져온다 --> 만약에 아무것도 없을 경우 기본은 ( 영어 , QWERTY, 디폴트 디자인 ) 으로 한다.
        String setting01_lastSelectedLang = pref.getString("setting01_lastSelectedLang",defaultSettingGroup.setting01_lastSelectedLang);
        String setting02_lastSelectedLayout = pref.getString("setting02_lastSelectedLayout",defaultSettingGroup.setting02_lastSelectedLayout);
        String setting03_lastSelectedDesign = pref.getString("setting03_lastSelectedDesign",defaultSettingGroup.setting03_lastSelectedDesign);
        String setting04_selectedSetGroup = pref.getString("setting04_selectedSetGroup",jsonString_setting04_selectedSetGroup);
        String setting05_isBalloonViewShow = pref.getString("setting05_isBalloonViewShow",defaultSettingGroup.setting05_isBalloonViewShow);

        Type collectionType = new TypeToken<ArrayList<LangAndLayout>>(){}.getType();



        //// 메모리에 데이터를 로드한다
        settingInMemory = new MovingKeySetting();
        settingInMemory.setting01_lastSelectedLang = setting01_lastSelectedLang;
        settingInMemory.setting02_lastSelectedLayout = setting02_lastSelectedLayout;
        settingInMemory.setting03_lastSelectedDesign = setting03_lastSelectedDesign;
        settingInMemory.setting04_selectedSetGroup = gson.fromJson(setting04_selectedSetGroup,collectionType);
        settingInMemory.setting05_isBalloonViewShow = setting05_isBalloonViewShow;
    }


    public void func03_saveCurrentMemorySettingToFile(Context context)
    {
        if(settingInMemory != null && settingInMemory.setting01_lastSelectedLang != null)
        {

            SharedPreferences.Editor editor = context.getSharedPreferences("MovingKey",Context.MODE_PRIVATE).edit();
            editor.putString("setting01_lastSelectedLang",settingInMemory.setting01_lastSelectedLang);
            editor.putString("setting02_lastSelectedLayout",settingInMemory.setting02_lastSelectedLayout);
            editor.putString("setting03_lastSelectedDesign",settingInMemory.setting03_lastSelectedDesign);

            Gson gson = new Gson();
            String jsonString_setting04_selectedSetGroup = gson.toJson(settingInMemory.setting04_selectedSetGroup);

            editor.putString("setting01_lastSelectedLang",jsonString_setting04_selectedSetGroup);

            editor.commit();
        }
        else
        {
            Toast.makeText(context,"settingInMemory 또는 settingInMemory.setting01_lastSelectedLang가 null 입니다.",Toast.LENGTH_SHORT).show();
        }

    }


    public boolean func04_getKeyboardBalloonViewIsShow(Context context)
    {
        if(settingInMemory != null)
        {
            return ("YES".equals(settingInMemory.setting05_isBalloonViewShow));
        }

        Log.e("HWI","예외상황 발생 --> 풍선뷰 미리보기 설정 여부를 불러오지 못합니다!!!");

        return true;
    }

    public void func04_saveKeyboardBalloonViewIsShow(Context context, boolean isShow)
    {
        settingInMemory.setting05_isBalloonViewShow = isShow ? "YES": "NO";

        func03_saveCurrentMemorySettingToFile(context);

    }



    public int func05_getCurrentKeyboardSizeIntValue(Context context)
    {
        if(settingInMemory != null)
        {
            if("Small".equals(settingInMemory.setting06_keyboardSize))
            {
                return 0;
            }
            else if("Medium".equals(settingInMemory.setting06_keyboardSize))
            {
                return 1;
            }
            else if("Large".equals(settingInMemory.setting06_keyboardSize))
            {
                return 2;
            }

        }
        else
        {
            Toast.makeText(context,"키보드의 사이즈(대/중/소) 여부를 가져오는데 실패했습니다. ",Toast.LENGTH_SHORT).show();
            return 0;
        }

        return 0;
    }



    public void func05_setCurrentKeyboardSizeIntValue(Context context, int value)
    {
        String valueString = "";
        if(value == 0)
        {
            valueString = "Small";
        }
        else if(value == 1)
        {
            valueString = "Medium";
        }
        else if(value == 2)
        {
            valueString = "Large";
        }
        else if(value > 3 || value < 0)
        {
            valueString = "Small";
            Log.e("HWi","키보드 크기 설정 중 예외상황 발생 !!!!---->  디버깅 필요");
        }

        settingInMemory.setting06_keyboardSize = valueString;

        func03_saveCurrentMemorySettingToFile(context);

    }


}
