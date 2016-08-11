package com.movingkey.android.movingkey.languages;


import com.movingkey.android.movingkey.languages.bean.Language;

import java.util.Arrays;

/**
 * Created by jhkim on 2016. 3. 5..
 */
public class Polish extends Language
{
    public Polish()
    {
        this.hwi00_languageName = "Polish";
        this.hwi00_languageCode = "pl";

        /// 쿼티 QWERTY
        this.hwi01_qwerty01_normalKey = Arrays.asList(
                "q",          "w",   "e",   "r",   "t",   "y",    "u",   "i",   "o",   "p" ,
                 "a",   "s",   "d",   "f",   "g",    "h",   "j",   "k",   "l" ,
                "shift",          "z",   "x",   "c",   "v",    "b",   "n",   "m",    "del",
                "emoticon", "global", "space", "enter"
        );

        this.hwi01_qwerty02_normalKey_shift = Arrays.asList(
                "Q",          "W",   "E",   "R",   "T",   "Y",    "U",   "I",   "O",   "P" ,
                "Ą",          "A",   "S",   "D",   "F",   "G",    "H",   "J",   "K",   "L" ,
                "shift",           "Z",   "X",   "C",   "V",    "B",   "N",   "M",   "del",
                "emoticon","global","space","enter"
        );



        this.hwi01_qwerty03_smallText = Arrays.asList(
                "♡",          "",   "ę",    "&",   "~",   "/",   "@",   "(",   "ó",    ")" ,
                "1",          "2",   "3",   "4",   "5",   "6",    "7",   "8",   "9",   "0" ,
                "ż",          "ź",   "ś",   "ć",    "",    "ń",    "",    "",   "ł" ,
                "_",          ":",   ";",   "!",   "?",   ".",    ",",   "'",   "\"",
                "⚙","★","lang01","lang02","★"
        );

        this.hwi01_qwerty04_smallText_shift = Arrays.asList(
                "♡",           "",   "Ę",   "&",   "~",   "/",   "@",   "(",   "Ó",   ")" ,
                ":-)",      ":-(", ";-)", ":'(", ":-D", ":-O", ">:-O", ":-P", ":-/",  ":-|",
                "Ż",          "Ź",   "Ś",   "Ć",    "",    "",    "Ń",    "",  "Ł" ,
                "_",          ":",   ";",   "!",   "?",   ".",    ",",   "'",   "\"",
                "⚙","★","lang01","lang02","★"
        );







        /// 하프쿼티 Half QWERTY
        this.hwi02_halfQwerty01_normalKey = Arrays.asList(
                "qw","er","ty","ui","op",
                "as","df","gh","jk","lm",
                "shift","zx","cv","bn","del",
                "emoticon","global","space","enter"
        );

        this.hwi02_halfQwerty02_normalKey_shift= Arrays.asList(
                "QW","ER","TY","UI","OP",
                "AS","DF","GH","JK","LM",
                "shift","ZX","CV","BN","del",
                "emoticon","global","space","enter"
        );

        this.hwi02_halfQwerty03_smallText = Arrays.asList(
                "",     "",    "",    "",    "",   "@",     "",".com",    "",   "♡",   "/",
                "" ,          "ę",           "",           "",           "ó",           "",
                "",   "1",    "",   "2",    "",   "3",    "",    "4",    "",   "5",    "",
                "ą",          "ś",           "",           "",           "ł",           "",
                "" ,   "6",    "",   "7",   "(",   "8",   ")",    "9",    "",   "0",    "",
                "ź",          "ż",          "ć",           "",           "ń",           "",
                "&",   ":",   ";",   "!",   "?",   ".",   ",",    "-",   "_",   "'",  "\"",
                "⚙","★","lang01","lang02","★"
        );

        this.hwi02_halfQwerty04_smallText_shift = Arrays.asList(
                "" ,    "",    "",    "",    "",    "",    "",     "",    "",    "",    "",
                "" ,          "Ę",           "",           "",           "Ó",           "",
                "",  ":-)",    "", ":-(",    "", ";-)",    "",  ":-D",    "", ":-O",    "",
                "Ą",          "Ś",           "",           "",           "Ł",           "",
                "Ż", ":'(",    "",">:-O",    "", ":-P",    "",  ":-/",    "", ":-|",    "",
                "Ź" ,         "Ż",          "Ć",           "",           "Ń",           "",
                "&",   ":",   ";",   "!",   "?",   ".",   ",",    "-",   "_",   "'",  "\"",
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
                "" ,          "♡",    "",   "ę",    "",   "@",    "", ".com",    "",   "ó",    "/",
                "" ,                 "w",          "r",          "y",           "i",           "p",
                "" ,          "1",   "ś",   "2",   "(",   "3",   ")",    "4",    "",   "5",     "",
                "ą",                 "s",          "f",          "h",           "k",           "ł",
                "ż",          "6",   "ć",   "7",    "",   "8",   "ń",    "9",    "",   "0",     "",
                "ź",                 "z",          "c",          "b",           "m",            "",
                "&",          ":",   ";",   "!",   "?",   ".",   ",",    "-",   "_",   "'",   "\"",

                "⚙","★","lang01","lang02","★"
        );

        this.hwi03_qetuo04_smallText_shift = Arrays.asList(
                "" ,          "♡",    "",   "Ę",    "",   "@",    "", ".com",    "",   "Ó",    "/",
                "" ,                 "W",          "R",          "Y",           "I",           "P",
                "",        ":-)",   "Ś", ":-(",  "(", ";-)",    ")",  ":-D",    "", ":-O",     "",
                "Ą",                 "S",          "F",          "H",           "K",           "Ł",
                "Ż",        ":'(",   "Ć",">:-O",    "", ":-P",   "Ń",  ":-/",    "", ":-|",     "",
                "Ź",                 "Z",          "C",          "B",           "M",            "",
                "&",          ":",   ";",   "!",   "?",   ".",   ",",    "-",   "_",   "'",   "\"",
                "⚙","★","lang01","lang02","★"
        );
    }
}
