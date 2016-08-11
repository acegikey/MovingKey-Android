package com.movingkey.android.movingkey.languages;


import com.movingkey.android.movingkey.languages.bean.Language;

import java.util.Arrays;

/**
 * Created by jhkim on 2016. 3. 5..
 */
public class Portuguese extends Language
{
    public Portuguese()
    {
        this.hwi00_languageName = "Portuguese";
        this.hwi00_languageCode = "pt";

        /// 쿼티 QWERTY
        this.hwi01_qwerty01_normalKey = Arrays.asList(
                "q",          "w",   "e",   "r",   "t",   "y",    "u",   "i",   "o",   "p" ,
                  "a",   "s",   "d",   "f",   "g",    "h",   "j",   "k",   "l" ,
                "shift" ,          "z",   "x",   "c",   "v",    "b",   "n",   "m",   "del",
                "emoticon", "global", "space", "enter"
        );

        this.hwi01_qwerty02_normalKey_shift = Arrays.asList(
                "Q",  "W",   "E",   "R",   "T",   "Y",    "U",   "I",   "O",   "P" ,
                "A",   "S",   "D",   "F",   "G",    "H",   "J",   "K",   "L" ,
                "shift", "Z",   "X",   "C",   "V",    "B",   "N",   "M",   "del",
                "emoticon","global","space","enter"
        );



        this.hwi01_qwerty03_smallText = Arrays.asList(
                "♡", "é",   "ê",    "",".com",    "",    "ú",   "ó",   "ô",   "õ" ,
                "1",  "2",   "3",   "4",   "5",   "6",    "7",   "8",   "9",   "0" ,
                "ã",   "â",   "ç",   "@",   "&",    "~",   "/",   "(",    ")",
                "_",  ":",   ";",   "!",   "?",   ".",    ",",   "'",   "\"",
                "⚙","★","lang01","lang02","★"
        );

        this.hwi01_qwerty04_smallText_shift = Arrays.asList(
                "♡",          "É",   "Ê",    "",".com",    "",    "Ú",   "Ó",   "Ô",   "Õ" ,
                ":-)",      ":-(", ";-)", ":'(", ":-D", ":-O", ">:-O", ":-P", ":-/",  ":-|",
                "Ã",   "Â",   "Ç",   "@",   "&",    "~",   "/",   "(",    ")",
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
                "" ,   "♡",    "",   "ê",    "",   "@",    "", ".com",    "",   "ó",   "/",
                "" ,          "é",           "",          "ú",           "ô",          "õ",
                "á",   "1",    "",   "2",    "",   "3",    "",    "4",    "",   "5",    "",
                "à",          "â",           "",           "",           "ł",           "",
                "ã",   "6",    "",   "7",   "(",   "8",   ")",    "9",    "",   "0",    "",
                "" ,           "",          "ç",           "",            "",           "",
                "&",   ":",   ";",   "!",   "?",   ".",   ",",    "-",   "_",   "'",  "\"",
                "⚙","★","lang01","lang02","★"
        );

        this.hwi02_halfQwerty04_smallText_shift = Arrays.asList(
                "" ,   "♡",    "",   "Ê",    "",   "@",    "", ".com",    "",   "Ó",   "/",
                "" ,          "É",           "",           "",           "Ô",          "Õ",
                "Á", ":-)",    "", ":-(",    "", ";-)",    "",  ":-D",    "", ":-O",    "",
                "À",          "Â",           "",           "",            "",           "",
                "Ã", ":'(",    "",">:-O",    "", ":-P",    "",  ":-/",    "", ":-|",    "",
                "" ,           "",          "Ç",           "",            "",           "",
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
                "" ,       ".com",   "é",   "ê",   "♡",   "@",   "/",    "ú",   "ó",   "ô",   "õ",
                "" ,                 "w",          "r",          "y",           "i",           "p",
                "á",          "1",    "",   "2",   "(",   "3",   ")",    "4",    "",   "5",     "",
                "à",                 "s",          "f",          "h",           "k",            "",
                "ã",          "6",   "ç",   "7",    "",   "8",    "",    "9",    "",   "0",     "",
                "â",                 "z",          "c",          "b",           "m",            "",
                "&",          ":",   ";",   "!",   "?",   ".",   ",",    "-",   "_",   "'",   "\"",

                "⚙","★","lang01","lang02","★"
        );

        this.hwi03_qetuo04_smallText_shift = Arrays.asList(
                "" ,        ".com",   "É",   "Ê",  "♡",   "@",   "/",    "Ú",   "Ó",   "Ô",   "Õ" ,
                "" ,                 "W",          "R",          "Y",           "I",           "P",
                "Á",        ":-)",    "", ":-(",  "(", ";-)",    ")",  ":-D",    "", ":-O",     "",
                "À",                 "S",          "F",          "H",           "K",            "",
                "Ã",        ":'(",   "Ç",">:-O",    "", ":-P",    "",  ":-/",    "", ":-|",     "",
                "Â",                 "Z",          "C",          "B",           "M",            "",
                "&",          ":",   ";",   "!",   "?",   ".",   ",",    "-",   "_",   "'",   "\"",
                "⚙","★","lang01","lang02","★"
        );
    }
}
