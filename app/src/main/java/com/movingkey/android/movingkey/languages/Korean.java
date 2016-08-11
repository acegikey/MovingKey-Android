package com.movingkey.android.movingkey.languages;


import com.movingkey.android.movingkey.languages.bean.Language;

import java.util.Arrays;

/**
 * Created by jhkim on 2016. 2. 5..
 */
public class Korean extends Language
{
    public Korean()
    {
        this.hwi00_languageName = "Korean";
        this.hwi00_languageCode = "ko";


        /// 쿼티 QWERTY
        this.hwi01_qwerty01_normalKey = Arrays.asList(
                "ㅂ","ㅈ","ㄷ","ㄱ","ㅅ","ㅛ","ㅕ","ㅑ","ㅐ","ㅔ",
                   "ㅁ","ㄴ","ㅇ","ㄹ","ㅎ","ㅗ","ㅓ","ㅏ","ㅣ",
                "shift","ㅋ","ㅌ","ㅊ","ㅍ","ㅠ","ㅜ","ㅡ","del",
                "emoticon","global","space","enter"
        );

        this.hwi01_qwerty02_normalKey_shift = Arrays.asList(
                "■", "□",  "▲",  "△","▼", "▽", "▶", "◀","▷","◁",
                "★",  "☆",  "♥",  "♡","♣", "♧", "♠", "♤","♦",
                "shift", "♪",  "♬",  "♯", "♭", "○",  "◎","※","del",
                "emoticon","global","space","enter"
        );


        this.hwi01_qwerty03_smallText = Arrays.asList(
                "ㅃ",  "ㅉ",  "ㄸ",  "ㄲ",  "ㅆ",  "=",  "&", "",  "ㅒ",  "ㅖ",
                "1",  "2",  "3",  "4",  "5",  "6", "7",  "8",  "9",  "0",
                "♡",  "^^", "@",  "#",  "~",  "-", "/",   "(",  ")",
                "'",  "\"", ":",  ";",  "…",  ".", ",",  "?",   "!",
                "⚙","★","lang01","lang02","★"
        );

        this.hwi01_qwerty04_smallText_shift = Arrays.asList(
                "♡","~","^^","", "", "",  "", "","(", ")",
                "ㅃ","ㅉ","ㄸ",  "ㄲ","ㅆ","-",  "", "",  "ㅒ","ㅖ" ,
                "1","2", "3","4","5","6", "7","8","9",
                "'",  "\"", ":",";","…",".", ",","?","!",

                "⚙","★","lang01","lang02","★"
        );








        /// 천지인
        this.hwi04_cheonJiIn01_normalKey = Arrays.asList(
                "ㅣ",    "•",     "ㅡ",     "del",
                "ㄱㅋ",  "ㄴㄹ",   "ㄷㅌ",   "enter",
                "ㅂㅍ",  "ㅅㅎ",   "ㅈㅊ", "specialChar",
                "global","ㅇㅁ", "space", "emoticon"
        );


        this.hwi04_cheonJiIn02_normalKey_shift = Arrays.asList(
                "ㅣ",    "•",     "ㅡ",     "del",
                "ㄱㅋ",  "ㄴㄹ",   "ㄷㅌ",   "enter",
                "ㅂㅍ",  "ㅅㅎ",   "ㅈㅊ", "specialChar",
                "global","ㅇㅁ", "space", "emoticon"
        );


        this.hwi04_cheonJiIn03_smallText = Arrays.asList(
                "",     "",    "(",    "^^",   "-",   "~",   ")",   "",   "",
                "",             "!",           ",",          "•",         "?",
                "",     "",    "(",    "^^",   "-",   "~",   ")",   "",   "",
                "",             "!",           ",",          "•",         "?",
                "",     "",    "(",    "^^",   "-",   "~",   ")",   "",   "",
                "",             "!",           ",",          "•",         "?",
                "",     "",    "(",    "^^",   "-",   "~",   ")",   "",   "",
                "⚙","★","lang01","lang02","★"

        );

        this.hwi04_cheonJiIn04_smallText_shift = Arrays.asList(
                "",     "",    "(",    "^^",   "-",   "~",   ")",   "",   "",
                "",             "!",           ",",          "•",         "?",
                "",     "",    "(",    "^^",   "-",   "~",   ")",   "",   "",
                "",             "!",           ",",          "•",         "?",
                "",     "",    "(",    "^^",   "-",   "~",   ")",   "",   "",
                "",             "!",           ",",          "•",         "?",
                "",     "",    "(",    "^^",   "-",   "~",   ")",   "",   "",
                "⚙","★","lang01","lang02","★"
        );



        /// 구글 단모음
        this.hwi05_googleDanMoEum01_normalKey = Arrays.asList(
                "ㅂ","ㅈ","ㄷ","ㄱ","ㅅ","ㅗ","ㅐ","ㅔ",
                "ㅁ","ㄴ","ㅇ","ㄹ","ㅎ","ㅓ","ㅏ","ㅣ",
                "shift","ㅋ","ㅌ","ㅊ","ㅍ","ㅜ","ㅡ","del",
                "emoticon","global","space","enter"
        );


        this.hwi05_googleDanMoEum02_normalKey_shift = Arrays.asList(
                "ㅃ","ㅉ","ㄸ","ㄲ","ㅅ","ㅗ","ㅐ","ㅔ",
                "ㅁ","ㄴ","ㅇ","ㄹ","ㅎ","ㅓ","ㅏ","ㅣ",
                "shift","ㅋ","ㅌ","ㅊ","ㅍ","ㅜ","ㅡ","del",
                "emoticon","global","space","enter"
        );


        this.hwi05_googleDanMoEum03_smallText = Arrays.asList(
                "♡", ".com", "", "", "", "+", "-", "*",
                "(", "%", "&", "#", ")", "<", "^", "@",
                "1", "2", "3", "4", "5", "6", "7", "8",
                "~", ":'", ";", "!", "?", ".", ",", "'",
                "⚙","★","lang01","lang02","★"

        );

        this.hwi05_googleDanMoEum04_smallText_shift = Arrays.asList(
                "♡", ".com", "", "", "", "+", "-", "*",
                "(", "%", "&", "#", ")", "<", "^", "@",
                "1", "2", "3", "4", "5", "6", "7", "8",
                "~", ":'", ";", "!", "?", ".", ",", "'",
                "⚙","★","lang01","lang02","★"
        );



        /// 천지인 플러스
        this.hwi06_cheonJiInPlus01_normalKey = Arrays.asList(
                   "ㅣ",    "•",    "ㅡ",     "del",
                "ㄱ","ㅋ","ㄴ","ㄹ","ㄷ","ㅌ", "enter",
                "ㅂ","ㅍ","ㅅ","ㅎ","ㅈ","ㅊ","specialChar",
                "global","ㅇ","ㅁ","space", "emoticon"
        );


        this.hwi06_cheonJiInPlus02_normalKey_shift = Arrays.asList(
                "ㅣ",    "•",    "ㅡ",     "del",
                "ㄱ","ㅋ","ㄴ","ㄹ","ㄷ","ㅌ", "enter",
                "ㅂ","ㅍ","ㅅ","ㅎ","ㅈ","ㅊ","specialChar",
                "global","ㅇ","ㅁ","space", "emoticon"
        );


        this.hwi06_cheonJiInPlus03_smallText = Arrays.asList(
                     "1",          "2",         "3",          "4",
                ".com","<3",    "t1","t2",     "t3","t4",     "t5",
                ".1m","43",    "t7","t8",     "t9","t10",     "t11",
                ".1m","43",    "t7","t8",     "t9","t10",     "t11"

        );

        this.hwi06_cheonJiInPlus04_smallText_shift = Arrays.asList(
                      "1",          "2",         "3",          "4",
                ".com","<3",    "t1","t2",     "t3","t4",     "t5",
                ".1m","43",    "t7","t8",     "t9","t10",     "t11",
                ".1m","43",    "t7","t8",     "t9","t10",     "t11"
        );
    }
}
