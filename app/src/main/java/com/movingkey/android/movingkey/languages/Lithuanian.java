package com.movingkey.android.movingkey.languages;


import com.movingkey.android.movingkey.languages.bean.Language;

import java.util.Arrays;

/**
 * Created by jhkim on 2016. 3. 5..
 */
public class Lithuanian extends Language
{
    public Lithuanian()
    {
        this.hwi00_languageName = "Lithuanian";
        this.hwi00_languageCode = "lt";

        /// 쿼티 QWERTY
        this.hwi01_qwerty01_normalKey = Arrays.asList(
                "ą",  "ž",   "e",   "r",   "t",   "y",    "u",   "i",   "o",   "p" ,
                "a",   "s",   "d",   "f",   "g",    "h",   "j",   "k",   "l" ,
                "shift",   "z",   "x",   "c",   "v",    "b",   "n",   "m",   "del",
                "emoticon", "global", "space", "enter"
        );

        this.hwi01_qwerty02_normalKey_shift = Arrays.asList(
                "Ą",   "Ž",   "E",   "R",   "T",   "Y",    "U",   "I",   "O",   "P" ,
                 "A",   "S",   "D",   "F",   "G",    "H",   "J",   "K",   "L" ,
                "shift",  "Z",   "X",   "C",   "V",    "B",   "N",   "M",   "del",
                "emoticon","global","space","enter"
        );



        this.hwi01_qwerty03_smallText = Arrays.asList(
                "q",    "w",   "ę",   "ė",   "",    "ų",    "ū",   "į",   "@",".com" ,
                "1",   "2",   "3",   "4",   "5",   "6",    "7",   "8",   "9",   "0" ,
                "♡",   "š",   "č",    "",   "&",    "~",   "/",   "(",    ")",
                "_",    ":",   ";",   "!",   "?",   ".",    ",",   "'",   "\"",
                "⚙","★","lang01","lang02","★"
        );

        this.hwi01_qwerty04_smallText_shift = Arrays.asList(
                "Q",  "W",   "Ę",   "Ė",    "",   "Ų",    "Ū",   "Į",   "@",".com" ,
                ":-)",  ":-(", ";-)", ":'(", ":-D", ":-O", ">:-O", ":-P", ":-/",  ":-|",
                "♡",    "Š",   "Č",    "",   "&",    "~",   "/",   "(",    ")",
                "_",  ":",   ";",   "!",   "?",   ".",    ",",   "'",   "\"",
                "⚙","★","lang01","lang02","★"
        );







        /// 하프쿼티 Half QWERTY
        this.hwi02_halfQwerty01_normalKey = Arrays.asList(
                "ąž","er","ty","ui","op",
                "as","df","gh","jk","lm",
                "shift","zx","cv","bn","del",
                "emoticon","global","space","enter"
        );

        this.hwi02_halfQwerty02_normalKey_shift= Arrays.asList(
                "ĄŽ","ER","TY","UI","OP",
                "AS","DF","GH","JK","LM",
                "shift","ZX","CV","BN","del",
                "emoticon","global","space","enter"
        );

        this.hwi02_halfQwerty03_smallText = Arrays.asList(
                "q",   "w",    "",    "",    "",    "",   "ū",     "",    "",    "",    "",
                "" ,          "ę",          "ė",          "ų",           "į",           "",
                "",   "1",    "",   "2",    "",   "3",    "",    "4",    "",   "5",    "",
                "" ,          "š",           "",           "",            "",           "",
                "",   "6",    "",   "7",   "(",   "8",   ")",    "9",    "",   "0",    "",
                "" ,          "ž",          "č",           "",          "ņ",            "",
                "&",   ":",   ";",   "!",   "?",   ".",   ",",    "-",   "_",   "'",  "\"",
                "⚙","★","lang01","lang02","★"
        );

        this.hwi02_halfQwerty04_smallText_shift = Arrays.asList(
                "Q",   "W",    "",    "",    "",    "",   "Ū",     "",    "",    "",    "",
                "" ,          "Ę",          "Ė",          "Ų",           "Į",           "",
                "", ":-)",    "", ":-(",    "", ";-)",    "",  ":-D",    "", ":-O",    "",
                "" ,          "Š",           "",           "",            "",           "",
                "",  ":'(",    "",">:-O",    "", ":-P",    "",  ":-/",    "", ":-|",    "",
                "" ,          "Ž",          "Č",           "",            "",           "",
                "&",   ":",   ";",   "!",   "?",   ".",   ",",    "-",   "_",   "'",  "\"",
                "⚙","★","lang01","lang02","★"
        );








        /// 케토  QETUO
        this.hwi03_qetuo01_normalKey = Arrays.asList(
                "ą","e","t","u","o",
                "a","d","g","j","l",
                "shift","x","v","n","del",
                "emoticon","global","space","enter"
        );


        this.hwi03_qetuo02_normalKey_shift = Arrays.asList(
                "Ą","E","T","U","O",
                "A","D","G","J","L",
                "shift","X","V","N","del",
                "emoticon","global","space","enter"
        );


        this.hwi03_qetuo03_smallText = Arrays.asList(
                "" ,          "q",   "w",   "ę",   "ė",   "",    "ų",    "ū",   "į",    "",    "" ,
                "" ,                 "ž",          "r",          "y",           "i",           "p",
                "" ,          "1",   "š",   "2",    "",   "3",    "",    "4",    "",   "5",     "",
                "" ,                 "s",          "f",          "h",           "k",            "",
                "",          "6",   "č",   "7",    "",   "8",    "",    "9",   "(",   "0",    ")",
                "" ,                 "z",          "c",           "b",          "m",            "",
                "&",          ":",   ";",   "!",   "?",   ".",   ",",    "-",   "_",   "'",   "\"",

                "⚙","★","lang01","lang02","★"
        );

        this.hwi03_qetuo04_smallText_shift = Arrays.asList(
                "" ,          "Q",   "W",   "Ę",   "Ė",    "",   "Ų",    "Ū",   "Į",    "",    "" ,
                "" ,                 "Ž",          "R",          "Y",           "I",          "P" ,
                "",        ":-)",   "Š", ":-(",    "", ";-)",    "",  ":-D",    "", ":-O",     "",
                "" ,                 "S",          "F",          "H",           "K",            "",
                "",        ":'(",   "Č",">:-O",    "", ":-P",    "",  ":-/",   "(", ":-|",    ")",
                "" ,                 "Z",          "C",          "B",           "M",            "",
                "&",          ":",   ";",   "!",   "?",   ".",   ",",    "-",   "_",   "'",   "\"",
                "⚙","★","lang01","lang02","★"
        );
    }
}
