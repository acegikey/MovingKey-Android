package com.movingkey.android.movingkey.languages;


import com.movingkey.android.movingkey.languages.bean.Language;

import java.util.Arrays;

/**
 * Created by jhkim on 2016. 3. 4..
 */
public class Bulgarian extends Language
{
    public Bulgarian()
    {
        this.hwi00_languageName = "Bulgarian";
        this.hwi00_languageCode = "bg";

        /// 쿼티 QWERTY
        this.hwi01_qwerty01_normalKey = Arrays.asList(
                "я",   "в",   "е",   "р",   "т",   "ъ",    "у",   "и",   "о",    "п",    "ч",
                "а",   "с",   "д",   "ф",   "г",   "х",    "й",   "к",   "л",    "ш",    "щ",
                "shift",   "з",   "ь",   "ц",   "ж",   "б",    "н",   "м",   "ю",    "del",
                "emoticon", "global", "space", "enter"
        );

        this.hwi01_qwerty02_normalKey_shift = Arrays.asList(
                "Я",   "В",   "Е",   "Р",   "Т",   "Ъ",    "У",   "И",   "О",    "П",    "Ч",
                "А",   "С",   "Д",   "Ф",   "Г",   "Х",    "Й",   "К",   "Л",    "Ш",    "Щ",
                "shift",   "З",   "Ь",   "Ц",   "Ж",   "Б",    "Н",    "М",   "Ю",   "del",
                "emoticon","global","space","enter"
        );



        this.hwi01_qwerty03_smallText = Arrays.asList(
                "\\",   "&",   "%",   "#",   "@",   "/",    "↑",   "Ѝ",   "↓",    "→",   "",
                "<",   "^",   "~",   "*",   ">",   "|",    "(",   "+",   "-",    "=",    ")",
                "€",   "1",   "2",   "3",   "4",   "5",    "6",   "7",   "8",    "9",    "0",
                "&",   ":",   ";",   "!",   "?",   ".",   ",",    "-",   "_",    "'",
                "⚙","★","lang01","lang02","★"
        );

        this.hwi01_qwerty04_smallText_shift = Arrays.asList(
                "\\",   "&",   "%",   "#",   "@",   "/",    "↑",   "Ѝ",   "↓",    "→",   "",
                "<",   "^",   "~",   "*",   ">",   "|",    "(",   "+",   "-",    "=",    ")",
                "€",   "1",   "2",   "3",   "4",   "5",    "6",   "7",   "8",    "9",    "0",
                "&",   ":",   ";",   "!",   "?",   ".",   ",",    "-",   "_",    "'",
                "⚙","★","lang01","lang02","★"
        );







        /// 하프쿼티 Half QWERTY
        this.hwi02_halfQwerty01_normalKey = Arrays.asList(
                "яв","ер","тъ","уи","оп",
                "ас","дф","гх","йк","лш",
                "shift","зь","цж","бн","del",
                "emoticon","global","space","enter"
        );

        this.hwi02_halfQwerty02_normalKey_shift= Arrays.asList(
                "ЯВ","ЕР","ТЪ","УИ","ОП",
                "АС","ДФ","ГХ","ЙК","ЛШ",
                "shift","ЗЬ","ЦЖ","БН","del",
                "emoticon","global","space","enter"
        );

        this.hwi02_halfQwerty03_smallText = Arrays.asList(
                "",          "☆",     "",  "♡",    "",   "@",     "",   "ѝ",    "",    "♪",     "",
                "" ,                  "",           "",            "",           "",            "ч",
                "" ,          "1",    "",   "2",    "",   "3",     "",   "4",    "",    "5",     "",
                "",                   "",           "",            "",           "",            "щ",
                "",           "6",    "",   "7",   "(",   "8",    ")",   "9",    "",    "0",     "",
                "",                   "",           "",           "",           "м",            "ю",
                "&",          ":",   ";",   "!",   "?",   ".",   ",",    "-",   "_",    "'",   "\"",
                "⚙","★","lang01","lang02","★"
        );

        this.hwi02_halfQwerty04_smallText_shift = Arrays.asList(
                "" ,    "",    "",    "",    "",    "",    "",     "",    "",    "",    "",
                "" ,          "Ë",           "",          "Ü",           "Ï",          "Ö",
                "", ":-)",    "", ":-(",    "", ";-)",    "",  ":-D",    "", ":-O",    "",
                "" ,           "",           "",           "",            "",           "",
                "",  ":'(",    "",">:-O",    "", ":-P",    "",  ":-/",    "", ":-|",    "",
                "" ,           "",           "",           "",            "",           "",
                "&",   ":",   ";",   "!",   "?",   ".",   ",",    "-",   "_",   "'",  "\"",
                "⚙","★","lang01","lang02","★"
        );








        /// 케토  QETUO
        this.hwi03_qetuo01_normalKey = Arrays.asList(
                "в","р","ъ","и","п",
                "1","2","3","4","5",
                "shift","ц","б","м","del",
                "emoticon","global","space","enter"
        );


        this.hwi03_qetuo02_normalKey_shift = Arrays.asList(
                "В","Р","Ъ","И","П",
                "С","Ф","Х","К","Ш",
                "shift","Ц","Б","М","del",
                "emoticon","global","space","enter"
        );


        this.hwi03_qetuo03_smallText = Arrays.asList(
                "",          "☆",     "",  "♡",    "",   "@",     "",   "ѝ",    "",    "♪",     "",
                "я",                 "е",          "т",           "у",          "о",            "ч",
                "" ,          "1",    "",   "2",    "",   "3",     "",   "4",    "",    "5",     "",
                "а",                 "д",          "г",           "й",          "л",            "щ",
                "",          "6",    "",   "7",   "(",   "8",    ")",   "9",    "",    "0",     "",
                "з",                 "ь",          "ж",          "н",           "ю",             "",
                "&",          ":",   ";",   "!",   "?",   ".",    ",",   "-",   "_",    "'",   "\"",


                "⚙","★","lang01","lang02","★"
        );

        this.hwi03_qetuo04_smallText_shift = Arrays.asList(
                "",          "☆",     "",  "♡",    "",   "@",     "",   "Ѝ",    "",    "♪",     "",
                "Я",                 "Е",          "Т",           "У",          "О",            "Ч",
                "" ,        ":-)",    "", ":-(",    "", ";-)",     "", ":-D",    "",  ":-O",     "",
                "А",                 "Д",          "Г",           "Й",          "Л",            "Щ",
                "",        ":'(",    "", ">:-O",    "", ":-P",    "", ":-/",    "",  ":-|",     "",
                "З",                 "Ь",          "Ж",          "Н",           "Ю",             "",
                "&",          ":",   ";",   "!",   "?",   ".",    ",",   "-",   "_",    "'",   "\"",
                "⚙","★","lang01","lang02","★"
        );
    }
}
