package com.movingkey.android.movingkey.languages;


import com.movingkey.android.movingkey.languages.bean.Language;

import java.util.Arrays;

/**
 * Created by jhkim on 2016. 3. 4..
 */
public class Croatian extends Language
{
    public Croatian()
    {
        this.hwi00_languageName = "Croatian";
        this.hwi00_languageCode = "hr";

        /// 쿼티 QWERTY
        this.hwi01_qwerty01_normalKey = Arrays.asList(
                "q","w","e","r","t","z","u","i","o","p",
                "a","s","d","f","g","h","j","k","l",
                "shift","y","x","c","v","b","n","m","del",
                "emoticon", "global", "space", "enter"
        );

        this.hwi01_qwerty02_normalKey_shift = Arrays.asList(
                "Q","W","E","R","T","Z","U","I","O","P",
                "•","A","S","D","F","G","H","J","K","L",
                "shift","Y","X","C","V","B","N","M","del",
                "emoticon","global","space","enter"
        );



        this.hwi01_qwerty03_smallText = Arrays.asList(
                "♡","","","","","ž","","~","@",".com",
                "1","2","3","4","5","6","7","8","9","0",
                "","š","đ","ć","č","&","/","(",")",
                "_",":",";","!","?",".",",","'","\"",
                "⚙","★","lang01","lang02","★"
        );

        this.hwi01_qwerty04_smallText_shift = Arrays.asList(
                "♡","","","","","Ž","","~","@",".com",
                ":-)",":-(",";-)",":'(",":-D",":-O",">:-O",":-P",":-/",":-|",
                "","Š","Đ","Ć","Č","&","/","(",")",
                "_",":",";","!","?",".",",","'","\"",
                "⚙","★","lang01","lang02","★"
        );







        /// 하프쿼티 Half QWERTY
        this.hwi02_halfQwerty01_normalKey = Arrays.asList(
                "qw", "er", "tz", "ui", "op",
                "as", "df", "gh", "jk", "lm",
                "shift", "yx", "cv", "bn", "del",
                "emoticon","global","space","enter"
        );

        this.hwi02_halfQwerty02_normalKey_shift= Arrays.asList(
                "QW", "ER", "TZ", "UI", "OP",
                "AS", "DF", "GH", "JK", "LM",
                "shift", "YX", "CV", "BN", "del",
                "emoticon","global","space","enter"
        );

        this.hwi02_halfQwerty03_smallText = Arrays.asList(
                "" ,    "",    "",    "",    "",   "@",    "", ".com",    "",  "♡",    "/",
                "" ,           "",           "",          "ž",            "",           "",
                "",    "1",    "",   "2",    "",   "3",    "",    "4",    "",   "5",    "",
                "",          "š",          "đ",           "",            "",           "",
                "",    "6",    "",   "7",   "(",   "8",   ")",    "9",    "",   "0",    "",
                "" ,           "",          "ć",          "č",            "",           "",
                "&",   ":",   ";",   "!",   "?",   ".",   ",",    "-",    "_",  "'",  "\"",
                "⚙","★","lang01","lang02","★"
        );

        this.hwi02_halfQwerty04_smallText_shift = Arrays.asList(
                "" ,    "",    "",    "",    "",    "",    "",     "",    "",    "",    "",
                "" ,           "",           "",          "Ž",            "",           "",
                "", ":-)",    "", ":-(",    "", ";-)",    "",  ":-D",    "", ":-O",    "",
                "",           "Š",          "Đ",           "",            "",           "",
                "",  ":'(",    "",">:-O",    "", ":-P",    "",  ":-/",    "", ":-|",    "",
                "" ,           "",          "Ć",          "Č",            "",           "",
                "&",   ":",   ";",   "!",   "?",   ".",   ",",    "-",    "_",  "'",  "\"",
                "⚙","★","lang01","lang02","★"
        );








        /// 케토  QETUO
        this.hwi03_qetuo01_normalKey = Arrays.asList(
                "q","e","z","u","o",
                "a","d","g","j","l",
                "shift","x","v","n","del",
                "emoticon","global","space","enter"
        );


        this.hwi03_qetuo02_normalKey_shift = Arrays.asList(
                "Q","E","Z","U","O",
                "A","D","G","J","L",
                "shift","X","V","N","del",
                "emoticon","global","space","enter"
        );


        this.hwi03_qetuo03_smallText = Arrays.asList(
                "♡",       ".com",    "",   "ë",    "",   "@",    "",    "ü",   "ï",   "ö",    "/",
                "" ,                 "w",          "r",          "y",           "i",           "p",
                "",           "1",    "",   "2",    "",   "3",    "",    "4",    "",   "5",     "",
                "" ,                 "s",          "f",          "h",           "k",            "",
                "",          "6",    "",   "7",   "(",   "8",   ")",    "9",    "",   "0",     "",
                "" ,                 "z",          "c",          "b",           "m",            "",
                "&",          ":",   ";",   "!",   "?",   ".",   ",",    "-",   "_",   "'",   "\"",

                "⚙","★","lang01","lang02","★"
        );

        this.hwi03_qetuo04_smallText_shift = Arrays.asList(
                "" ,           "",    "",    "",    "",   "Ž",    "",     "",    "",    "",    "",
                "" ,                 "W",          "R",          "T",           "I",          "P",
                "Š",        ":-)",   "Đ", ":-(",    "", ";-)",    "",  ":-D",    "", ":-O",    "",
                "" ,                 "S",          "F",          "H",           "K",           "",
                "",         ":'(",   "Ć",">:-O",   "Č", ":-P",    "",  ":-/",    "", ":-|",    "",
                "" ,                 "Y",          "C",           "B",          "M",           "",
                "&",          ":",   ";",   "!",   "?",   ".",   ",",    "_",    "-",  "'",  "\"",
                "⚙","★","lang01","lang02","★"
        );
    }
}
