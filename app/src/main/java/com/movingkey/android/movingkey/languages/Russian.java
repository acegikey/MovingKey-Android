package com.movingkey.android.movingkey.languages;


import com.movingkey.android.movingkey.languages.bean.Language;

import java.util.Arrays;

/**
 * Created by jhkim on 2016. 3. 5..
 */
public class Russian extends Language
{
    public Russian()
    {
        this.hwi00_languageName = "Russian";
        this.hwi00_languageCode = "ru";

        /// 쿼티 QWERTY
        this.hwi01_qwerty01_normalKey = Arrays.asList(
                "Й", "Ц", "У", "К", "Е", "Н", "Г", "Ш", "Щ", "З", "Х",
                "Ф", "Ы", "В", "А", "П", "Р", "О", "Л", "Д", "Ж", "Э",
                "shift", "Я", "Ч", "С", "М", "И", "Т", "Ь", "Б", "Ю", "del",
                "emoticon", "global", "space", "enter"
        );

        this.hwi01_qwerty02_normalKey_shift = Arrays.asList(
                "Й",          "Ц",   "У",   "К",   "Е",   "Н",    "Г",   "Ш",   "Щ",   "З",    "Х",
                "Ф",          "Ы",   "В",   "А",   "П",   "Р",   "О",    "Л",   "Д",   "Ж",    "Э",
                "shift",          "Я",   "Ч",   "С",   "М",   "И",   "Т",    "Ь",   "Б",   "Ю",    "del",
                "emoticon","global","space","enter"
        );



        this.hwi01_qwerty03_smallText = Arrays.asList(
                "♡",           "",    "",    "",   "Ё",    "",    "",     "",   "&",   "@", ".com",
                "€",          "1",   "2",   "3",   "4",   "5",   "6",    "7",   "8",   "9",    "0",
                "(",          "*",   "•",   "/",   ")",   "<",   "+",    "Ъ",   "−",   "=",    ">",
                "~",          ":",   ";",   "!",   "?",   ".",   ",",    "'",  "\"",    "-",   "_",
                "⚙","★","lang01","lang02","★"
        );

        this.hwi01_qwerty04_smallText_shift = Arrays.asList(
                "♡",           "",    "",    "",   "Ё",    "",    "",     "",   "&",   "@", ".com",
                ":-)",      ":-(", ";-)", ":'(", ":-D", ":-O", ">:-O", ":-P", ":-/", ":-|",  ":-$",
                "(",          "*",   "•",   "/",   ")",   "<",   "+",    "Ъ",   "−",   "=",    ">",
                "~",          ":",   ";",   "!",   "?",   ".",   ",",    "'",  "\"",    "-",   "_",
                "⚙","★","lang01","lang02","★"
        );







        /// 하프쿼티 Half QWERTY
        this.hwi02_halfQwerty01_normalKey = Arrays.asList(
                "йц","ук","ен","гш","щз",
                "фы","ва","пр","ол","дж",
                "shift","см","ит","ьб","del",
                "emoticon","global","space","enter"
        );

        this.hwi02_halfQwerty02_normalKey_shift= Arrays.asList(
                "ЙЦ","УК","ЕН","ГШ","ЩЗ",
                "ФЫ","ВА","ПР","ОЛ","ДЖ",
                "shift","СМ","ИТ","ЬБ","del",
                "emoticon","global","space","enter"
        );

        this.hwi02_halfQwerty03_smallText = Arrays.asList(
                "" ,          "♡",     "",   "",    "",   "ё",     "",   "@",    "", ".com",    "/",
                "" ,                  "",           "",            "",           "",            "х",
                "" ,          "1",    "",   "2",    "",   "3",     "",   "4",    "",    "5",     "",
                "",                   "",           "",            "",           "",            "э",
                "",           "6",    "",   "7",    "",   "8",     "",   "9",    "",    "0",     "",
                "я",                 "ч",           "",           "ъ",          "ю",             "",
                "&",          ":",   ";",   "!",   "?",   ".",   ",",    "_",   "-",    "'",   "\"",
                "⚙","★","lang01","lang02","★"
        );

        this.hwi02_halfQwerty04_smallText_shift = Arrays.asList(
                "" ,          "♡",     "",   "",    "",   "Ё",     "",   "@",    "", ".com",    "/",
                "" ,                  "",           "",            "",           "",            "Х",
                "" ,        ":-)",    "", ":-(",    "", ";-)",     "", ":-D",    "",  ":-O",     "",
                "" ,                  "",           "",            "",           "",            "Э",
                "",        ":'(",    "", ">:-O",    "", ":-P",    "", ":-/",    "",  ":-|",     "",
                "Я",                 "Ч",          "",            "Ъ",          "Ю",             "",
                "&",          ":",   ";",   "!",   "?",   ".",   ",",    "_",   "-",    "'",   "\"",
                "⚙","★","lang01","lang02","★"
        );








        /// 케토  QETUO
        this.hwi03_qetuo01_normalKey = Arrays.asList(
                "ц","к","н","ш","з",
                "ы","а","р","л","ж",
                "shift","с","и","ь","del",
                "emoticon","global","space","enter"
        );


        this.hwi03_qetuo02_normalKey_shift = Arrays.asList(
                "Ц","К","Н","Ш","З",
                "Ы","А","Р","Л","Ж",
                "shift","С","И","Ь","del",
                "emoticon","global","space","enter"
        );


        this.hwi03_qetuo03_smallText = Arrays.asList(
                "" ,          "♡",     "",   "",     "",  "ё",     "",   "@",    "", ".com",   "/",
                "й",                 "у",          "е",           "г",          "щ",           "х",
                "€",          "1",   "2",   "3",   "4",   "5",   "6",    "7",   "8",   "9",    "0",
                "ф",                 "в",          "п",           "о",          "д",           "э",
                "",          "6",    "",   "7",    "",   "8",    "ъ",   "9",    "",   "0",     "",
                "я",                 "ч",          "м",           "т",          "б",           "ю",
                "&",          ":",   ";",   "!",   "?",   ".",   ",",    "_",   "-",   "'",   "\"",

                "⚙","★","lang01","lang02","★"
        );

        this.hwi03_qetuo04_smallText_shift = Arrays.asList(
                "" ,          "♡",     "",   "",    "",   "Ё",     "",   "@",    "", ".com",    "/",
                "Й",                 "У",          "Е",           "Г",          "Щ",            "Х",
                "" ,        ":-)",    "", ":-(",    "", ";-)",     "", ":-D",    "",  ":-O",     "",
                "Ф",                 "В",          "П",          "О",           "Д",            "Э",
                "",        ":'(",    "", ">:-O",    "", ":-P",   "Ъ", ":-/",    "",  ":-|",     "",
                "Я",                 "Ч",          "М",          "Т",           "Б",            "Ю",
                "&",          ":",   ";",   "!",   "?",   ".",   ",",    "_",   "-",    "'",   "\"",
                "⚙","★","lang01","lang02","★"
        );

    }
}
