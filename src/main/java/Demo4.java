

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

}
