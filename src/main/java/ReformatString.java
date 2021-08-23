

public class ReformatString {
    // clean string of whitespace and dashes
    // find remainder of length of string
    // format string


    public String stringToPhoneFormat(String S) {
        S = removeUnwantedCharacters(S);
        int remainder = findRemainder(S);

        if (S.length() == 2) {
            return S;
        }

        if (remainder == 0) {
            return formatEndsInZero(S);
        } else if (remainder == 1) {
            return formatEndsInOne(S);
        } else {
            return formatEndsInTwo(S);
        }
    }

    public String removeUnwantedCharacters(String S) {
        return S.replaceAll("[\\s-]", "");
    }

    public int findRemainder(String S) {
        int length = S.length();
        return length % 3;
    }

    public String formatEndsInZero(String S) { // remainder 0
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < S.length(); i += 3) {
            if (i > 0) {
                result.append("-");
            }
            result.append(S, i, i + 3);
        }
        return result.toString();
    }

    public String formatEndsInOne(String S) {
        StringBuilder result = new StringBuilder();
        String rest = S.substring(0, S.length() - 4); // format string except for last 4
        result.append(formatEndsInZero(rest));
        String end = S.substring(S.length() - 4);
        result.append("-")
                .append(end, 0, 2)
                .append("-")
                .append(end.substring(2));
        return result.toString();
    }

    public String formatEndsInTwo(String S) {
        StringBuilder result = new StringBuilder();
        String rest = S.substring(0, S.length() - 2); // format string except for last 2
        result.append(formatEndsInZero(rest));
        String end = S.substring(S.length() - 2);
        result.append("-")
                .append(end);
        return result.toString();
    }

}
