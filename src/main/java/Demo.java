import java.util.*;

public class Demo {

    public Demo() {
    }

    public List<String> repeatedcharsuences(String input) {
        Map<String, Integer> seqMap = new HashMap<>(loadMap(input));
        return loadArr(seqMap);
    }

    public List<String> loadArr(Map<String, Integer> seqMap) {
        List<String> seqAl = new ArrayList<>();
        for (String seq : seqMap.keySet()) {
            if (seqMap.get(seq) > 1) {
                seqAl.add(seq);
            }
        }
        return seqAl;
    }

    public Map<String, Integer> loadMap(String chars) {
        Map<String, Integer> seqCts = new HashMap<>();
        String subS = "";
        for (int i = 0; i < chars.length() - 10; i++) {
            subS = chars.substring(i, i + 10);
            if (!seqCts.containsKey(subS)) {
                seqCts.put(subS, 1);
            } else {
                seqCts.put(subS, seqCts.get(subS) + 1);
            }
        }
        return seqCts;
    }

    public boolean isAnagram(String a, String b) {
        char[] aCh = a.toCharArray();
        char[] bCh = b.toCharArray();
        Arrays.sort(aCh);
        Arrays.sort(bCh);
        if (String.copyValueOf(aCh).equals(String.copyValueOf(bCh))) return true;
        return false;
    }


    public int toolChanger(List<String> tools, int startIndex, String target) {
        Map<String, Integer> toolsAndIdx = new HashMap<>();
        for (int i = 0; i < tools.size(); i++) {
            toolsAndIdx.put(tools.get(i), i);
        }
        System.out.println(toolsAndIdx.toString());

        int shift = Math.abs(startIndex - toolsAndIdx.get(target));
        int dif = tools.size() - shift;
        if (shift <= dif) return shift;
        return dif;
    }

//    public char maximumOccurringCharacter(String input) {
//        // 1. save chars of string to char array
//        char[] chars = input.toCharArray();
//        // 2. count instances and save to map<letter, countof letter>
//        Map<Character, Integer> charCt = new HashMap<>();
//        for (int i = 0; i < chars.length; i++) {
//            if (!charCt.containsKey(chars[i])) {
//                charCt.put(chars[i], 1);
//            } else {
//                charCt.put(chars[i], charCt.get(chars[i]) + 1);
//            }
//        }
//        //
//        List<Integer> mapValSet = new ArrayList<>(charCt.values());
//        List<Character> mapKeySet = new ArrayList<>(charCt.keySet());
//        int maxCount = 0;
//        for (int k = 0; k < mapValSet.size(); k++) {
//            if (mapValSet.get(k) > maxCount) {
//                maxCount = mapValSet.get(k);
//            }
//        }
//        // add max letters to arraylist of max letters
//        List<Character> maxCharsArr = new ArrayList<>();
//        for (int q = 0; q < charCt.size(); q++) {
//            if (mapValSet.get(q) == maxCount) {
//                maxCharsArr.add(mapKeySet.get(q));
//            }
//        }
//        // map of array for instant lookup, when we find index of first highest, can get value from map
//        Map<Integer, Character> arrMap = new HashMap<>();
//        for (int j = 0; j < chars.length; j++) {
//            arrMap.put(j, chars[j]);
//        }
//        int minIndx = chars.length;
//        // cycle through arraylist of max letters and find lowest index for orig input
//        for (int g = 0; g < arrMap.size(); g++) {
//            for (char letter: maxCharsArr) {
//                if (letter == arrMap.get(g) && g < minIndx) {
//                    minIndx = g;
//                }
//            }
//        }
//        // return letter at lowest index
//        return arrMap.get(minIndx);
//    }

    public char maximumOccurringCharacter(String input) {
        Map<Character, Integer> map = loadCountMap(input);
        int maxCount = 0;
        char maxOccLet = ' ';
        for (Integer count : map.values()) {
            if (count > maxCount) {
                maxCount = count;
            }
        }
        for (Character letter : map.keySet()) {
            if (map.get(letter) == maxCount) {
                maxOccLet = letter;
                break;
            }
        }
        return maxOccLet;
    }

    public Map<Character, Integer> loadCountMap(String input) {
        Map<Character, Integer> countMap = new LinkedHashMap<>();
        char charAtI = ' ';
        for (int i = 0; i < input.length(); i++) {
            charAtI = input.charAt(i);
            if (!countMap.containsKey(charAtI)) {
                countMap.put(charAtI, 1);
            } else {
                countMap.put(charAtI, countMap.get(charAtI) + 1);
            }
        }
        return countMap;
    }

    public List<String> repeatedDNASequences(String input) {
        return null;
    }

    public int maxTickets(List<Integer> tickets) {
        Collections.sort(tickets);
        int maxCount = 0;
        int currentCount = 0;
        for (int i = 0; i < tickets.size() - 1; i++) {
            if (Math.abs(tickets.get(i) - tickets.get(i + 1)) == 0 || Math.abs(tickets.get(i) - tickets.get(i + 1)) == 1) {
                currentCount++;
            }
            if (currentCount > maxCount) {
                maxCount = currentCount;
            }
        }
        return maxCount;
    }

//    public char maximumOccurringCharacter(String text) {
//
//        int maxCount = -1;
//        char maxChar = ' ';
//        for (int i = 0; i < text.length(); i++) {
//            char currentChar = text.charAt(i);
//            int currentCharCount = 0;
//            for (int j = 0; j < text.length(); j++) {
//                char comparisonChar = text.charAt(j);
//                if (currentChar == comparisonChar) {
//                    currentCharCount++;
//                }
//                if (currentCharCount > maxCount) {
//                    maxCount = currentCharCount;
//                    maxChar = currentChar;
//                }
//            }
//        }
//        return maxChar;
//    }

//    public int secondHighest(int[] input) {
//        int maxVal = Integer.MIN_VALUE;
//        int secMaxVal = Integer.MIN_VALUE;
//        int maxIndx = -1;
//        for (int i = 0; i < input.length; i++) {
//            if (input[i] > maxVal) {
//                maxVal = input[i];
//                maxIndx = i;
//            }
//        }
//        input[maxIndx] = -1;
//        System.out.println(Arrays.toString(input));
//        for (int i = 0; i < input.length; i++) {
//            if (input[i] > secMaxVal) {
//                secMaxVal = input[i];
//            }
//        }
//        return secMaxVal;
//    }

    public int secondHighest(int[] numbers) {
        int newNumber = numbers[0];
        int largestNumber = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largestNumber) {
                largestNumber = newNumber;
                largestNumber = numbers[i];
            } else if (numbers[i] > newNumber) {
                newNumber = numbers[i];
            }
        }
        return newNumber;
    }
}
