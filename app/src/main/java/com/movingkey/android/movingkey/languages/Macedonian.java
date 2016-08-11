package com.movingkey.android.movingkey.languages;


import com.movingkey.android.movingkey.languages.bean.Language;

import java.util.Arrays;

/**
 * Created by jhkim on 2016. 3. 5..
 */
public class Macedonian extends Language
{
    public Macedonian()
    {
        this.hwi00_languageName = "Macedonian";
        this.hwi00_languageCode = "mk";

        /// 쿼티 QWERTY
        this.hwi01_qwerty01_normalKey = Arrays.asList(

                "Љ",  "Њ",   "Е",   "Р",   "Т",   "S",    "У",   "И",   "О",    "П",    "Ш",
                "А", "С",   "Д",   "Ф",   "Г",   "Х",    "Ј",   "К",   "Л",    "Ч",    "Ќ",
                "shift",  "З",   "Џ",   "Ц",   "В",   "Б",   "Н",    "М",   "Ѓ",   "Ж",     "del",
                "emoticon", "global", "space", "enter"
        );

        this.hwi01_qwerty02_normalKey_shift = Arrays.asList(
                "Љ",          "Њ",   "Е",   "Р",   "Т",   "S",    "У",   "И",   "О",    "П",    "Ш",
                "А",          "С",   "Д",   "Ф",   "Г",   "Х",    "Ј",   "К",   "Л",    "Ч",    "Ќ",
                "shift",          "З",   "Џ",   "Ц",   "В",   "Б",   "Н",    "М",   "Ѓ",   "Ж", "del",
                "emoticon","global","space","enter"
        );



        this.hwi01_qwerty03_smallText = Arrays.asList(
                "♡",           "",   "Ѐ",   "",    "",    "",      "",   "Ѝ",   "",     "",  ".com",
                "" ,           "",   "%",   "&",   "#",   "^",    "*",   "@",   "/",   "(",     ")",
                ":-)",      ":-(", ";-)", ":'(", ":-D", ":-O", ">:-O", ":-P", ":-/", ":-|",   ":-$",
                "~",          ":",   ";",   "!",   "?",   ".",   ",",    "'",  "\"",    "-",    "_",
                "⚙","★","lang01","lang02","★"
        );

        this.hwi01_qwerty04_smallText_shift = Arrays.asList(
                "♡",           "",   "Ѐ",   "",    "",    "",      "",   "Ѝ",   "",     "",  ".com",
                "" ,           "",   "%",   "&",   "#",   "^",    "*",   "@",   "/",   "(",     ")",
                ":-)",      ":-(", ";-)", ":'(", ":-D", ":-O", ">:-O", ":-P", ":-/", ":-|",   ":-$",
                "~",          ":",   ";",   "!",   "?",   ".",   ",",    "'",  "\"",    "-",    "_",
                "⚙","★","lang01","lang02","★"
        );







        /// 하프쿼티 Half QWERTY
        this.hwi02_halfQwerty01_normalKey = Arrays.asList(
                "љњ","ер","тѕ","уи","оп",
                "aС","дф","гх","jк","лч",
                "shift","цв","бн","Мѓ","del",
                "emoticon","global","space","enter"
        );

        this.hwi02_halfQwerty02_normalKey_shift= Arrays.asList(
                "ЉЊ","ЕР","ТS","УИ","ОП",
                "АС","ДФ","ГХ","JK","ЛЧ",
                "shift","ЦВ","БН","МЃ","del",
                "emoticon","global","space","enter"
        );

        this.hwi02_halfQwerty03_smallText = Arrays.asList(
                "",            "",    "",    "",    "",   "@",     "",".com",    "",   "♡",     "/",
                "" ,                 "Ѐ",           "",            "",          "ѝ",            "ш",
                "" ,          "1",    "",   "2",    "",   "3",     "",   "4",    "",    "5",     "",
                "" ,                  "",           "",            "",           "",            "ќ",
                "",          "6",    "",   "7",   "(",   "8",    ")",   "9",    "",    "0",     "",
                "з",                 "џ",          "",             "",          "ж",             "",
                "&",          ":",   ";",   "!",   "?",   ".",    ",",    "-",   "_",   "'",   "\"",
                "⚙","★","lang01","lang02","★"
        );

        this.hwi02_halfQwerty04_smallText_shift = Arrays.asList(
                "",            "",    "",    "",    "",   "@",     "",".com",    "",   "♡",     "/",
                "" ,                 "Ѐ",           "",            "",          "Ѝ",            "Ш",
                "" ,          "1",    "",   "2",    "",   "3",     "",   "4",    "",    "5",     "",
                "" ,                  "",           "",            "",           "",            "Ќ",
                "",          "6",    "",   "7",   "(",   "8",    ")",   "9",    "",    "0",     "",
                "З" ,                "Џ",          "",             "",          "Ж",             "",
                "&",          ":",   ";",   "!",   "?",   ".",    ",",    "-",   "_",   "'",   "\"",
                "⚙","★","lang01","lang02","★"
        );








        /// 케토  QETUO
        this.hwi03_qetuo01_normalKey = Arrays.asList(
                "њ","р","s","и","п",
                "с","ф","х","к","ч",
                "shift","ц","б","м","del",
                "emoticon","global","space","enter"
        );


        this.hwi03_qetuo02_normalKey_shift = Arrays.asList(
                "Њ","Р","S","И","П",
                "С","Ф","Х","К","Ч",
                "shift","Ц","Б","М","del",
                "emoticon","global","space","enter"
        );


        this.hwi03_qetuo03_smallText = Arrays.asList(
                "",           "♡",    "",   "ѐ",    "",   "@",     "",   "ѝ",   "",  ".com",    "/",
                "љ",                 "е",          "т",           "у",          "о",            "ш",
                "" ,          "1",    "",   "2",    "",   "3",     "",   "4",    "",    "5",     "",
                "а",                 "д",          "г",           "j",          "л",            "ќ",
                "",          "6",    "",   "7",   "(",   "8",    ")",   "9",    "",    "0",     "",
                "з",                 "џ",          "в",          "н",           "ѓ",            "ж",
                "&",          ":",   ";",   "!",   "?",   ".",    ",",   "-",   "_",    "'",   "\"",

                "⚙","★","lang01","lang02","★"
        );

        this.hwi03_qetuo04_smallText_shift = Arrays.asList(
                "",           "♡",    "",   "Ѐ",    "",   "@",     "",   "Ѝ",   "",  ".com",    "/",
                "Љ",                 "Е",          "Т",           "У",          "О",            "Ш",
                "" ,        ":-)",    "", ":-(",    "", ";-)",     "", ":-D",    "",  ":-O",     "",
                "А",                 "Д",          "Г",           "J",          "Л",            "Ќ",
                "",        ":'(",    "", ">:-O",    "", ":-P",    "", ":-/",    "",  ":-|",     "",
                "З",                 "Џ",          "В",          "Н",           "Ѓ",            "Ж",
                "&",          ":",   ";",   "!",   "?",   ".",    ",",   "-",   "_",    "'",   "\"",
                "⚙","★","lang01","lang02","★"
        );

    }
}
