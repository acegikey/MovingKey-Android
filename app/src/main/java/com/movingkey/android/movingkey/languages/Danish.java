package com.movingkey.android.movingkey.languages;


import com.movingkey.android.movingkey.languages.bean.Language;

import java.util.Arrays;

/**
 * Created by jhkim on 2016. 3. 4..
 */
public class Danish extends Language
{
    public Danish()
    {
        this.hwi00_languageName = "Danish";
        this.hwi00_languageCode = "da";

        /// 쿼티 QWERTY
        this.hwi01_qwerty01_normalKey = Arrays.asList(
                "q",          "w",   "e",   "r",   "t",   "y",    "u",   "i",   "o",   "p",     "å",
                "a",          "s",   "d",   "f",   "g",   "h",    "j",   "k",   "l",   "æ",     "ø",
                "shift",			"•",   "z",   "x",   "c",   "v",   "b",    "n",   "m",	"del",
                "emoticon", "global", "space", "enter"
        );

        this.hwi01_qwerty02_normalKey_shift = Arrays.asList(
                "Q" ,         "W",   "E",   "R",   "T",   "Y",    "U",   "I",   "O",   "P",     "Å",
                "A",          "S",   "D",   "F",   "G",   "H",    "J",   "K",   "L",   "Æ",     "Ø",
                "shift",			"•",   "Z",   "X",   "C",   "V",    "B",   "N",   "M",	"del",
                "emoticon","global","space","enter"
        );



        this.hwi01_qwerty03_smallText = Arrays.asList(
                "♡",          "é",   "ė",   "ë",    "",    "",    "ü",    "",   "ö",    "",  ".com",
                "ä" ,          "",    "",    "",   "",     "",    "&",   "/",   "@",   "(",     ")",
                "€",          "1",   "2",   "3",   "4",   "5",    "6",   "7",   "8",   "9",     "0",
                "~",         ":" ,   ";",   "!",   "?",   ".",   ",",    "'",  "\"",   "-",
                "⚙","★","lang01","lang02","★"
        );

        this.hwi01_qwerty04_smallText_shift = Arrays.asList(
                "♡",          "É",   "Ė",   "Ë",    "",    "",    "Ü",    "",   "Ö",    "",  ".com",
                "Ä" ,          "",    "",   "",    "",     "",    "&",   "/",   "@",   "(",     ")",
                ":-)",      ":-(", ";-)", ":'(", ":-D", ":-O", ">:-O", ":-P", ":-/", ":-|",   ":-$",
                "~",         ":" ,   ";",   "!",   "?",   ".",    ",",   "'",  "\"",   "-",
                "⚙","★","lang01","lang02","★"
        );







        /// 하프쿼티 Half QWERTY
        this.hwi02_halfQwerty01_normalKey = Arrays.asList(
                "qw","er","ty","ui","op",
                "as","df","gh","jk","læ",
                "shift","zx","cv","bn","del",
                "emoticon","global","space","enter"
        );

        this.hwi02_halfQwerty02_normalKey_shift= Arrays.asList(
                "QW","ER","TY","UI","OP",
                "AS","DF","GH","JK","LÆ",
                "shift","ZX","CV","BN","del",
                "emoticon","global","space","enter"
        );

        this.hwi02_halfQwerty03_smallText = Arrays.asList(
                "" ,           "",   "é",   "ė",   "ë",    "",    "",    "ü",    "",   "ö",      "",
                "" ,                  "",           "",            "",           "",            "å",
                "",           "1",    "",   "2",    "",   "3",    "",    "4",    "",   "5",      "",
                "ä",                  "",           "",            "",           "",            "ø",
                "" ,          "6",    "",   "7",   "(",   "8",   ")",    "9",    "",   "0",      "",
                "" ,                  "",           "",           "",           "m",             "",
                "&",          ":",   ";",   "!",   "?",   ".",   ",",    "-",   "_",   "'",    "\"",
                "⚙","★","lang01","lang02","★"
        );

        this.hwi02_halfQwerty04_smallText_shift = Arrays.asList(
                "" ,           "",   "É",   "Ė",   "Ë",    "",     "",   "Ü",    "",   "Ö",      "",
                "" ,                  "",           "",            "",           "",            "Å",
                "" ,        ":-)",    "", ":-(",    "", ";-)",     "", ":-D",    "", ":-O",      "",
                "Ä",                  "",           "",            "",           "",            "Ø",
                "" ,        ":'(",    "",">:-O",    "", ":-P",    "",  ":-/",    "", ":-|",      "",
                "" ,                  "",           "",           "",           "M",             "",
                "&",          ":",   ";",   "!",   "?",   ".",   ",",    "-",   "_",   "'",    "\"",
                "⚙","★","lang01","lang02","★"
        );








        /// 케토  QETUO
        this.hwi03_qetuo01_normalKey = Arrays.asList(
                "w",          "r",          "y",           "i",          "p",
                "s",          "f",          "h",           "k",          "æ",
                "shift",		      "x",          "v",       	   "n",			 "del",
                "emoticon","global","space","enter"
        );


        this.hwi03_qetuo02_normalKey_shift = Arrays.asList(
                "W",          "R",          "Y",           "I",          "P",
                "S",          "F",          "H",           "K",          "Æ",
                "shift",	       	"X",          "V",           "N",			"del",
                "emoticon","global","space","enter"
        );


        this.hwi03_qetuo03_smallText = Arrays.asList(
                "" ,          "é",   "ė",   "ë",    "",    "",    "ü",    "",   "ö",    "",      "",
                "q" ,                "e",          "t",           "u",          "o",            "å",
                "ä",          "1",    "",   "2",    "",   "3",    "",    "4",    "",   "5",      "",
                "a",                 "d",          "g",           "j",          "l",            "ø",
                "" ,          "6",    "",   "7",   "(",   "8",   ")",    "9",    "",   "0",      "",
                "",                  "z",          "c",          "b",           "m",             "",
                "&",          ":",   ";",   "!",   "?",   ".",   ",",    "-",   "_",   "'",    "\"",


                "⚙","★","lang01","lang02","★"
        );

        this.hwi03_qetuo04_smallText_shift = Arrays.asList(
                "" ,          "É",   "Ė",   "Ë",    "",    "",    "Ü",    "",   "Ö",    "",      "",
                "Q" ,                "E",          "T",           "U",          "O",            "Å",
                "Ä",        ":-)",    "", ":-(",    "", ";-)",     "",  ":-D",    "", ":-O",     "",
                "A",                 "D",          "G",           "J",          "L",            "Ø",
                "",         ":'(",   "Ç",">:-O",    "", ":-P",     "",  ":-/",    "", ":-|",     "",
                "" ,                 "Z",          "C",          "B",           "M",             "",
                "&",          ":",   ";",   "!",   "?",   ".",   ",",    "-",   "_",   "'",    "\"",
                "⚙","★","lang01","lang02","★"
        );
    }
}
