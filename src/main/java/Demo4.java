import java.lang.reflect.Array;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo4 {

    public boolean isIntPalindrome(int x) {
        boolean pal = false;
        String intString = Integer.toString(x);
        int j = intString.length() - 1;

        if (intString.length() == 1) {
            pal = true;
            return pal;
        }
        for (int i = 0; i < intString.length() / 2; i++) {
            if (intString.charAt(i) != intString.charAt(j)) {
                break;
            }
            if (i == (intString.length() / 2) - 1) {
                pal = true;
            }
            j--;
        }
        return pal;
    }

    public int maxSubArraySum(int[] nums) {
//        int lgth = nums.length;
//        int numLps = 1;
//        int maxSum = Integer.MIN_VALUE;
//        for (int i = 0; i < numLps; i++) {
//
//            int tempSum = 0;
//            for (int idx = 0; idx < lgth; idx++) {
//                tempSum += nums[idx];
//                }
//            if (tempSum > maxSum) {
//                maxSum = tempSum;
//            }
//            lgth -= i;
//            numLps += i;
//        }
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length - i; i++) {

            int tempSum = 0;
            for (int j = 0; j < nums.length - i; j++) {
                tempSum += nums[j + i];
            }
            if (tempSum > maxSum) {
                maxSum = tempSum;
            }

        }
        return 0;
    }

    /*
    TODO:
    Pattern numPattern = Pattern.compile("put regex here");

    TODO:
    Kelly Porter:
	1st one was: tell me if a number is “self-describing”
Meaning, for ex. 2020
at each index of the number, the value at that index is the amount of times that that index appears in the number
Index 0,  value at index: 2, there are 2 zeroes in the number

Ashley Smart Zip Code:
	This was my question
	https://github.com/edeng/CodeEval/blob/master/Easy/HiddenDigits.java

Kelly Porter:
	2nd: for 0-9, check if “zero” appears in a string, if yes, add 0 to an array
Return the array
but any combination of zero, and if combination appears more than once, add 0 every time you find it
And so one for the rest
https://github.com/edeng/CodeEval/blob/master/Easy/HiddenDigits.java
    
    1. create count of each letter in input string
       create count map of one two three four
    2. for each number word
            check  there are one of each letter in zero  so loop through zero: there is 1 of each letter in zero



            if there's no z (or e,r,o) break;
                count has to equal at least the length of the string and it's proportions
                // write method to compute "minimum" count ex. seven  eight one two three four five six seven eight nine
            if there is a (z && and e && r && o)
                at z, how many
                e how many
                r how many
                o how many
                save highest count
                save letter of highest count
                save lowest count
                save letter of lowest count

            for (int i = 0; i < lowest count; i++)
                arr.add(0)


     */

    public int[] createIntArrayFromString(String input) {
        List<Integer> numbers = new ArrayList<>();

        // create regex Pattern/Matcher
        Pattern p = Pattern.compile(/* fdffde= */"");
        Matcher m = p.matcher("input");

        for (int i = 0; i < 10; i++) {
            // run method to return regex


        }

        return null;
    }

    private String convertDigitToRegex(int digit) throws IllegalArgumentException {

        switch (digit) {
            case 0:
                return "regex0";
            case 1:
                return "regex1";
            case 2:
                return "regex2";
            case 3:
                return "regex3";
            case 4:
                return "regex4";
            case 5:
                return "regex5";
            case 6:
                return "regex6";
            case 7:
                return "regex7";
            case 8:
                return "regex8";
            case 9:
                return "regex9";
            default:
                //throw new IllegalArgumentException("Number must be between 0 and 9.");
                return "blah";
        }
    }
//        if (digit == 0) return "zero";
//        else if (digit == 1) return "one";
//        else if (digit == 2) return "two";
//        else if (digit == 3) return "three";
//        else if (digit == 4) return "four";
//        else if (digit == 5) return "five";
//        else if (digit == 6) return "six";
//        else if (digit == 7) return "seven";
//        else if (digit == 8) return "eight";
//        else if (digit == 9) return "nine";
//        else return "Improper input";
//    }

}
