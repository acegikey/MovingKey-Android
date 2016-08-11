package com.movingkey.android.movingkey.languages;


import com.movingkey.android.movingkey.languages.bean.Language;

import java.util.Arrays;

/**
 * Created by jhkim on 2016. 3. 4..
 */
public class Georgian extends Language
{
    public Georgian()
    {
        this.hwi00_languageName = "Georgian";
        this.hwi00_languageCode = "ka";

        /// 쿼티 QWERTY
        this.hwi01_qwerty01_normalKey = Arrays.asList(
                "ღ", "ჯ",  "უ",   "კ",   "ე",   "ნ",     "გ",   "შ",   "წ",   "ზ" ,
                "ფ",  "ძ",   "ვ",   "თ",   "ა",   "პ",    "რ",   "ო",  "ლ",
                "shift", "ჩ",   "ყ",    "ს",   "მ",   "ი",    "ტ",   "ქ",   "del",
                "emoticon", "global", "space", "enter"
        );

        this.hwi01_qwerty02_normalKey_shift = Arrays.asList(
                "ღ",          "ჯ",  "უ",   "კ",   "ე",   "ნ",     "გ",   "შ",   "წ",   "ზ" ,
                "ფ",          "ძ",   "ვ",   "თ",   "ა",   "პ",    "რ",   "ო",  "ლ",
                "shift",          "ჩ",   "ყ",    "ს",   "მ",   "ი",    "ტ",   "ქ",  "del",
                "emoticon","global","space","enter"
        );



        this.hwi01_qwerty03_smallText = Arrays.asList(
                "" ,           "",    "",    "",    "",    "",     "",    "",   "ხ",   "ც" ,
                "1",          "2",   "3",   "4",   "5",   "6",    "7",   "8",   "9",   "0" ,
                "" ,           "",    "",   "(",   "@",   ")",     "",    "",   "ჟ",
                "&",          ":",   ";",   "!",   "?",   ".",   ",",    "_",    "…",
                "⚙","★","lang01","lang02","★"
        );

        this.hwi01_qwerty04_smallText_shift = Arrays.asList(
                "" ,           "",    "",    "",    "",    "",     "",    "",   "ხ",   "ც" ,
                ":-)",      ":-(", ";-)", ":'(", ":-D", ":-O", ">:-O", ":-P", ":-/",  ":-|",
                "" ,           "",    "",    "",    "",    "",     "",    "",   "ჟ",
                "&",          ":",   ";",   "!",   "?",   ".",   ",",    "_",    "…",
                "⚙","★","lang01","lang02","★"
        );







        /// 하프쿼티 Half QWERTY
        this.hwi02_halfQwerty01_normalKey = Arrays.asList(
                "ღჯ","უკ","ენ","გშ","წზ",
                "ფძ","ვთ","აპ","რო","ლდ",
                "shift","ჩყ","მი","ტქ","del",
                "emoticon","global","space","enter"
        );

        this.hwi02_halfQwerty02_normalKey_shift= Arrays.asList(
                "ღჯ","უკ","ენ","გშ","წზ",
                "ფძ","ვთ","აპ","რო","ლდ",
                "shift","ჩყ","მი","ტქ","del",
                "emoticon","global","space","enter"
        );

        this.hwi02_halfQwerty03_smallText = Arrays.asList(
                "" ,    "",    "",    "",    "",    "",    "",     "",    "",    "",   "ც",
                "" ,          "",            "",           "",            "",          "ხ",
                "",    "1",    "",   "2",    "",   "3",    "",    "4",    "",   "5",    "",
                "",            "",           "",          "",            "",         "ჟ",
                "",    "6",    "",   "7",   "(",   "8",   ")",    "9",    "",   "0",    "",
                "",          "ჭ",            "ს",           "",           "ბ",          "ჰ",
                "&",   ":",   ";",   "!",   "?",   ".",   ",",    "-",    "_",  "'",  "\"",
                "⚙","★","lang01","lang02","★"
        );

        this.hwi02_halfQwerty04_smallText_shift = Arrays.asList(
                "" ,    "",    "",    "",    "",    "",    "",     "",    "",    "",   "ც",
                "" ,          "",            "",           "",            "",          "ხ",
                "",    "1",    "",   "2",    "",   "3",    "",    "4",    "",   "5",    "",
                "",            "",           "",          "",            "",         "ჟ",
                "",    "6",    "",   "7",   "(",   "8",   ")",    "9",    "",   "0",    "",
                "",          "ჭ",            "ს",           "",           "ბ",          "ჰ",
                "&",   ":",   ";",   "!",   "?",   ".",   ",",    "-",    "_",  "'",  "\"",
                "⚙","★","lang01","lang02","★"
        );








        /// 케토  QETUO
        this.hwi03_qetuo01_normalKey = Arrays.asList(
                "q","e","t","u","o",
                "a","d","g","j","l",
                "shift","c","b","m","del",
                "emoticon","global","space","enter"
        );


        this.hwi03_qetuo02_normalKey_shift = Arrays.asList(
                "Q","E","T","U","O",
                "A","D","G","J","L",
                "shift","C","B","M","del",
                "emoticon","global","space","enter"
        );


        this.hwi03_qetuo03_smallText = Arrays.asList(
                "" ,          "" ,   "è",   "ě",   "ř",   "ť",   "ž",    "ú",   "ů",   "í",   "ó",
                "" ,                 "w",          "r",          "z",           "i",          "p",
                "á",          "1",   "š",   "2",   "ď",   "3",   "(",    "4",   ")",   "5",    "",
                "" ,                 "s",          "f",           "h",          "k",           "",
                "ý",          "6",   "ć",   "7",   "č",   "8",   "ň",    "9",    "",   "0",    "",
                "y",                 "x",          "v",           "n",           "",           "",
                "&",          ":",   ";",   "!",   "?",   ".",   ",",    "_",    "-",  "'",  "\"",

                "⚙","★","lang01","lang02","★"
        );

        this.hwi03_qetuo04_smallText_shift = Arrays.asList(
                "" ,           "",   "Ě",   "É",   "Ř",   "Ť",   "Ž",    "Ú",   "Ů",   "Í",   "Ó",
                "" ,                 "W",          "R",          "Z",           "I",          "P",
                "Á",        ":-)",   "Š", ":-(",   "Ď", ";-)",    "",  ":-D",    "", ":-O",    "",
                "" ,                 "S",          "F",          "H",           "K",           "",
                "Ý",        ":'(",   "Ć",">:-O",   "Č", ":-P",   "Ñ",  ":-/",    "", ":-|",    "",
                "Y",                 "X",          "V",           "N",           "",           "",
                "&",          ":",   ";",   "!",   "?",   ".",   ",",    "-",    "_",  "'",  "\"",
                "⚙","★","lang01","lang02","★"
        );
    }
}
