package com.movingkey.android.movingkey.languages;


import com.movingkey.android.movingkey.languages.bean.Language;

import java.util.Arrays;

/**
 * Created by jhkim on 2016. 3. 5..
 */
public class Serbian extends Language
{
    public Serbian()
    {
        this.hwi00_languageName = "Serbian";
        this.hwi00_languageCode = "sr";

        /// 쿼티 QWERTY
        this.hwi01_qwerty01_normalKey = Arrays.asList(
                "ž",          "š",   "e",   "r",   "t",   "y",    "u",   "i",   "o",   "p" ,
                 "a",   "s",   "d",   "f",   "g",    "h",   "j",   "k",   "l" ,
                "shift",          "z",   "č",   "c",   "v",    "b",   "n",   "m",   "del",
                "emoticon", "global", "space", "enter"
        );

        this.hwi01_qwerty02_normalKey_shift = Arrays.asList(
                "Ž",          "Š",   "E",   "R",   "T",   "Y",    "U",   "I",   "O",   "P" ,
                 "A",   "S",   "D",   "F",   "G",    "H",   "J",   "K",   "L" ,
                "shift",          "Z",   "Č",   "C",   "V",   "B",    "N",   "M",   "del",
                "emoticon","global","space","enter"
        );



        this.hwi01_qwerty03_smallText = Arrays.asList(
                "q",          "w",    "",    "",    "",   "&",    "~",   "/",   "@", ".com",
                "1",          "2",   "3",   "4",   "5",   "6",    "7",   "8",   "9",   "0" ,
                "♡",           "",    "ć",    "",    "",     "",   "@",    "(",    ")",
                "_",          ":",   ";",   "!",   "?",   ".",    ",",   "'",   "\"",
                "⚙","★","lang01","lang02","★"
        );

        this.hwi01_qwerty04_smallText_shift = Arrays.asList(
                "Q",          "W",    "",    "",    "",   "&",    "~",   "/",   "@", ".com",
                ":-)",      ":-(", ";-)", ":'(", ":-D", ":-O", ">:-O", ":-P", ":-/",  ":-|",
                "♡",         "",   "Ć",   "",    "",      "",    "",   "(",    ")",
                "_",          ":",   ";",   "!",   "?",   ".",    ",",   "'",   "\"",
                "⚙","★","lang01","lang02","★"
        );







        /// 하프쿼티 Half QWERTY
        this.hwi02_halfQwerty01_normalKey = Arrays.asList(
                "žš","er","ty","ui","op",
                "as","df","gh","jk","lm",
                "shift","zč","cv","bn","del",
                "emoticon","global","space","enter"
        );

        this.hwi02_halfQwerty02_normalKey_shift= Arrays.asList(
                "ŽŠ","ER","TY","UI","OP",
                "AS","DF","GH","JK","LM",
                "shift","ZČ","CV","BN","del",
                "emoticon","global","space","enter"
        );

        this.hwi02_halfQwerty03_smallText = Arrays.asList(
                "q",   "w",    "",    "",    "",   "@",     "",".com",    "",   "♡",   "/",
                "" ,           "",           "",           "",            "",           "",
                "",   "1",    "",   "2",    "",   "3",    "",    "4",    "",   "5",    "",
                "" ,           "",           "",           "",            "",           "",
                "",   "6",    "",   "7",   "(",   "8",   ")",    "9",    "",   "0",    "",
                "" ,           "",          "ć",           "",            "",           "",
                "&",   ":",   ";",   "!",   "?",   ".",   ",",    "-",   "_",   "'",  "\"",
                "⚙","★","lang01","lang02","★"
        );

        this.hwi02_halfQwerty04_smallText_shift = Arrays.asList(
                "Q",   "W",    "",    "",    "",   "@",     "",".com",    "",   "♡",   "/",
                "" ,           "",           "",           "",            "",           "",
                "", ":-)",    "", ":-(",    "", ";-)",    "",  ":-D",    "", ":-O",    "",
                "" ,           "",           "",           "",            "",           "",
                "",  ":'(",    "",">:-O",    "", ":-P",    "",  ":-/",    "", ":-|",    "",
                "" ,           "",          "Ć",           "",            "",           "",
                "&",   ":",   ";",   "!",   "?",   ".",   ",",    "-",   "_",   "'",  "\"",
                "⚙","★","lang01","lang02","★"
        );








        /// 케토  QETUO
        this.hwi03_qetuo01_normalKey = Arrays.asList(
                "ž","e","t","u","o",
                "a","d","g","j","l",
                "shift","č","v","n","del",
                "emoticon","global","space","enter"
        );


        this.hwi03_qetuo02_normalKey_shift = Arrays.asList(
                "Ž","E","T","U","O",
                "A","D","G","J","L",
                "shift","Č","V","N","del",
                "emoticon","global","space","enter"
        );


        this.hwi03_qetuo03_smallText = Arrays.asList(
                "" ,          "q",   "w",   "",    "",    "@",     "",".com",    "",   "♡",   "/",
                "" ,                 "š",          "r",          "y",           "i",           "p",
                "" ,          "1",    "",   "2",    "",   "3",    "",    "4",    "",   "5",     "",
                "" ,                 "s",          "f",          "h",           "k",            "",
                "",          "6",   "ć",   "7",    "",   "8",    "",    "9",   "(",   "0",    ")",
                "" ,                 "z",          "c",           "b",          "m",            "",
                "&",          ":",   ";",   "!",   "?",   ".",   ",",    "-",   "_",   "'",   "\"",

                "⚙","★","lang01","lang02","★"
        );

        this.hwi03_qetuo04_smallText_shift = Arrays.asList(
                "" ,          "Q",   "W",    "",    "",    "@",     "",".com",    "",   "♡",   "/",
                "" ,                 "Š",          "R",          "Y",           "I",           "P",
                "" ,        ":-)",    "", ":-(",    "", ";-)",    "",  ":-D",    "", ":-O",     "",
                "" ,                 "S",          "F",          "H",           "K",            "",
                "",        ":'(",   "Ć",">:-O",    "", ":-P",    "",  ":-/",   "(", ":-|",    ")",
                "" ,                 "Z",          "C",          "B",           "M",            "",
                "&",          ":",   ";",   "!",   "?",   ".",   ",",    "-",   "_",   "'",   "\"",
                "⚙","★","lang01","lang02","★"
        );
    }
}
