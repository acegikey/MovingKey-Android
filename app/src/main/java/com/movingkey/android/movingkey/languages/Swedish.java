package com.movingkey.android.movingkey.languages;


import com.movingkey.android.movingkey.languages.bean.Language;

import java.util.Arrays;

/**
 * Created by jhkim on 2016. 3. 5..
 */
public class Swedish extends Language
{
    public Swedish()
    {
        this.hwi00_languageName = "Swedish";
        this.hwi00_languageCode = "sv";

        /// 쿼티 QWERTY
        this.hwi01_qwerty01_normalKey = Arrays.asList(
                "q",          "w",   "e",   "r",   "t",   "y",    "u",   "i",   "o",   "p",     "å",
                "a",          "s",   "d",   "f",   "g",   "h",    "j",   "k",   "l",   "ö",     "ä",
                "shift",          "•",   "z",   "x",   "c",   "v",    "b",   "n",   "m",   "del",
                "emoticon", "global", "space", "enter"
        );

        this.hwi01_qwerty02_normalKey_shift = Arrays.asList(
                "Q" ,         "W",   "E",   "R",   "T",   "Y",    "U",   "I",   "O",   "P",     "Å",
                "A",          "S",   "D",   "F",   "G",   "H",    "J",   "K",   "L",   "Ö",     "Ä",
                "shift",          "•",   "Z",   "X",   "C",   "V",   "B",    "N",   "M",   "del",
                "emoticon","global","space","enter"
        );



        this.hwi01_qwerty03_smallText = Arrays.asList(
                "♡",       ".com",    "",    "",    "",    "",    "+",   "-",   "×",   "/",     "=",
                "%",          "&",   "#",   "^",   "*",   "@",    "(",   ")",    "",   "ø",     "æ",
                "§",          "1",   "2",   "3",   "4",   "5",    "6",   "7",   "8",   "9",     "0",
                "~",          ":",   ";",   "!",   "?",   ".",   ",",    "'",  "\"",    "-",
                "⚙","★","lang01","lang02","★"
        );

        this.hwi01_qwerty04_smallText_shift = Arrays.asList(
                "♡",       ".com",    "",    "",    "",    "",    "+",   "-",   "×",   "/",     "=",
                "%",          "&",   "#",   "^",   "*",   "@",    "(",   ")",    "",   "Ø",     "Æ",
                ":-)",      ":-(", ";-)", ":'(", ":-D", ":-O", ">:-O", ":-P", ":-*", ":-|",   ":-$",
                "~",          ":",   ";",   "!",   "?",   ".",   ",",    "'",  "\"",    "-",
                "⚙","★","lang01","lang02","★"
        );







        /// 하프쿼티 Half QWERTY
        this.hwi02_halfQwerty01_normalKey = Arrays.asList(
                "qw","er","ty","ui","op",
                "as","df","gh","jk","lö",
                "shift","zx","cv","bn","del",
                "emoticon","global","space","enter"
        );

        this.hwi02_halfQwerty02_normalKey_shift= Arrays.asList(
                "QW","ER","TY","UI","OP",
                "AS","DF","GH","JK","LÖ",
                "shift","ZX","CV","BN","del",
                "emoticon","global","space","enter"
        );

        this.hwi02_halfQwerty03_smallText = Arrays.asList(
                "",            "",    "",    "",    "",   "@",     "",".com",    "",   "♡",     "/",
                "" ,                  "",           "",            "",           "",            "å",
                "" ,          "1",    "",   "2",    "",   "3",     "",   "4",    "",   "5",     "æ",
                "" ,                  "",           "",            "",           "",            "ä",
                "" ,          "6",    "",   "7",    "",   "8",     "",   "9",    "",   "0",     "ø",
                "" ,                  "",           "",            "",          "m",             "",
                "&",          ":",   ";",   "!",   "?",   ".",   ",",    "-",   "_",   "'",    "\"",
                "⚙","★","lang01","lang02","★"
        );

        this.hwi02_halfQwerty04_smallText_shift = Arrays.asList(
                "",            "",    "",    "",    "",   "@",     "",".com",    "",   "♡",     "/",
                "" ,                  "",           "",            "",           "",            "Å",
                "" ,        ":-)",    "", ":-(",    "", ";-)",     "", ":-D",    "", ":-O",     "Æ",
                "" ,                  "",           "",            "",           "",            "Ä",
                "",        ":'(",    "", ">:-O",   "", ":-P",     "", ":-/",    "", ":-|",     "Ø",
                "" ,                  "",           "",           "",           "M",             "",
                "&",          ":",   ";",   "!",   "?",   ".",   ",",    "-",   "_",   "'",    "\"",
                "⚙","★","lang01","lang02","★"
        );








        /// 케토  QETUO
        this.hwi03_qetuo01_normalKey = Arrays.asList(
                "w","r","y","i","p",
                "s","f","h","k","ö",
                "shift","x","v","n","del",
                "emoticon","global","space","enter"
        );


        this.hwi03_qetuo02_normalKey_shift = Arrays.asList(
                "W","R","Y","I","P",
                "S","F","H","K","Ö",
                "shift","X","V","N","del",
                "emoticon","global","space","enter"
        );


        this.hwi03_qetuo03_smallText = Arrays.asList(
                "",            "",    "",    "",    "",   "@",     "",".com",    "",   "♡",    "/",
                "q" ,                "e",          "t",           "u",          "o",            "å",
                "" ,          "1",    "",   "2",    "",   "3",     "",   "4",    "",   "5",     "æ",
                "a",                 "d",          "g",           "j",          "l",            "ä",
                "",           "6",    "",   "7",   "(",   "8",    ")",   "9",    "",   "0",     "ø",
                "",                  "z",          "c",          "b",           "m",             "",
                "~",          ":",   ";",   "!",   "?",   ".",   ",",    "'",  "\"",    "-",    "_",


                "⚙","★","lang01","lang02","★"
        );

        this.hwi03_qetuo04_smallText_shift = Arrays.asList(
                "",            "",    "",    "",    "",   "@",     "",".com",    "",   "♡",    "/",
                "Q",                 "E",          "T",           "U",          "O",            "Å",
                "",        ":-)",    "", ":-(",    "", ";-)",     "", ":-D",    "", ":-O",     "Æ",
                "A",                 "D",          "G",           "J",          "L",            "Ä",
                "",         ":'(",    "",">:-O",    "", ":-P",    "Ñ", ":-/",    "", ":-|",     "Ø",
                "" ,                 "Z",          "C",           "B",          "M",             "",
                "&",          ":",   ";",   "!",   "?",   ".",    ",",   "-",   "_",   "'",    "\"",
                "⚙","★","lang01","lang02","★"
        );
    }
}
