import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Demo4Test {

    Demo4 test;

    @Before
    public void setup() {
        test = new Demo4();
    }

    @Test
    public void isIntPalindromeEven() {
        // Given
        int given = 123321;
        boolean expected = true;
        // When
        boolean returned = test.isIntPalindrome(given);
        // Then
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void isIntPalindromeOdd() {
        // Given
        int given = 1234321;
        boolean expected = true;
        // When
        boolean returned = test.isIntPalindrome(given);
        // Then
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void isIntPalindromeNegative() {
        // Given
        int given = -123321;
        boolean expected = false;
        // When
        boolean returned = test.isIntPalindrome(given);
        // Then
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void isIntPalindromeZero() {
        // Given
        int given = 0;
        boolean expected = true;
        // When
        boolean returned = test.isIntPalindrome(given);
        // Then
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void isIntPalindrome10000021() {
        // Given
        int given = 1000021;
        boolean expected = false;
        // When
        boolean returned = test.isIntPalindrome(given);
        // Then
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void isIntPalindrome10000001() {
        // Given
        int given = 1000001;
        boolean expected = true;
        // When
        boolean returned = test.isIntPalindrome(given);
        // Then
        Assert.assertEquals(expected, returned);
    }


}
