package com.movingkey.android.movingkey.languages;


import com.movingkey.android.movingkey.languages.bean.Language;

import java.util.Arrays;

/**
 * Created by jhkim on 2016. 3. 4..
 */
public class Catalan extends Language
{
    public Catalan()
    {
        this.hwi00_languageName = "Catalan";
        this.hwi00_languageCode = "ca";

        /// 쿼티 QWERTY
        this.hwi01_qwerty01_normalKey = Arrays.asList(
                "q",   "w",   "e",   "r",   "t",   "y",    "u",   "i",   "o",   "p" ,
                "a",   "s",   "d",   "f",   "g",    "h",   "j",   "k",   "l" ,
                "shift",   "z",   "x",   "c",   "v",    "b",   "n",   "m",   "del",
                "emoticon", "global", "space", "enter"
        );

        this.hwi01_qwerty02_normalKey_shift = Arrays.asList(
                "Q","W","E","R","T","Y","U","I","O","P",
                "A","S","D","F","G","H","J","K","L",
                "shift","Z","X","C","V","B","N","M","del",
                "emoticon","global","space","enter"
        );



        this.hwi01_qwerty03_smallText = Arrays.asList(
                "♡",          "è",   "é",    "",   "ú",   "ü",    "í",   "ï",   "ò",   "ó" ,
                "1",          "2",   "3",   "4",   "5",   "6",    "7",   "8",   "9",   "0" ,
                   "à",    "",   "ç",   "&",   "/",    "ñ",   "@",   "(",   ")" ,
                "_",          ":",   ";",   "!",   "?",   ".",    ",",   "'",   "\"",
                "⚙","★","lang01","lang02","★"
        );

        this.hwi01_qwerty04_smallText_shift = Arrays.asList(
                "♡",   "È",   "É",    "",   "Ú",   "Ü",    "Í",   "Ï",   "Ò",   "Ó" ,
                "1",   "2",   "3",   "4",   "5",   "6",    "7",   "8",   "9",   "0" ,
                "À",    "",   "Ç",   "&",   "/",    "Ñ",   "@",   "(",   ")",
                "_",   ":",   ";",   "!",   "?",   ".",    ",",   "'",   "\"",
                "⚙","★","lang01","lang02","★"
        );







        /// 하프쿼티 Half QWERTY
        this.hwi02_halfQwerty01_normalKey = Arrays.asList(
                "qw", "er", "ty", "ui", "op",
                "as", "df", "gh", "jk", "lm",
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
                "" ,    "",   "É",    "",    "",    "",   "Ú",     "",   "Í",    "",   "Ò",
                "" ,          "È",           "",          "Ü",           "Ï",          "Ó",
                "",    "1",    "",   "2",    "",   "3",    "",    "4",    "",   "5",    "",
                "À",           "",           "",           "",            "",           "",
                "",   "6",    "",   "7",   "(",   "8",   ")",    "9",    "",   "0",    "",
                "" ,          "",           "Ç",           "",           "Ñ",           "",
                "&",   ":",   ";",   "!",   "?",   ".",   ",",    "-",   "_",   "'",  "\"",
                "⚙","★","lang01","lang02","★"
        );

        this.hwi02_halfQwerty04_smallText_shift = Arrays.asList(
                "" ,    "",   "É",    "",    "",    "",   "Ú",     "",   "Í",    "",   "Ò",
                "" ,          "È",           "",          "Ü",           "Ï",          "Ó",
                "", ":-)",    "", ":-(",    "", ";-)",    "",  ":-D",    "", ":-O",    "",
                "À",          "",          "(",          ")",            "",          "",
                "",  ":'(",    "",">:-O",    "", ":-P",    "",  ":-/",    "", ":-|",    "",
                "" ,           "",          "Ç",           "",           "Ñ",           "",
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
                "@",          "" ,   "é",   "è",    "",   "ú",   "ü",    "í",   "ï",   "ó",    "ò",
                "" ,                 "w",          "r",          "y",           "i",           "p",
                "",           "1",    "",   "2",   "(",   "3",   ")",    "4",    "",   "5",     "",
                "à",                 "s",          "f",          "h",           "k",            "",
                "",          "6",   "ç",   "7",    "",   "8",   "ñ",    "9",    "",   "0",     "",
                "" ,                 "z",          "c",          "b",           "m",            "",
                "&",          ":",   ";",   "!",   "?",   ".",   ",",    "-",   "_",   "'",   "\"",

                "⚙","★","lang01","lang02","★"
        );

        this.hwi03_qetuo04_smallText_shift = Arrays.asList(
                "@",           "",   "É",   "È",    "",   "Ú",    "Ü",   "Í",   "Ï",   "Ó",    "Ò",
                "" ,                 "W",          "R",          "Y",           "I",           "P",
                "",        ":-)",    "", ":-(",    "", ";-)",    "",  ":-D",    "", ":-O",     "",
                "À",                 "S",          "F",          "H",           "K",            "",
                "",         ":'(",   "Ç",">:-O",    "", ":-P",   "Ñ",  ":-/",    "", ":-|",     "",
                "" ,                 "Z",          "C",          "B",           "M",            "",
                "&",          ":",   ";",   "!",   "?",   ".",   ",",    "-",   "_",   "'",   "\"",
                "⚙","★","lang01","lang02","★"
        );
    }
}
