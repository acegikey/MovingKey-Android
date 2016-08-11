package com.movingkey.android.movingkey.languages;


import com.movingkey.android.movingkey.languages.bean.Language;

import java.util.Arrays;

/**
 * Created by jhkim on 2016. 3. 4..
 */
public class Greek extends Language
{
    public Greek()
    {
        this.hwi00_languageName = "Greek";
        this.hwi00_languageCode = "el";

        /// 쿼티 QWERTY
        this.hwi01_qwerty01_normalKey = Arrays.asList(
                ";",  "ς",   "ε",   "ρ",   "τ",   "υ",     "θ",   "ι",   "o",   "π" ,
                "α",   "σ",   "δ",   "φ",   "γ",    "η",   "ξ",   "k",   "λ" ,
                "shift",  "ζ",   "χ",   "ψ",   "ω",   "β",    "v",   "μ",   "del",
                "emoticon", "global", "space", "enter"
        );

        this.hwi01_qwerty02_normalKey_shift = Arrays.asList(
                ";",          "ς",   "E",   "P",   "T",   "Y",    "Θ",   "I",   "O",   "Π" ,
                "A",   "Σ",   "Δ",   "Φ",   "Γ",    "Η",   "Ξ",   "K",   "Λ" ,
                "shift",  "Z",   "X",   "Ψ",   "Ω",   "B",    "N",   "M",   "del",
                "emoticon","global","space","enter"
        );



        this.hwi01_qwerty03_smallText = Arrays.asList(
                "&",          "/",   "έ",   "ΰ",   "ϋ",   "ύ",     "ΐ",   "ί",   "ϊ",   "ό" ,
                "1",          "2",   "3",   "4",   "5",   "6",    "7",   "8",   "9",   "0" ,
                "~",          "ά",    "",   "ώ",    "",    "ή",   "@",   "(",  ")" ,
                "_",          ":",   ";",   "!",   "?",   ".",    ",",   "'",   "\"",
                "⚙","★","lang01","lang02","★"
        );

        this.hwi01_qwerty04_smallText_shift = Arrays.asList(
                "&",          "/",   "Έ",   "ΰ",   "Ϋ",  "Ύ",     "ΐ",   "Ί",   "Ϊ",   "Ό" ,
                ":-)",      ":-(", ";-)", ":'(", ":-D", ":-O", ">:-O", ":-P", ":-/",  ":-|",
                "~",          "Ά",    "",   "Ώ",    "",    "Ή",   "@",   "(",   ")" ,
                "_",          ":",   ";",   "!",   "?",   ".",    ",",   "'",   "\"",
                "⚙","★","lang01","lang02","★"
        );







        /// 하프쿼티 Half QWERTY
        this.hwi02_halfQwerty01_normalKey = Arrays.asList(
                ";ς","ερ","τυ","θι","οπ",
                "ασ","δφ","γη","ξκ","λμ",
                "shift","ζχ","ψω","βν","del",
                "emoticon","global","space","enter"
        );

        this.hwi02_halfQwerty02_normalKey_shift= Arrays.asList(
                ";ς","ΕΡ","TY","ΘΙ","ΟΠ",
                "AΣ","ΔΦ","ΓH","ΞK","ΛM",
                "shift","ZX","ΨΩ","BN","del",
                "emoticon","global","space","enter"
        );

        this.hwi02_halfQwerty03_smallText = Arrays.asList(
                "/",   "♡",   "", ".com",    "",   "@",   "ϋ",    "ΰ",    "ϊ",  "ΐ",    "",
                "" ,          "έ",            "",          "ύ",            "ί",        "ό",
                "",    "1",    "",   "2",    "",   "3",    "",    "4",    "",  "5",    "",
                "ά",           "",           "",          "ή",            "",          "",
                "",   "6",    "",   "7",   "(",   "8",   ")",    "9",    "",  "0",    "",
                "" ,           "",           "",         "ώ",            "",          "",
                "&",   ":",   ";",   "!",   "?",   ".",   ",",    "-",   "_",   "'", "\"",
                "⚙","★","lang01","lang02","★"
        );

        this.hwi02_halfQwerty04_smallText_shift = Arrays.asList(
                "" ,    "",    "",    "",    "",    "",   "Ϋ",     "",    "Ϊ",  "Ό",    "",
                "" ,          "Έ",           "",          "Ύ",           "Ί",           "",
                "",  ":-)",    "", ":-(",    "", ";-)",    "",  ":-D",    "", ":-O",    "",
                "Ά",           "",           "",          "Ή",            "",          "",
                "", ":'(",    "",">:-O",    "", ":-P",    "",  ":-/",    "", ":-|",    "",
                "" ,           "",           "",          "Ώ",           "",           "",
                "&",   ":",   ";",   "!",   "?",   ".",   ",",    "-",   "_",   "'",  "\"",
                "⚙","★","lang01","lang02","★"
        );








        /// 케토  QETUO
        this.hwi03_qetuo01_normalKey = Arrays.asList(
                ";","ε","τ","θ","ο",
                "α","δ","γ","ξ","λ",
                "shift","χ","ω","ν","del",
                "emoticon","global","space","enter"
        );


        this.hwi03_qetuo02_normalKey_shift = Arrays.asList(
                "ς","E","T","Θ","O",
                "A","Δ","Γ","Ξ","Λ",
                "shift","X","Ω","N","del",
                "emoticon","global","space","enter"
        );


        this.hwi03_qetuo03_smallText = Arrays.asList(
                "/",      ".com" ,   "@",   "έ",   "ΰ",   "ϋ",   "ύ",    "ΐ",   "ί",    "ϊ",    "ό",
                ";",                  "",          "ρ",          "υ",            "ι",           "π",
                "",           "1",    "",   "2",   "(",   "3",   ")",    "4",    "",   "5",     "",
                "ά",                 "σ",          "φ",          "η",           "k",            "",
                "",          "6",    "",   "7",   "ώ",   "8",   "ή",    "9",    "",   "0",     "",
                "" ,                 "ζ",          "ψ",          "β",           "μ",            "",
                "&",          ":",   ";",   "!",   "?",   ".",   ",",    "-",   "_",   "'",   "\"",

                "⚙","★","lang01","lang02","★"
        );

        this.hwi03_qetuo04_smallText_shift = Arrays.asList(
                "" ,          "" ,    "",   "Έ",   "ΰ",   "Ϋ",  "Ύ",     "ΐ",   "Ί",   "Ϊ",    "Ό",
                ";",                  "",          "P",          "Y",           "I",           "Π",
                "",         ":-)",    "", ":-(",    "", ";-)",    "",  ":-D",    "", ":-O",     "",
                "Ά",                 "Σ",          "Φ",          "Η",           "K",            "",
                "",        ":'(",    "",">:-O",   "Ώ", ":-P",  "Ή",  ":-/",    "", ":-|",     "",
                "" ,                 "Z",          "Ψ",          "B",           "M",            "",
                "&",          ":",   ";",   "!",   "?",   ".",   ",",    "-",   "_",   "'",   "\"",
                "⚙","★","lang01","lang02","★"
        );
    }
}
