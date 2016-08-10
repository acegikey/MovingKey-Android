package com.movingkey.android.movingkey.customLib;

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

}


