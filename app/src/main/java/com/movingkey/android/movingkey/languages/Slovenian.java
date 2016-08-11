package com.movingkey.android.movingkey.languages;


import com.movingkey.android.movingkey.languages.bean.Language;

import java.util.Arrays;

/**
 * Created by jhkim on 2016. 3. 5..
 */
public class Slovenian extends Language
{
    public Slovenian()
    {
        this.hwi00_languageName = "Slovenian";
        this.hwi00_languageCode = "sl";

        /// 쿼티 QWERTY
        this.hwi01_qwerty01_normalKey = Arrays.asList(
                "q",  "w",   "e",   "r",   "t",   "z",    "u",   "i",   "o",   "p" ,
                "a",   "s",   "d",   "f",   "g",    "h",   "j",   "k",   "l" ,
                "shift",  "y",   "x",   "c",   "v",   "b",    "n",   "m",   "del",
                "emoticon", "global", "space", "enter"
        );

        this.hwi01_qwerty02_normalKey_shift = Arrays.asList(
                "Q",  "W",   "E",   "R",   "T",   "Z",    "U",   "I",   "O",   "P" ,
                 "A",   "S",   "D",   "F",   "G",    "H",   "J",   "K",   "L" ,
                "shift",  "Y",   "X",   "C",   "V",   "B",    "N",   "M",   "del",
                "emoticon","global","space","enter"
        );



        this.hwi01_qwerty03_smallText = Arrays.asList(
                "ê",          "è",   "ë",   "é",   "@",   "ž",    "ú",   "í",   "ò",   "ó" ,
                "á",          "à",   "š",   "đ",   "(",   ")",    "ü",   "&",   "ö",   "ô" ,
                "1",          "2",   "3",   "4",   "5",   "6",    "7",   "8",   "9",
                "_",          ":",   ";",   "!",   "?",   ".",    ",",   "'",   "\"",
                "⚙","★","lang01","lang02","★"
        );

        this.hwi01_qwerty04_smallText_shift = Arrays.asList(
                "Ê",          "È",   "Ë",   "É",   "@",   "Ž",    "Ú",   "Í",   "Ò",   "Ó" ,
                "Á",          "À",   "Š",   "Đ",   "(",   ")",    "Ü",   "&",   "Ö",   "Ô" ,
                ":-)",      ":-(", ";-)", ":'(", ":-D", ":-O", ">:-O", ":-P", ":-/",
                "_",          ":",   ";",   "!",   "?",   ".",    ",",   "'",   "\"",
                "⚙","★","lang01","lang02","★"
        );







        /// 하프쿼티 Half QWERTY
        this.hwi02_halfQwerty01_normalKey = Arrays.asList(
                "qw","er","tz","ui","op",
                "as","df","gh","jk","lm",
                "shift","yx","cv","bn","del",
                "emoticon","global","space","enter"
        );

        this.hwi02_halfQwerty02_normalKey_shift= Arrays.asList(
                "QW","ER","TZ","UI","OP",
                "AS","DF","GH","JK","LM",
                "shift","YX","CV","BN","del",
                "emoticon","global","space","enter"
        );

        this.hwi02_halfQwerty03_smallText = Arrays.asList(
                "" ,    "",   "è",   "ë",    "",   "ž",    "ü",   "í",   "ò",   "ö",   "ó",
                "" ,          "é",          "ê",           "ú",           "",          "ô",
                "à",   "1",    "",   "2",    "",   "3",    "",    "4",    "",   "5",    "",
                "á",          "š",          "đ",           "",            "",           "",
                "ä",   "6",    "",   "7",   "(",   "8",   ")",    "9",    "",   "0",    "",
                "" ,           "",          "č",          "ć",            "",           "",
                "&",   ":",   ";",   "!",   "?",   ".",   ",",    "-",    "_",  "'",  "\"",
                "⚙","★","lang01","lang02","★"
        );

        this.hwi02_halfQwerty04_smallText_shift = Arrays.asList(
                "" ,    "",   "È",   "Ë",    "",   "Ž",   "Ü",    "Í",   "Ò",   "Ö",   "Ó",
                "" ,          "É",           "",          "Ú",            "",          "Ô",
                "À", ":-)",    "", ":-(",    "", ";-)",    "",  ":-D",    "", ":-O",    "",
                "Á",          "Š",          "Đ",           "",            "",           "",
                "Ä", ":'(",    "",">:-O",    "", ":-P",    "",  ":-/",    "", ":-|",    "",
                "" ,           "",          "Č",          "Ć",            "",           "",
                "&",   ":",   ";",   "!",   "?",   ".",   ",",    "-",    "_",  "'",  "\"",
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
                "ê",          "è",   "ë",   "é",    "",    "",   "ü",    "ú",   "ö",   "ò",   "ó",
                "" ,                 "w",          "r",          "z",           "i",          "p",
                "à",          "1",   "ď",   "2",    "",   "3",   "ž",    "4",   "í",   "5",   "ô",
                "á",                 "s",          "f",          "h",           "k",           "",
                "ä",          "6",   "č",   "7",   "ć",   "8",    "",    "9",    "",   "0",    "",
                "" ,                 "y",          "c",           "b",          "m",           "",
                "&",          ":",   ";",   "!",   "?",   ".",   ",",    "_",    "-",  "'",  "\"",

                "⚙","★","lang01","lang02","★"
        );

        this.hwi03_qetuo04_smallText_shift = Arrays.asList(
                "Ê",          "È",   "Ë",   "É",    "",   "",    "Ü",    "Ú",   "Ö",   "Ò",   "Ó",
                "" ,                 "W",          "R",          "Z",           "I",          "P",
                "À",        ":-)",   "Ď", ":-(",    "", ";-)",    "",  ":-D",    "", ":-O",   "Ô",
                "Á",                 "S",          "F",          "H",           "K",           "",
                "Ä",        ":'(",   "Č",">:-O",   "Ć", ":-P",    "",  ":-/",    "", ":-|",    "",
                "" ,                 "Y",          "C",          "B",           "M",           "",
                "&",          ":",   ";",   "!",   "?",   ".",   ",",    "_",    "-",  "'",  "\"",
                "⚙","★","lang01","lang02","★"
        );
    }
}
