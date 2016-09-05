package com.movingkey.android.movingkey.customLib;

import com.movingkey.android.movingkey.languages.Arabic;
import com.movingkey.android.movingkey.languages.Bulgarian;
import com.movingkey.android.movingkey.languages.Catalan;
import com.movingkey.android.movingkey.languages.Croatian;
import com.movingkey.android.movingkey.languages.Czech;
import com.movingkey.android.movingkey.languages.Danish;
import com.movingkey.android.movingkey.languages.Deutsch;
import com.movingkey.android.movingkey.languages.Dutch;
import com.movingkey.android.movingkey.languages.English;
import com.movingkey.android.movingkey.languages.Estonian;
import com.movingkey.android.movingkey.languages.Finnish;
import com.movingkey.android.movingkey.languages.French;
import com.movingkey.android.movingkey.languages.Georgian;
import com.movingkey.android.movingkey.languages.Greek;
import com.movingkey.android.movingkey.languages.Hebrew;
import com.movingkey.android.movingkey.languages.Hindi;
import com.movingkey.android.movingkey.languages.Hungarian;
import com.movingkey.android.movingkey.languages.Icelandic;
import com.movingkey.android.movingkey.languages.Italian;
import com.movingkey.android.movingkey.languages.Japanese;
import com.movingkey.android.movingkey.languages.Korean;
import com.movingkey.android.movingkey.languages.Latvian;
import com.movingkey.android.movingkey.languages.Lithuanian;
import com.movingkey.android.movingkey.languages.Macedonian;
import com.movingkey.android.movingkey.languages.Norwegian;
import com.movingkey.android.movingkey.languages.Polish;
import com.movingkey.android.movingkey.languages.Portuguese;
import com.movingkey.android.movingkey.languages.Romanian;
import com.movingkey.android.movingkey.languages.Russian;
import com.movingkey.android.movingkey.languages.Serbian;
import com.movingkey.android.movingkey.languages.Slovak;
import com.movingkey.android.movingkey.languages.Slovenian;
import com.movingkey.android.movingkey.languages.Spanish;
import com.movingkey.android.movingkey.languages.Swedish;
import com.movingkey.android.movingkey.languages.Thai;
import com.movingkey.android.movingkey.languages.Turkish;
import com.movingkey.android.movingkey.languages.Vietnamese;
import com.movingkey.android.movingkey.languages.bean.Language;

import java.util.ArrayList;

/**
 * Created by iankim on 2016. 8. 10..
 */
public class MovingKeySetting
{


    /// 사용자가 마지막에 선택한 언어
    public String setting01_lastSelectedLang;
    /// 사용자가 마지막에 선택한 레이아웃
    public String setting02_lastSelectedLayout;
    /// 사용자가 마지막에 선택한 디자인
    public String setting03_lastSelectedDesign;



    /// 선택된 언어/레이아웃 그룹
    public ArrayList<LangAndLayout> setting04_selectedSetGroup;




    /// 풍선뷰 미리보기 여부
    public String setting05_isBalloonViewShow;

    /// 키보드 사이즈 ( 대 / 중  / 소 )
    public String setting06_keyboardSize;


    /// CapsLock 활성화 여부
    public String setting07_capsLockActiveState;

    /// Auto Cap 활성화 여부
    public String setting08_autoCapActiveState;

    private ArrayList<Language> setting09_allLanguagesModels;

    private void initAllLangNames()
    {
        setting09_allLanguagesModels = new ArrayList<>();

        setting09_allLanguagesModels.add(new Arabic());
        setting09_allLanguagesModels.add(new Arabic());
        setting09_allLanguagesModels.add(new Bulgarian());
        setting09_allLanguagesModels.add(new Catalan());
        setting09_allLanguagesModels.add(new Croatian());
        setting09_allLanguagesModels.add(new Czech());
        setting09_allLanguagesModels.add(new Danish());
        setting09_allLanguagesModels.add(new Deutsch());
        setting09_allLanguagesModels.add(new Dutch());
        setting09_allLanguagesModels.add(new English());
        setting09_allLanguagesModels.add(new Estonian());
        setting09_allLanguagesModels.add(new Finnish());
        setting09_allLanguagesModels.add(new French());
        setting09_allLanguagesModels.add(new Georgian());
        setting09_allLanguagesModels.add(new Greek());
        setting09_allLanguagesModels.add(new Hebrew());
        setting09_allLanguagesModels.add(new Hindi());
        setting09_allLanguagesModels.add(new Hungarian());
        setting09_allLanguagesModels.add(new Icelandic());
        setting09_allLanguagesModels.add(new Italian());
        setting09_allLanguagesModels.add(new Japanese());
        setting09_allLanguagesModels.add(new Korean());
        setting09_allLanguagesModels.add(new Latvian());
        setting09_allLanguagesModels.add(new Lithuanian());
        setting09_allLanguagesModels.add(new Macedonian());
        setting09_allLanguagesModels.add(new Norwegian());
        setting09_allLanguagesModels.add(new Polish());
        setting09_allLanguagesModels.add(new Portuguese());
        setting09_allLanguagesModels.add(new Romanian());
        setting09_allLanguagesModels.add(new Russian());
        setting09_allLanguagesModels.add(new Serbian());
        setting09_allLanguagesModels.add(new Slovak());
        setting09_allLanguagesModels.add(new Slovenian());
        setting09_allLanguagesModels.add(new Spanish());
        setting09_allLanguagesModels.add(new Swedish());
        setting09_allLanguagesModels.add(new Thai());
        setting09_allLanguagesModels.add(new Turkish());
        setting09_allLanguagesModels.add(new Vietnamese());
    }


    public ArrayList<Language> getSetting09_allLanguagesModels()
    {
        if( setting09_allLanguagesModels == null)
        {
            initAllLangNames();
        }

        return setting09_allLanguagesModels;
    }

}


