package com.movingkey.android.movingkey.languages;


import com.movingkey.android.movingkey.languages.bean.Language;

import java.util.Arrays;

/**
 * Created by jhkim on 2016. 3. 5..
 */
public class Hebrew extends Language
{
    public Hebrew()
    {
        this.hwi00_languageName = "Hebrew";
        this.hwi00_languageCode = "he";

        /// 쿼티 QWERTY
        this.hwi01_qwerty01_normalKey = Arrays.asList(


                "ק",  "ר",   "א",   "ט",    "ו",   "ן",    "ם",   "פ",   "del",
                "ש", "ד",   "ג",   "כ",    "ע",   "י",    "ח",   "ל",   "ך",   "ף" ,
                "shift",   "ז",  "ס",   "ב",   "ה",    "נ",   "מ",    "צ",   "ת",   "ץ",
                "emoticon", "global", "space", "enter"
        );

        this.hwi01_qwerty02_normalKey_shift = Arrays.asList(


                "ק",   "ר",   "א",   "ט",    "ו",   "ן",    "ם",   "פ",   "del",
                "ש",  "ד",   "ג",   "כ",    "ע",   "י",    "ח",   "ל",   "ך",   "ף" ,
                "shift",   "ז",    "ס",   "ב",   "ה",    "נ",   "מ",    "צ",   "ת",   "ץ",
                "emoticon", "global", "space", "enter"
        );



        this.hwi01_qwerty03_smallText = Arrays.asList(
                "1",          "2",   "3",   "4",   "5",   "6",    "7",   "8",   "9",
                "/",           "",   "ג׳",    "",    "",   "ײ",    "ח׳",   "",   "(",    ")",
                "~",          "ז׳",    "",    "",   "ױ",   "װ",     "",   "צ׳",  "ת׳",   "ץ׳" ,
                "_",          ":",   ";",   "!",   "?",   ".",    ",",   "'",   "\"", "",
                "⚙","★","lang01","lang02","★"
        );

        this.hwi01_qwerty04_smallText_shift = Arrays.asList(
                ":-)",      ":-(", ";-)", ":'(", ":-D", ":-O", ">:-O", ":-P", ":-*",
                "/",           "",   "ג׳",     ":-|",    "",   "ײ",    "ח׳",   "",   "(",    ")",
                "~",          "ז׳",    "",    "",   "ױ",   "װ",     "",   "צ׳",  "ת׳",   "ץ׳" ,
                "_",          ":",   ";",   "!",   "?",   ".",    ",",   "'",   "\"", "",
                "⚙","★","lang01","lang02","★"
        );







        /// 하프쿼티 Half QWERTY
        this.hwi02_halfQwerty01_normalKey = Arrays.asList(

                "ר ק",    "ט א",      "ן ו",      "פ ם",     "del",
                "ד ש",     "כ ג",    "י ע",     "ל ח",      "ף ך",
                "shift",        "ב ס",     "נ ה",     "צ מ",      "ץ ת",
                "emoticon","global","space","enter"
        );

        this.hwi02_halfQwerty02_normalKey_shift= Arrays.asList(


                "ר ק",    "ט א",      "ן ו",      "פ ם",     "del",
                "ד ש",     "כ ג",    "י ע",     "ל ח",      "ף ך",
                "shift",        "ב ס",     "נ ה",     "צ מ",      "ץ ת",

                "emoticon","global","space","enter"
        );

        this.hwi02_halfQwerty03_smallText = Arrays.asList(

                "" ,    "",    "",    "",    "",    "",    "",    "",    "",     "",    "",
                "" ,             "",           "",            "",            "",           "",
                "",   "5",    "",   "4",   "ײ",   "3",    "",    "2",    "",    "1",   "",
                "",          "ג׳",           "",          "ח׳",            "",            "",
                "",    "0",    "",   "9",   "ױ",   "8",   "װ",    "7",    "",    "6",   "",
                "ז׳",           "ז",           "",          "צ׳",           "ת׳",         "ץ׳",
                "&",   ":",   ";",   "!",   "?",   ".",   ",",    "-",   "_",   "'",  "\"",


                "⚙","★","lang01","lang02","★"
        );

        this.hwi02_halfQwerty04_smallText_shift = Arrays.asList(


                "" ,    "",    "",    "",    "",    "",    "",    "",    "",     "",    "",
                "" ,             "",           "",            "",            "",           "",
                "",   "5",    "",   "4",   "ײ",   "3",    "",    "2",    "",    "1",   "",
                "",          "ג׳",           "",          "ח׳",            "",            "",
                "",    "0",    "",   "9",   "ױ",   "8",   "װ",    "7",    "",    "6",   "",
                "ז׳",           "ז",           "",          "צ׳",           "ת׳",         "ץ׳",
                "&",   ":",   ";",   "!",   "?",   ".",   ",",    "-",   "_",   "'",  "\"",


                "⚙","★","lang01","lang02","★"
        );








        /// 케토  QETUO
        this.hwi03_qetuo01_normalKey = Arrays.asList(


                "ק","א","ו","ם","del",
                "ש","ג","ע","ח","ך",
                "shift","ב","נ","צ","ץ",
                "emoticon","global","space","enter"
        );


        this.hwi03_qetuo02_normalKey_shift = Arrays.asList(


                "'","ר","ט","ן","del",
                "ש","כ","י","ל","ף",
                "shift","ה","מ","ת","'",
                "emoticon","global","space","enter"
        );


        this.hwi03_qetuo03_smallText = Arrays.asList(



                "" ,           "",    "",    "",    "",    "",     "",    "",    "",    "",     "",
                "" ,                 "ר",          "ט",            "ן",          "פ",            "",
                "" ,          "5",   "ג׳",   "4",   "ײ",   "3",    "ח׳",  "2",    "",   "1",     "",
                "" ,                 "ד",          "כ",            "י",          "ל",           "ף",
                "ז׳",          "0",   "ױ",   "9",   "װ",   "8",    "צ׳",   "7",  "ת׳",   "6",     "",
                "ז",                 "ס",          "ה",            "מ",          "ת",          "ץ׳",
                "&",          ":",   ";",   "!",   "?",   ".",    ",",   "-",   "_",   "'",   "\"",



                "⚙","★","lang01","lang02","★"
        );

        this.hwi03_qetuo04_smallText_shift = Arrays.asList(


                "@",          "1",   "2",   "3",   "4",   "5",   "6",    "7",   "8",   "9",    "0",
                "" ,                 "ק",          "א",           "ו",           "ם",          "פ",
                "" ,           "",   "ג׳",    "",    "",   "ײ",    "ח׳",   "",    "",    "",     "",
                "ש",                 "ג",           "ע",           "ח",          "ך",            "",
                "ז׳",           "",    "",    "",   "ױ",   "װ",    "צ׳",  "ת׳",   "ץ׳",    "",     "",
                "ז",                 "ב",           "נ",           "צ",          "ץ",   "'",     "",
                "&",          ":",   ";",   "!",   "?",   ".",    ",",   "-",   "_",   "'",   "\"",



                "⚙","★","lang01","lang02","★"
        );
    }
}
