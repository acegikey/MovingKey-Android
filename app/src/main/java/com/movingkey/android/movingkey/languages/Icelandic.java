package com.movingkey.android.movingkey.languages;


import com.movingkey.android.movingkey.languages.bean.Language;

import java.util.Arrays;

/**
 * Created by jhkim on 2016. 3. 5..
 */
public class Icelandic extends Language
{
    public Icelandic()
    {
        this.hwi00_languageName = "Icelandic";
        this.hwi00_languageCode = "is";

        /// 쿼티 QWERTY
        this.hwi01_qwerty01_normalKey = Arrays.asList(

                "q",          "w",   "e",   "r",   "t",   "y",    "u",   "i",   "o",   "p",     "ð",
                "a",          "s",   "d",   "f",   "g",   "h",    "j",   "k",   "l",   "æ",     "ö",
                "shift",          "z",   "x",   "c",   "v",   "b",    "n",   "m",   "þ",   "del",
                "emoticon", "global", "space", "enter"
        );

        this.hwi01_qwerty02_normalKey_shift = Arrays.asList(
                "Q",          "W",   "E",   "R",   "T",   "Y",    "U",   "I",   "O",   "P",     "Ð",
                "A",          "S",   "D",   "F",   "G",   "H",    "J",   "K",   "L",   "Æ",     "Ö",
                "shift",          "Z",   "X",   "C",   "V",   "B",    "N",   "M",   "Þ",    "del",
                "emoticon","global","space","enter"
        );



        this.hwi01_qwerty03_smallText = Arrays.asList(
                "♡",           "",   "é",    "",    "",   "ý",    "ú",   "í",   "ó",    "",  ".com",
                "" ,           "",   "%",   "&",   "#",   "^",    "*",   "@",   "/",   "(",     ")",
                "€",          "1",   "2",   "3",   "4",   "5",    "6",   "7",   "8",   "9",     "0",
                "~",          ":",   ";",   "!",   "?",   ".",   ",",    "'",  "\"",    "-",
                "⚙","★","lang01","lang02","★"
        );

        this.hwi01_qwerty04_smallText_shift = Arrays.asList(
                "♡",          "",   "É",    "",    "",   "Ý",    "Ú",   "Í",   "Ó",    "",   ".com",
                "" ,           "",   "%",   "&",   "#",   "^",    "*",   "@",   "/",   "(",     ")",
                ":-)",      ":-(", ";-)", ":'(", ":-D", ":-O", ">:-O", ":-P", ":-/", ":-|",   ":-$",
                "~",          ":",   ";",   "!",   "?",   ".",   ",",    "'",  "\"",    "-",

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
                "" ,         "♡",    "",".com",    "",   "@",    "",    "ú",    "",   "ó",      "/",
                "" ,                  "",           "",            "",           "",            "å",
                "",           "1",    "",   "2",    "",   "3",    "",    "4",    "",   "5",      "",
                "ä",                  "",           "",            "",           "",            "ø",
                "" ,          "6",    "",   "7",   "(",   "8",   ")",    "9",    "",   "0",      "",
                "" ,                  "",           "",           "",           "m",            "þ",
                "&",          ":",   ";",   "!",   "?",   ".",   ",",    "-",   "_",   "'",    "\"",
                "⚙","★","lang01","lang02","★"
        );

        this.hwi02_halfQwerty04_smallText_shift = Arrays.asList(
                "" ,           "",    "",    "",    "",    "",    "",   "Ú",     "",   "Ó",      "",
                "" ,                 "É",           "",          "Ý",           "Í",            "Ð",
                "" ,        ":-)",    "", ":-(",    "", ";-)",     "", ":-D",    "", ":-O",      "",
                "" ,                  "",           "",            "",           "",            "Ö",
                "" ,        ":'(",    "",">:-O",    "", ":-P",    "",  ":-/",    "", ":-|",      "",
                "" ,                  "",           "",           "",           "M",            "Þ",
                "&",          ":",   ";",   "!",   "?",   ".",   ",",    "-",   "_",   "'",    "\"",
                "⚙","★","lang01","lang02","★"
        );








        /// 케토  QETUO
        this.hwi03_qetuo01_normalKey = Arrays.asList(
                "w","r","y","i","p",
                "s","f","h","k","æ",
                "shift","x","v","n","del",
                "emoticon","global","space","enter"
        );


        this.hwi03_qetuo02_normalKey_shift = Arrays.asList(
                "W","R","Y","I","P",
                "S","F","H","K","Æ",
                "shift","X","V","N","del",
                "emoticon","global","space","enter"
        );


        this.hwi03_qetuo03_smallText = Arrays.asList(
                "♡",       ".com",   "é",   "@",    "",   "ý",    "ú",   "í",   "ó",    "",     "/",
                "q" ,                "e",          "t",           "u",          "o",            "ð",
                "" ,          "1",    "",   "2",    "",   "3",    "",    "4",    "",   "5",      "",
                "a",                 "d",          "g",           "j",          "l",            "ö",
                "" ,          "6",    "",   "7",   "(",   "8",   ")",    "9",    "",   "0",      "",
                "",                  "z",          "c",          "b",           "m",            "þ",
                "&",          ":",   ";",   "!",   "?",   ".",   ",",    "-",   "_",   "'",    "\"",


                "⚙","★","lang01","lang02","★"
        );

        this.hwi03_qetuo04_smallText_shift = Arrays.asList(
                "" ,           "",   "É",    "",    "",   "Ý",    "Ú",   "Í",   "Ó",    "",      "",
                "Q" ,                "E",          "T",           "U",          "O",            "Ð",
                "" ,        ":-)",    "", ":-(",    "", ";-)",     "", ":-D",    "", ":-O",      "",
                "A",                 "D",          "G",           "J",          "L",            "Ö",
                "" ,        ":'(",   "Ç",">:-O",    "", ":-P",     "", ":-/",    "", ":-|",      "",
                "" ,                 "Z",          "C",          "B",           "M",            "þ",
                "&",          ":",   ";",   "!",   "?",   ".",   ",",    "-",   "_",   "'",    "\"",
                "⚙","★","lang01","lang02","★"
        );
    }
}
