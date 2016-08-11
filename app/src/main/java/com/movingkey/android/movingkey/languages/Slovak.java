package com.movingkey.android.movingkey.languages;


import com.movingkey.android.movingkey.languages.bean.Language;

import java.util.Arrays;

/**
 * Created by jhkim on 2016. 3. 5..
 */
public class Slovak extends Language
{
    public Slovak()
    {
        this.hwi00_languageName = "Slovak";
        this.hwi00_languageCode = "sk";

        /// 쿼티 QWERTY
        this.hwi01_qwerty01_normalKey = Arrays.asList(
                "q",          "w",   "e",   "r",   "t",   "z",    "u",   "i",   "o",   "p" ,
                "a",   "s",   "d",   "f",   "g",    "h",   "j",   "k",   "l" ,
                "shift",          "y",   "x",   "c",   "v",    "b",   "n",   "m",   "del",
                "emoticon", "global", "space", "enter"
        );

        this.hwi01_qwerty02_normalKey_shift = Arrays.asList(
                "Q",          "W",   "E",   "R",   "T",   "Z",    "U",   "I",   "O",   "P" ,
                "A",   "S",   "D",   "F",   "G",    "H",   "J",   "K",   "L" ,
                "shift",          "Y",   "X",   "C",   "V",   "B",    "N",   "M",   "del",
                "emoticon","global","space","enter"
        );



        this.hwi01_qwerty03_smallText = Arrays.asList(
                "&",          "@",   "è",   "ř",   "ť",   "ž",    "ú",   "í",   "ó",   "ô" ,
                "1",          "2",   "3",   "4",   "5",   "6",    "7",   "8",   "9",   "0" ,
                "ý",   "č",   "ď",   "(",   ")",    "ň",   "/",   "ĺ",   "ľ" ,
                "_",          ":",   ";",   "!",   "?",   ".",    ",",   "'",   "\"",
                "⚙","★","lang01","lang02","★"
        );

        this.hwi01_qwerty04_smallText_shift = Arrays.asList(
                "&",   "@",   "É",   "Ř",   "Ť",   "Ž",    "Ú",   "Í",   "Ó",   "Ô" ,
                ":-)",   ":-(", ";-)", ":'(", ":-D", ":-O", ">:-O", ":-P", ":-/",  ":-|",
               "Ý",   "Č",   "Ď",   "(",   ")",    "Ň",   "/",   "Ĺ",   "Ľ" ,
                "_",   ":",   ";",   "!",   "?",   ".",    ",",   "'",   "\"",
                "⚙","★","lang01","lang02","★"
        );







        /// 하프쿼티 Half QWERTY
        this.hwi02_halfQwerty01_normalKey = Arrays.asList(
                "qw","er","tz","ui","op",
                "as","df","gh","jk","lm",
                "shift","yx","cv","bn","del",
                "emoticon","global","space","enter"
        );

        this.hwi02_halfQwerty02_normalKey_shift= Arrays.asList(
                "QW","ER","TZ","UI","OP",
                "AS","DF","GH","JK","LM",
                "shift","YX","CV","BN","del",
                "emoticon","global","space","enter"
        );

        this.hwi02_halfQwerty03_smallText = Arrays.asList(
                "" ,    "",   "é",   "ř",   "ť",   "ž",     "",   "ú",   "í",   "ó",   "ô",
                "" ,           "",           "",            "",           "",           "",
                "",    "1",    "",   "2",    "",   "3",    "",    "4",    "",   "5",    "",
                "á",          "ď",           "",           "",           "ĺ",          "ľ",
                "ä",   "6",    "",   "7",   "(",   "8",   ")",    "9",    "",   "0",    "",
                "" ,          "ý",          "č",           "",           "ň",           "",
                "&",   ":",   ";",   "!",   "?",   ".",   ",",    "-",    "_",  "'",  "\"",
                "⚙","★","lang01","lang02","★"
        );

        this.hwi02_halfQwerty04_smallText_shift = Arrays.asList(
                "" ,    "",   "É",   "Ř",   "Ť",   "Ž",    "",    "Ú",   "Í",   "Ó",   "Ô",
                "" ,           "",           "",           "",            "",           "",
                "" , ":-)",    "", ":-(",    "", ";-)",    "",  ":-D",    "", ":-O",    "",
                "Á",          "Ď",           "",           "",           "Ĺ",          "Ľ",
                "Ä", ":'(",    "",">:-O",    "", ":-P",    "",  ":-/",    "", ":-|",    "",
                "" ,          "Ý" ,         "Č",           "",           "Ň",           "",
                "&",   ":",   ";",   "!",   "?",   ".",   ",",    "-",    "_",  "'",  "\"",
                "⚙","★","lang01","lang02","★"
        );








        /// 케토  QETUO
        this.hwi03_qetuo01_normalKey = Arrays.asList(
                "q","e","t","u","o",
                "a","d","g","j","l",
                "shift","x","v","n","del",
                "emoticon","global","space","enter"
        );


        this.hwi03_qetuo02_normalKey_shift = Arrays.asList(
                "Q","E","T","U","O",
                "A","D","G","J","L",
                "shift","X","V","N","del",
                "emoticon","global","space","enter"
        );


        this.hwi03_qetuo03_smallText = Arrays.asList(
                "" ,           "",    "",   "é",   "ř",   "ť",   "ž",    "ú",   "í",   "ó",   "ô",
                "" ,                 "w",          "r",          "z",           "i",          "p",
                "",           "1",   "ď",   "2",    "",   "3",    "",    "4",    "",   "5",   "ĺ",
                "á",                 "s",          "f",           "h",          "k",          "ľ",
                "ä",          "6",   "č",   "7",   "(",   "8",   ")",    "9",    "",   "0",    "",
                "ý",                 "y",          "c",           "b",          "m",           "",
                "&",          ":",   ";",   "!",   "?",   ".",   ",",    "_",    "-",  "'",  "\"",

                "⚙","★","lang01","lang02","★"
        );

        this.hwi03_qetuo04_smallText_shift = Arrays.asList(
                "" ,           "",   "É",   "Ř",   "Ť",   "Ž",    "",    "Ú",   "Í",   "Ó",   "Ô",
                "" ,                 "W",          "R",          "Z",           "I",          "P",
                "" ,        ":-)",   "Ď", ":-(",    "", ";-)",    "",  ":-D",    "", ":-O",   "Ĺ",
                "Á",                 "S",          "F",          "H",           "K",          "Ľ",
                "Ä",       ":'(",   "Č"," >:-O",    "", ":-P",   "Ñ",  ":-/",    "", ":-|",    "",
                "Ý",                 "Y",          "C",           "B",          "M",           "",
                "&",          ":",   ";",   "!",   "?",   ".",   ",",    "_",    "-",  "'",  "\"",
                "⚙","★","lang01","lang02","★"
        );
    }
}
