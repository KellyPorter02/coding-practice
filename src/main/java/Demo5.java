import com.j256.ormlite.stmt.query.In;

import java.util.Arrays;

public class Demo5 {

//    public int solution(int[] A) {
//        int min = findMin(A);
//        int minIdx = -1;
//        int prevEl = A[0];
//        int prevIdx = 0;
//        int oneLess = min - 1;
//
//        for (int i = 0; i < A.length; i++) {
//            if (oneLess == )
//
//        }
//        return -1;
//    }

    public int findMin(int[] input) {
        int min = Integer.MAX_VALUE;
        int minIdx = -2;

        for (int i = 0; i < input.length; i++) {
            if (input[i] < min) {
                min = input[i];
                minIdx = i;
            }
        }
        return min;
    }

    public int findSecondMin(int[] input) {
        int min = findMin(input);
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < input.length; i++) {
            if (input[i] == min) {
            }

            if (input[i] < secondMin && input[i] > min) {
                secondMin = input[i];
            }
        }
        return secondMin;
    }

    public int lowestIntNotInArray(int[] input) {
        Arrays.sort(input);

        int current;
        int curPlus1;
        int nextEl;

        for (int i = 0; i < input.length; i++) {
            current = input[i];
            // if at last element in array
            if (i == input.length - 1) {
                // and last element is positive, return last el +1
                if (current > 0) {
                    return ++current;
                } else {
                    // and last element is negative or 0, return 1
                    return 1;
                }
            }
            // skip if neg or 0
            if (current <= 0) {
                continue;
            }
            nextEl = input[i + 1];
            curPlus1 = input[i] + 1;
            // if current element is positive and plusone nor current don't equal the next el, return curPlus1
            if (current != nextEl && curPlus1 != nextEl) {
                return curPlus1;
            }
        }
        return -1;
    }

}
