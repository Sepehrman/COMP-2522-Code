package ca.bcit.comp2522.code.simplePrograms.pigLatin;

import java.util.Scanner;

/**
 * Represents a translator from English to Pig Latin. Demonstrates method
 * decomposition.
 *
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2020
 */
public class PigLatinTranslator {

    /**
     * Translates a sentence of words into Pig Latin.
     *
     * @param sentence a String
     * @return result the original sentence converted to Pig Latin
     */
    public static String translate(String sentence) {
        String result = "";

        sentence = sentence.toLowerCase();

        Scanner scan = new Scanner(sentence);

        while (scan.hasNext()) {
            result += translateWord(scan.next());
            result += " ";
        }

        scan.close();

        return result;
    }

    /**
     * Translates one word into Pig Latin. If the word begins with a vowel, the
     * suffix "yay" is appended to the word. Otherwise, the usefulclasses letter or two
     * are moved to the end of the word, and "ay" is appended
     *
     * @param word a String
     * @return result the word translated to Pig Latin
     */
    private static String translateWord(String word) {
        String result;

        if (beginsWithVowel(word)) {
            result = word + "yay";
        } else if (beginsWithBlend(word)) {
            result = word.substring(2) + word.substring(0, 2) + "ay";
        } else {
            result = word.substring(1) + word.charAt(0) + "ay";
        }
        return result;
    }

    /**
     * Determines if the specified word begins with a vowel.
     *
     * @param word a String
     * @return true if the specified word begins with a vowel, else false.
     */
    private static boolean beginsWithVowel(String word) {
        String vowels = "aeiou";

        char letter = word.charAt(0);

        return (vowels.indexOf(letter) != -1);
    }

    /**
     * Determines if the specified word begins with a particular two-character
     * consonant blend.
     *
     * @param word a String
     * @return true if the specified word begins with the blend, else false
     */
    private static boolean beginsWithBlend(String word) {
        return (word.startsWith("bl") || word.startsWith("sc")
                || word.startsWith("br") || word.startsWith("sh")
                || word.startsWith("ch") || word.startsWith("sk")
                || word.startsWith("cl") || word.startsWith("sl")
                || word.startsWith("cr") || word.startsWith("sn")
                || word.startsWith("dr") || word.startsWith("sm")
                || word.startsWith("dw") || word.startsWith("sp")
                || word.startsWith("fl") || word.startsWith("sq")
                || word.startsWith("fr") || word.startsWith("st")
                || word.startsWith("gl") || word.startsWith("sw")
                || word.startsWith("gr") || word.startsWith("th")
                || word.startsWith("kl") || word.startsWith("tr")
                || word.startsWith("ph") || word.startsWith("tw")
                || word.startsWith("pl") || word.startsWith("wh")
                || word.startsWith("pr") || word.startsWith("wr"));
    }
}

