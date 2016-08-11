package com.movingkey.android.movingkey.languages;


import com.movingkey.android.movingkey.languages.bean.Language;

import java.util.Arrays;

/**
 * Created by jhkim on 2016. 3. 5..
 */
public class Hindi extends Language
{
    public Hindi()
    {
        this.hwi00_languageName = "Hindi";
        this.hwi00_languageCode = "hi";

        /// 쿼티 QWERTY
        this.hwi01_qwerty01_normalKey = Arrays.asList(
                "ॉ" ,          "१",   "२",   "३",   "४",   "५",    "६",    "७",    "८",   "९",   "०",
                "ौ" ,          "े",    "ा",   "ी",     "ू",   "ब",    "ह",    "ग",   "द",   "ज",   "ड",
                "ो" ,          "े",    "्",    "ि",    "ु",   "प",     "र",    "क",   "त",   "च",   "ट",
                "shift" ,          "ं",    "म",   "न",    "व",   "ल",    "स",    "ष",   "य",   "del",
                "emoticon", "global", "space", "enter"
        );

        this.hwi01_qwerty02_normalKey_shift = Arrays.asList(
                "₹",          "1",   "2",   "3",   "4",   "5",    "6",    "7",   "8",   "9",    "0",
                "औ",         "ऐ",   "आ",   "ई",   "ऊ",   "भ",    "ङ",    "घ",   "ध",   "झ",    "ढ",
                "ओ",         "ए",   "अ",   "इ",    "उ",   "फ",    "ऋ",   "ख",   "थ",   "छ",    "ठ",
                "shift",       "ॐ",    "ँ",   "ण",    "ञ",   "ळ",    "श",     "ज्ञ",  "क्ष",   "del",
                "emoticon","global","space","enter"
        );



        this.hwi01_qwerty03_smallText = Arrays.asList(
                "ॅ"  ,          "॓",   "ॊ",    "ॆ",   "ः",    "।",    "@",   "\"",   "'",   "+",   "-",
                "औ",         "ऐ",   "आ",   "ई",   "ऊ",   "भ",    "ङ",    "घ",   "ध",   "झ",   "ढ",
                "ओ",         "ए",   "अ",   "इ",    "उ",   "फ",   "ऋ",    "ख",   "थ",   "छ",   "ठ",
                "ऑ",        "ॐ",    "ँ",   "ण",    "ञ",   "ळ",    "श",    "ज्ञ",   "क्ष",   "(",   ")",
                "़",         ":",    "ृ",    ";",   "!",   ".",    ",",   "?",    "॰",   "ॽ",
                "⚙","★","lang01","lang02","★"
        );

        this.hwi01_qwerty04_smallText_shift = Arrays.asList(
                "♡",          "",    "",     "",   "",   "~",    "^",    "%",   "&",   "#",    "∞",
                "<",         "\\",   "—",   "/",   ">",   "±",    "[",   "*",   "÷",   "=",     "]",
                ":-)",      ":-(", ";-)", ":'(", ":-D", ":-O", ">:-O",  ":-P", ":-*", ":-|",  ":-$",
                "ऑ",          "",    "",   "ऩ",    "ञ",   "ऴ",    "ॼ",    "ॹ",  "य़",   "(",    ")",
                "ॄ",          "ॢ",    "ॣ",   "ॡ",    "ऌ",   ".",    ",",    "!",  "…",   "_",
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
                "@-;-'--",  ":(",   "♥",  ":)",  ";)",   "@",   "(",    "-",   "&",   "/",     ")",
                "" ,                  "",           "",            "",           "",            "å",
                "" ,           "",    "",    "",    "",    "",     "",    "",    "",    "",      "",
                "æ",                  "",           "",            "",           "",            "ä",
                "€",          "1",   "2",   "3",   "4",   "5",    "6",    "7",   "8",   "9",    "0",
                "" ,                  "",           "",           "m",           "ø",             "",
                "\"",         ":",   ";",   "!",   "?",   ".",    ",",   "…",   "_",   "'",      "",
                "⚙","★","lang01","lang02","★"
        );

        this.hwi02_halfQwerty04_smallText_shift = Arrays.asList(
                "rose",      ":(",   "♥",  ":)",  ";)",   "@",   "(",    "-",   "&",   "/",     ")",
                "" ,                  "",           "",            "",           "",            "Å",
                "" ,           "",    "",    "",    "",    "",     "",    "",    "",    "",      "",
                "Æ",                  "",           "",            "",           "",            "Ä",
                "€",          "1",   "2",   "3",   "4",   "5",    "6",    "7",   "8",   "9",    "0",
                "" ,                  "",           "",            "M",          "Ø",             "",
                "\"",         ":",   ";",   "!",   "?",   ".",    ",",   "…",   "_",   "'",      "",
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
                "@-;-'--",  ":(",   "♥",  ":)",  ";)",   "@",   "(",    "-",   "&",   "/",     ")",
                "q" ,                "e",          "t",           "u",          "o",            "å",
                "" ,           "",    "",    "",    "",    "",     "",    "",    "",    "",      "",
                "a",                 "d",          "g",           "j",          "l",            "ä",
                "€",          "1",   "2",   "3",   "4",   "5",    "6",    "7",   "8",   "9",    "0",
                "æ",                 "z",          "c",          "b",           "m",            "ø",
                "\"",         ":",   ";",   "!",   "?",   ".",    ",",   "…",   "'",    "",      "",


                "⚙","★","lang01","lang02","★"
        );

        this.hwi03_qetuo04_smallText_shift = Arrays.asList(
                "rose",      ":(",   "♥",  ":)",  ";)",   "@",   "(",    "-",   "&",   "/",     ")",
                "Q" ,                "E",          "T",           "U",          "O",            "Å",
                "" ,           "",    "",    "",    "",    "",     "",    "",    "",    "",      "",
                "A",                 "D",          "G",           "J",          "L",            "Ä",
                "€",          "1",   "2",   "3",   "4",   "5",    "6",    "7",   "8",   "9",    "0",
                "Æ",                 "Z",          "C",          "B",           "M",            "Ø",
                "\"",         ":",   ";",   "!",   "?",   ".",    ",",   "…",   "_",   "'",      "",
                "⚙","★","lang01","lang02","★"
        );
    }
}
