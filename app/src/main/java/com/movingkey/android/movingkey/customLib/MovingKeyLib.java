package com.movingkey.android.movingkey.customLib;

import android.content.Context;
import android.content.SharedPreferences;
import android.provider.Settings;
import android.util.Log;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.movingkey.android.movingkey.languages.bean.Language;

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



    /// 키보드의 셋팅값들을 파일로 부터 가져와서 메모리에 할당한다
    public void func02_loadMovingKeySettingFromFileAndLoadMemory(Context context)
    {

        /// 사용자의 설정이 전혀 없을 경우 디폴트값으로 지정할 디폴트 객제 생성
        MovingKeySetting defaultSettingGroup = new MovingKeySetting();
        defaultSettingGroup.setting01_lastSelectedLang = "en";
        defaultSettingGroup.setting02_lastSelectedLayout = Const.LAYOUT_QWERTY;
        defaultSettingGroup.setting03_lastSelectedDesign = Const.SKIN_DEFALT;

        defaultSettingGroup.setting04_selectedSetGroup = new ArrayList<LangAndLayout>();



        LangAndLayout defalutLangAndLayout = new LangAndLayout("en",Const.LAYOUT_QWERTY);


        defaultSettingGroup.setting04_selectedSetGroup.add(defalutLangAndLayout);



        defaultSettingGroup.setting05_isBalloonViewShow = Const.BOOL_YES;
        defaultSettingGroup.setting06_keyboardSize = Const.KEYBOARD_SIZE_LARGE;
        defaultSettingGroup.setting07_capsLockActiveState = Const.BOOL_YES;
        defaultSettingGroup.setting08_autoCapActiveState = Const.BOOL_YES;















        /// 사용자가 저장한 마지막 선택 언어와 레이아웃을 가져온다 --> 만약에 아무것도 없을 경우 기본은 ( 영어 , QWERTY, 디폴트 디자인 ) 으로 한다.

        SharedPreferences pref = context.getSharedPreferences("MovingKey",Context.MODE_PRIVATE);
        String setting01_lastSelectedLang = pref.getString("setting01_lastSelectedLang",defaultSettingGroup.setting01_lastSelectedLang);
        String setting02_lastSelectedLayout = pref.getString("setting02_lastSelectedLayout",defaultSettingGroup.setting02_lastSelectedLayout);
        String setting03_lastSelectedDesign = pref.getString("setting03_lastSelectedDesign",defaultSettingGroup.setting03_lastSelectedDesign);

        Gson gson = new Gson();
        String jsonString_setting04_selectedSetGroup = gson.toJson(defaultSettingGroup.setting04_selectedSetGroup);

        String setting04_selectedSetGroup = pref.getString("setting04_selectedSetGroup",jsonString_setting04_selectedSetGroup);
        String setting05_isBalloonViewShow = pref.getString("setting05_isBalloonViewShow",defaultSettingGroup.setting05_isBalloonViewShow);
        String setting06_keyboardSize = pref.getString("setting06_keyboardSize",defaultSettingGroup.setting06_keyboardSize);
        String setting07_capsLockActiveState = pref.getString("setting07_capsLockActiveState",defaultSettingGroup.setting07_capsLockActiveState);
        String setting08_autoCapActiveState = pref.getString("setting08_autoCapActiveState",defaultSettingGroup.setting08_autoCapActiveState);

        Type collectionType = new TypeToken<ArrayList<LangAndLayout>>(){}.getType();








        //// 메모리에 데이터를 로드한다
        settingInMemory = new MovingKeySetting();
        settingInMemory.setting01_lastSelectedLang = setting01_lastSelectedLang;
        settingInMemory.setting02_lastSelectedLayout = setting02_lastSelectedLayout;
        settingInMemory.setting03_lastSelectedDesign = setting03_lastSelectedDesign;
        settingInMemory.setting04_selectedSetGroup = gson.fromJson(setting04_selectedSetGroup,collectionType);
        settingInMemory.setting05_isBalloonViewShow = setting05_isBalloonViewShow;
        settingInMemory.setting06_keyboardSize = setting06_keyboardSize;
        settingInMemory.setting07_capsLockActiveState = setting07_capsLockActiveState;
        settingInMemory.setting08_autoCapActiveState = setting08_autoCapActiveState;


    }


    /// 메모리에 저장된 설정값을 파일로 저장한다.
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

            editor.putString("setting04_selectedSetGroup",jsonString_setting04_selectedSetGroup);


            editor.putString("setting05_isBalloonViewShow",settingInMemory.setting05_isBalloonViewShow);
            editor.putString("setting06_keyboardSize",settingInMemory.setting06_keyboardSize);
            editor.putString("setting07_capsLockActiveState",settingInMemory.setting07_capsLockActiveState);
            editor.putString("setting08_autoCapActiveState",settingInMemory.setting08_autoCapActiveState);



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

    public void func04_setKeyboardBalloonViewIsShow(Context context, boolean isShow)
    {
        settingInMemory.setting05_isBalloonViewShow = isShow ? Const.BOOL_YES: Const.BOOL_NO;

        func03_saveCurrentMemorySettingToFile(context);

    }



    public int func05_getCurrentKeyboardSizeIntValue(Context context)
    {
        if(settingInMemory != null)
        {
            if(Const.KEYBOARD_SIZE_SMALL.equals(settingInMemory.setting06_keyboardSize))
            {
                return 0;
            }
            else if(Const.KEYBOARD_SIZE_MEDIUM.equals(settingInMemory.setting06_keyboardSize))
            {
                return 1;
            }
            else if(Const.KEYBOARD_SIZE_LARGE.equals(settingInMemory.setting06_keyboardSize))
            {
                return 2;
            }

        }
        else
        {
            Log.e("HWI","키보드의 사이즈(대/중/소) 여부를 가져오는데 실패했습니다. ");
            return 0;
        }

        return 0;
    }



    public void func05_setCurrentKeyboardSizeIntValue(Context context, int value)
    {
        String valueString = "";
        if(value == 0)
        {
            valueString = Const.KEYBOARD_SIZE_SMALL;
        }
        else if(value == 1)
        {
            valueString = Const.KEYBOARD_SIZE_MEDIUM;
        }
        else if(value == 2)
        {
            valueString = Const.KEYBOARD_SIZE_LARGE;
        }
        else if(value > 3 || value < 0)
        {
            valueString = "Small";
            Log.e("HWi","키보드 크기 설정 중 예외상황 발생 !!!!---->  디버깅 필요");
        }

        if(settingInMemory != null)
        {
            settingInMemory.setting06_keyboardSize = valueString;

            func03_saveCurrentMemorySettingToFile(context);
        }
        else
        {
            Log.e("HWi","키보드 사이즈 변경 중 문제 발생!!!!---->  디버깅 필요");
        }



    }


    public boolean func06_getCapsLockActiveState()
    {
        if(settingInMemory != null)
        {
            return Const.BOOL_YES.equals(settingInMemory.setting07_capsLockActiveState);
        }
        else
        {
            Log.e("HWi","CapsLock 활성상태 불러 오기 중 문제 발생!!!!---->  디버깅 필요");
            return true;
        }
    }

    public void func06_setCapsLockActiveState(Context context, boolean isCaps)
    {
        if(settingInMemory != null)
        {
            settingInMemory.setting07_capsLockActiveState = isCaps ?  Const.BOOL_YES: Const.BOOL_NO;

            func03_saveCurrentMemorySettingToFile(context);

        }
        else
        {
            Log.e("HWi","CapsLock 활성상태 저장 중 문제 발생!!!!---->  디버깅 필요");
        }
    }





    public boolean func07_getAutoCapActiveState()
    {
        if(settingInMemory != null)
        {
            return Const.BOOL_YES.equals(settingInMemory.setting08_autoCapActiveState);
        }
        else
        {
            Log.e("HWi","CapsLock 활성상태 불러 오기 중 문제 발생!!!!---->  디버깅 필요");
            return true;
        }
    }

    public void func07_setAutoCapActiveState(Context context, boolean isAutoCap)
    {
        if(settingInMemory != null)
        {
            settingInMemory.setting08_autoCapActiveState = isAutoCap ? Const.BOOL_YES: Const.BOOL_NO;

            func03_saveCurrentMemorySettingToFile(context);

        }
        else
        {
            Log.e("HWi","Auto Cap 활성상태 저장 중 문제 발생!!!!---->  디버깅 필요");
        }
    }










    /**
     * 현재 선택된 키보드 그룹에 무빙키가 포함되어있는지 여부 조사
     */
    public static boolean func08_isMovingkeyContainsInSystem(Context context)
    {
        final InputMethodManager imm = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
        String movingkeyPackageName = context.getPackageName();
        for (InputMethodInfo imi : imm.getEnabledInputMethodList())
        {
            if (imi.getServiceName().contains(movingkeyPackageName))
            {
                return true;
            }

        }
        return false;

    }

    /**
     * 무빙키가 단일 선택된 키보드인지 여부 조사
     */
    public static boolean func09_isMovingkeySelected(Context context)
    {

        String movingkeyPackageName = context.getPackageName();
        String currentKeyboardString = Settings.Secure.getString(context.getContentResolver(), Settings.Secure.DEFAULT_INPUT_METHOD);

        Log.d("HWI", "현재 내 앱의 패키지 이름 : " + movingkeyPackageName);
        Log.d("HWI", "현재 시스템에서 설정된 키보드 이름: " + currentKeyboardString);

        boolean isContainMyKeyboard = currentKeyboardString.contains(movingkeyPackageName);
        Log.d("HWI", "내 키보드가 무빙키인 여부 : " + isContainMyKeyboard);
        return isContainMyKeyboard;
    }

    /**
     * 사용자가 사용하는 키보드 선택하도록 피커 띄움
     */
    public static void func10_showSelectKeyboardView(Context context)
    {
        final InputMethodManager imm = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.showInputMethodPicker();
    }





    public ArrayList<LangAndLayout> func11_getUnSelectedLangAndLayouts(Context context)
    {

        if(settingInMemory != null && settingInMemory.setting04_selectedSetGroup != null)
        {
            ArrayList<LangAndLayout> selectedGroup = settingInMemory.setting04_selectedSetGroup;
            ArrayList<LangAndLayout> unSelectedGroup = new ArrayList<LangAndLayout>();
            ArrayList<Language> allLangGroup = settingInMemory.getSetting09_allLanguagesModels();

            for(int i=0; i < allLangGroup.size(); i++)
            {
                Language oneLangModel = allLangGroup.get(i);
                unSelectedGroup.add(new LangAndLayout(oneLangModel.hwi00_languageCode,""));
            }



            for(int i=0; i < selectedGroup.size(); i++)
            {

                LangAndLayout oneLangAndLayoutModel = selectedGroup.get(i);

                for(int j=0; j < unSelectedGroup.size(); j++)
                {
                    if( j < unSelectedGroup.size())
                    {
                        LangAndLayout unselectedOneLangAndLayout = unSelectedGroup.get(j);


                        if(unselectedOneLangAndLayout.language.equals(oneLangAndLayoutModel.language))
                        {
                            unSelectedGroup.remove(unselectedOneLangAndLayout);
                        }
                    }

                }

            }

            return unSelectedGroup;
        }

        Log.d("HWI","메모리에 로드된 키보드 관련 정보가 없습니다.");

        return null;
    }



    public String func12_getLanguageFullNameFromCode(String langCode)
    {
        ArrayList<Language> langModelArr = settingInMemory.getSetting09_allLanguagesModels();


        for(int i=0; i < langModelArr.size(); i++)
        {
            Language oneLang = langModelArr.get(i);

            if(oneLang.hwi00_languageCode.equals(langCode))
            {
                return oneLang.hwi00_languageName;
            }
        }

        return "No LangName";
    }



}
