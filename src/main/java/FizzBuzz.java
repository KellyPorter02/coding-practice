
public class FizzBuzz {

    public String fizzBuzz(int input) {
        /*
        if mult of 3 and not 5, Fizz
        if mult of 5 and not 3, Buzz
        if mult of 3 & 5, FizzBuzz
        if none of those, print number
        for each integer, starting from 1 to n,
        return ans
         */
        StringBuilder ans = new StringBuilder();

        for (int i = 1; i <= input; i++) {

            if (isMultOf3And5(i)) {
                ans.append("FizzBuzz")
                        .append("\n");
            } else if (isMultOf3(i)) {
                ans.append("Fizz")
                        .append("\n");
            } else if (isMultOf5(i)) {
                ans.append("Buzz")
                        .append("\n");
            } else {
                ans.append(i)
                        .append("\n");
            }

        }

        return ans.toString();
    }

    boolean isMultOf3(int i) {
        return (i % 3 == 0); // && (i % 5 != 0);
    }

    boolean isMultOf5(int i) {
        return (i % 5 == 0); // && (i % 3 != 0);
    }

    boolean isMultOf3And5(int i) {
        return i % 15 == 0;
    }
}
