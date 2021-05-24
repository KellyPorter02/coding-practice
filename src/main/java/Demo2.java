import java.util.Arrays;

public class Demo2 {

    public int countLetters(String input) {
        char[] wordChars = input.toCharArray();
        int count = 0;
        for (char letter: wordChars) {
            if (Character.isLetter(letter)) {
                count++;
            }
        }
        return count;
    }

    public String longestWordTest(String sen) {
        // split input string into array of words, by space delimiter
        String[] wordsArray = sen.split(" ");

        // count letters of each word, save longest length and index of
        int maxLength = 0;
        int maxIndex = -1;

        for (int i = 0; i < wordsArray.length; i++) {
            // if length of word less than current highest count, skip
            if (wordsArray[i].length() < maxLength) {
                continue;
            }

            // count number of letters in current word
            int curNumLetters = 0;
            curNumLetters = countLetters(wordsArray[i]);

            // save highest letterCount & index of word if greatest length
            if (curNumLetters > maxLength) {
                maxLength = curNumLetters;
                maxIndex = i;
            }
        }
        return wordsArray[maxIndex];
    }

    public int solution(int[] A) {
        Arrays.sort(A);
        System.out.println(Arrays.toString(A));

        for (int i = 0; i < A.length; i++) {
            // if the first value is not negative and the 2nd value is not 1 more than the first or equal to the first,
            // return the first value plus 1

            if (A[i] <= 0) continue;
            if (i == A.length - 1) {
                return A[i] + 1;
            }
            if (i != A.length - 1) {
                if (A[i+1] == A[i]) continue;
                if (A[i] > 0 && !(A[i+1] == (A[i] + 1) || A[i+1] == A[i])) {
                    return A[i] + 1;
                }
            }
        }
        return 1;
    }
}
