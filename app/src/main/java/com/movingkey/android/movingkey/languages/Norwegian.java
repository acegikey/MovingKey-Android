package com.movingkey.android.movingkey.languages;


import com.movingkey.android.movingkey.languages.bean.Language;

import java.util.Arrays;

/**
 * Created by jhkim on 2016. 3. 5..
 */
public class Norwegian extends Language
{
    public Norwegian()
    {
        this.hwi00_languageName = "Norwegian";
        this.hwi00_languageCode = "no";

        /// 쿼티 QWERTY
        this.hwi01_qwerty01_normalKey = Arrays.asList(
                "q",          "w",   "e",   "r",   "t",   "y",    "u",   "i",   "o",   "p",     "å",
                "a",          "s",   "d",   "f",   "g",   "h",    "j",   "k",   "l",   "ø",     "æ",
                "shift",          "•",   "z",   "x",   "c",   "v",   "b",    "n",   "m",   "del",
                "emoticon", "global", "space", "enter"
        );

        this.hwi01_qwerty02_normalKey_shift = Arrays.asList(
                "Q" ,         "W",   "E",   "R",   "T",   "Y",    "U",   "I",   "O",   "P",     "Å",
                "A",          "S",   "D",   "F",   "G",   "H",    "J",   "K",   "L",   "Ø",     "Æ",
                "shift",          "•",   "Z",   "X",   "C",   "V",   "B",    "N",   "M",   "del",
                "emoticon","global","space","enter"
        );



        this.hwi01_qwerty03_smallText = Arrays.asList(
                "♡",       ".com",    "",    "",    "",    "",    "+",   "-",   "×",   "/",     "=",
                "€",          "1",   "2",   "3",   "4",   "5",    "6",   "7",   "8",   "9",     "0",
                "" ,          "š",   "ž",    "",   "&",   "@",    "(",   ")",    "",   "ö",     "ä",
                "~",          ":",   ";",   "!",   "?",   ".",   ",",    "'",  "\"",    "-",
                "⚙","★","lang01","lang02","★"
        );

        this.hwi01_qwerty04_smallText_shift = Arrays.asList(
                "♡",       ".com",    "",    "",    "",    "",    "+",   "-",   "×",   "/",     "=",
                ":-)",      ":-(", ";-)", ":'(", ":-D", ":-O", ">:-O", ":-P", ":-/", ":-|",   ":-$",
                "" ,          "Š",   "Ž",    "",   "&",   "@",    "(",   ")",    "",   "Ö",     "Ä",
                "~",          ":",   ";",   "!",   "?",   ".",   ",",    "'",  "\"",    "-",
                "⚙","★","lang01","lang02","★"
        );







        /// 하프쿼티 Half QWERTY
        this.hwi02_halfQwerty01_normalKey = Arrays.asList(
                "qw","er","ty","ui","op",
                "as","df","gh","jk","lø",
                "shift","zx","cv","bn","del",
                "emoticon","global","space","enter"
        );

        this.hwi02_halfQwerty02_normalKey_shift= Arrays.asList(
                "QW","ER","TY","UI","OP",
                "AS","DF","GH","JK","LØ",
                "shift","ZX","CV","BN","del",
                "emoticon","global","space","enter"
        );

        this.hwi02_halfQwerty03_smallText = Arrays.asList(
                "",            "",    "",    "",    "",   "@",     "",".com",    "",   "♡",     "/",
                "" ,                  "",           "",           "",            "",            "å",
                "" ,          "1",    "",   "2",    "",   "3",    "",    "4",    "",   "5",     "ä",
                "" ,                 "š",           "",            "",           "",            "æ",
                "" ,          "6",    "",   "7",   "(",   "8",   ")",    "9",    "",   "0",     "ö",
                "" ,                 "ž",           "",           "",            "m",             "",
                "&",          ":",   ";",   "!",   "?",   ".",   ",",    "-",   "_",   "'",    "\"",
                "⚙","★","lang01","lang02","★"
        );

        this.hwi02_halfQwerty04_smallText_shift = Arrays.asList(
                "" ,           "",    "",    "",    "",    "",    "",     "",    "",    "",      "",
                "" ,                  "",           "",           "",            "",            "Å",
                "" ,        ":-)",    "", ":-(",    "", ";-)",     "", ":-D",    "", ":-O",     "Ä",
                "" ,                 "Š",           "",           "",            "",            "Æ",
                "" ,        ":'(",    "",">:-O",    "", ":-P",    "",  ":-/",    "", ":-|",     "Ö",
                "" ,                 "Ž",           "",           "",           "M",             "",
                "&",          ":",   ";",   "!",   "?",   ".",   ",",    "-",   "_",   "'",    "\"",
                "⚙","★","lang01","lang02","★"
        );








        /// 케토  QETUO
        this.hwi03_qetuo01_normalKey = Arrays.asList(
                "w","r","y","i","p",
                "s","f","h","k","ø",
                "shift","x","v","n","del",
                "emoticon","global","space","enter"
        );


        this.hwi03_qetuo02_normalKey_shift = Arrays.asList(
                "W","R","Y","I","P",
                "S","F","H","K","Ø",
                "shift","X","V","N","del",
                "emoticon","global","space","enter"
        );


        this.hwi03_qetuo03_smallText = Arrays.asList(
                "",            "",    "",    "",    "",   "@",     "",".com",    "",   "♡",     "/",
                "q" ,                "e",          "t",           "u",          "o",            "å",
                "" ,          "1",    "",   "2",    "",   "3",    "",    "4",    "",   "5",     "ä",
                "a",                 "d",          "g",           "j",          "l",            "æ",
                "š",          "6",    "",   "7",   "(",   "8",   ")",    "9",    "",   "0",     "ö",
                "ž",                 "z",          "c",          "b",           "m",             "",
                "&",          ":",   ";",   "!",   "?",   ".",   ",",    "-",   "_",   "'",    "\"",


                "⚙","★","lang01","lang02","★"
        );

        this.hwi03_qetuo04_smallText_shift = Arrays.asList(
                "" ,           "",    "",    "",    "",    "",     "",    "",    "",    "",      "",
                "Q",                 "E",          "T",           "U",          "O",            "Å",
                "" ,        ":-)",    "", ":-(",    "", ";-)",     "", ":-D",    "", ":-O",     "Ä",
                "A",                 "D",          "G",           "J",          "L",            "Æ",
                "Š",        ":'(",    "",">:-O",    "", ":-P",     "", ":-/",    "", ":-|",     "Ö",
                "Ž",                 "Z",          "C",          "B",           "M",             "",
                "&",          ":",   ";",   "!",   "?",   ".",   ",",    "-",   "_",   "'",    "\"",
                "⚙","★","lang01","lang02","★"
        );
    }
}
