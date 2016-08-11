package com.movingkey.android.movingkey.languages.bean;

import java.util.List;

/**
 * Created by jhkim on 2016. 2. 5..
 */
public class Language
{
    public String hwi00_languageCode;
    public String hwi00_languageName;

    /// 쿼티 키패드
    public List<String> hwi01_qwerty01_normalKey;
    public List<String> hwi01_qwerty02_normalKey_shift;

    public List<String> hwi01_qwerty03_smallText;
    public List<String> hwi01_qwerty04_smallText_shift;

    public List<String> hwi01_qwerty05_specialKey;
    public List<String> hwi01_qwerty06_specialKey_shift;



    /// 하프쿼티
    public List<String> hwi02_halfQwerty01_normalKey;
    public List<String> hwi02_halfQwerty02_normalKey_shift;

    public List<String> hwi02_halfQwerty03_smallText;
    public List<String> hwi02_halfQwerty04_smallText_shift;


    /// QETUO
    public List<String> hwi03_qetuo01_normalKey;
    public List<String> hwi03_qetuo02_normalKey_shift;

    public List<String> hwi03_qetuo03_smallText;
    public List<String> hwi03_qetuo04_smallText_shift;


    /// 천지인
    public List<String> hwi04_cheonJiIn01_normalKey;
    public List<String> hwi04_cheonJiIn02_normalKey_shift;

    public List<String> hwi04_cheonJiIn03_smallText;
    public List<String> hwi04_cheonJiIn04_smallText_shift;


    /// 구글 단모음
    public List<String> hwi05_googleDanMoEum01_normalKey;
    public List<String> hwi05_googleDanMoEum02_normalKey_shift;

    public List<String> hwi05_googleDanMoEum03_smallText;
    public List<String> hwi05_googleDanMoEum04_smallText_shift;


    /// 천지인 플러스
    public List<String> hwi06_cheonJiInPlus01_normalKey;
    public List<String> hwi06_cheonJiInPlus02_normalKey_shift;

    public List<String> hwi06_cheonJiInPlus03_smallText;
    public List<String> hwi06_cheonJiInPlus04_smallText_shift;


}
