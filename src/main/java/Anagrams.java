import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Anagrams {
    /*
    * Java Program to check if two String is an anagram of each other or not. Two
    * String is said to be an anagram of each other, if they contain exactly same
    * characters but in a different order. For example "army" and "mary" are anagram
    * of each other because they contain exact same characters 'a', 'r', 'm' and
    * 'y'.
    *
    * same length
    * same letters
    * same count of letters
    *
    * 1-check length
    * 2-load hashmap of counts for first word
    * 3-load hashmap of counts of second word
    *     as you load, check first hashmap, if any letter not found in first hashmap,
    *     return false
    * 4-compare 2 hashmaps, (to String? check they are same) else return false
    */

    public boolean isAnagrams(String inputA, String inputB) {
        String one = inputA.toLowerCase();
        String two = inputB.toLowerCase();
        return sameLength(one, two) && sameLetters(one, two) && sameLetterCounts(one, two);
    }

    boolean sameLength(String inputA, String inputB) {
        return inputA.length() == inputB.length();
    }

    boolean sameLetters(String inputA, String inputB) {
        Map<Character, Integer> inputAMap = loadMap(inputA);

        for (int i = 0; i < inputB.length(); i++) {
            char currentLetter = inputB.charAt(i);
            if (!inputAMap.containsKey(currentLetter)) return false;
        }
        return true;
    }

    boolean sameLetterCounts(String inputA, String inputB) {
        Map<Character, Integer> inputAMap = loadMap(inputA);
        Map<Character, Integer> inputBMap = loadMap(inputB);

        for (Character letter: inputAMap.keySet()) {
            if (inputAMap.get(letter) != inputBMap.get(letter)) return false;
        }
        return true;
    }

    Map<Character, Integer> loadMap(String input) {
        Map<Character, Integer> charCountMap = new HashMap<>();

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if (charCountMap.containsKey(current)) {
                int count = charCountMap.get(current);
                charCountMap.put(current, ++count);
            } else {
                charCountMap.put(current, 1);
            }
        }
        return charCountMap;
    }

}
