package com.movingkey.android.movingkey.languages;


import com.movingkey.android.movingkey.languages.bean.Language;

import java.util.Arrays;

/**
 * Created by jhkim on 2016. 3. 5..
 */
public class Thai extends Language
{
    public Thai()
    {
        this.hwi00_languageName = "Thai";
        this.hwi00_languageCode = "th";

        /// 쿼티 QWERTY
        this.hwi01_qwerty01_normalKey = Arrays.asList(
                "ๆ​",          "ๅ​",   "ภ​",   "ถ",    "ุ",    "ึ",    "ค",    "ต",   "จ",   "ข",   "ช",
                "ไ",          "ำ",   "พ",   "ะ",    "ั",    "ี",    "ร",    "น",   "ย",   "บ",   "ล",
                "ฟ",         "ห",    "ก",   "ด",   "เ",    "้",     "่",    "า",   "ส​",   "ว",   "ง",
                "shift",         "ป",    "แ",   "อ",    "ิ",    "ื",    "ท",    "ม",   "ใ",    "del",
                "emoticon", "global", "space", "enter"
        );

        this.hwi01_qwerty02_normalKey_shift = Arrays.asList(
                "๑​",         "๒",   "๓​",   "๔",    "ู",   "฿",    "๕",    "๖",   "๗",   "๘",    "๙",
                "๐",         "ฎ​",   "ฑ​",   "ธ",   "。",    "๊",    "ณ",    "ฯ",   "ญ",   "ฐ​",    "ล",
                "ฤ",         "ฆ​",   "ฏ",   "โ",   "ฌ",    "็",     "๋",    "ษ",   "ศ​",   "ซ",    "ฃ",
                "shift",         "ฃ",   "ฉ",   "ฮ",    "ฺ",    "์",    "ท",    "ฒ",   "ฬ​",   "del",
                "emoticon","global","space","enter"
        );



        this.hwi01_qwerty03_smallText = Arrays.asList(
                "๑​",          "๒",   "๓​",   "๔",    "ู",   "฿",    "๕",    "๖",   "๗",   "๘",   "๙",
                "๐",          "ฎ​",   "ฑ​",   "ธ",   "。",    "๊",    "ณ",    "ฯ",   "ญ",   "ฐ​",   "ล",
                "ฤ",         "ฆ​",    "ฏ",   "โ",   "ฌ",    "็",     "๋",    "ษ",   "ศ​",   "ซ",   "ฃ",
                "ฃ",         "ผ",    "ฉ",   "ฮ",    "ฺ",    "์",    "ท",    "ฒ",   "ฬ​",   "ฦ​",   "ฝ",
                "'",        "\"",    "(",   ")",   "?",   ".",    ",",    "„",    "-",  "!",
                "⚙","★","lang01","lang02","★"
        );

        this.hwi01_qwerty04_smallText_shift = Arrays.asList(
                "@@",      "^.~", "(^_-)","^o^", "^^", "T.T",  "ㅠ.ㅠ",  "——;","-_-;","^^;",  ">_<",
                "$",         "1",   "2",   "3",   "4",   "5",    "6",    "7",   "8",   "9",    "0",
                "<",        "\\",   "—",   "/",   ">",   "@",    "[",    "+",   "-",   "=",    "]",
                "ฅ",         "♪",   "♥",   "☆",   "",   "~",    "^",    "%",   "&",   "#",    "*",
                "'",        "\"",   "!",   "¿",   "?",   ".",    ",",    "„",    "…",   "_",
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
                "" ,                  "",           "",            "",           "m",           "ø",
                "\"",         ":",   ";",   "!",   "?",   ".",    ",",   "…",   "_",   "'",      "",
                "⚙","★","lang01","lang02","★"
        );

        this.hwi02_halfQwerty04_smallText_shift = Arrays.asList(
                "rose",      ":(",   "♥",  ":)",  ";)",   "@",   "(",    "-",   "&",   "/",     ")",
                "" ,                  "",           "",            "",           "",            "Å",
                "" ,           "",    "",    "",    "",    "",     "",    "",    "",    "",      "",
                "Æ",                  "",           "",            "",           "",            "Ä",
                "€",          "1",   "2",   "3",   "4",   "5",    "6",    "7",   "8",   "9",    "0",
                "" ,                  "",           "",           "",            "M",           "Ø",
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
                "æ",                 "z",          "c",           "b",          "m",            "ø",
                "\"",         ":",   ";",   "!",   "?",   ".",    ",",   "…",   "'",    "",      "",


                "⚙","★","lang01","lang02","★"
        );

        this.hwi03_qetuo04_smallText_shift = Arrays.asList(
                "rose",      ":(",   "♥",  ":)",  ";)",   "@",   "(",    "-",   "&",   "/",     ")",
                "Q" ,                "E",          "T",           "U",          "O",            "Å",
                "" ,           "",    "",    "",    "",    "",     "",    "",    "",    "",      "",
                "A",                 "D",          "G",           "J",          "L",            "Ä",
                "€",          "1",   "2",   "3",   "4",   "5",    "6",    "7",   "8",   "9",    "0",
                "Æ",                "Z",          "C",          "B",           "M",             "Ø",
                "\"",         ":",   ";",   "!",   "?",   ".",    ",",   "…",   "_",   "'",      "",
                "⚙","★","lang01","lang02","★"
        );
    }
}
