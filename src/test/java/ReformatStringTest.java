import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReformatStringTest {

    ReformatString test;

    @Before
    public void setup() {
        test = new ReformatString();
    }

    @Test
    public void removeUnwantedCharacters1() {
        String input = "  001564---- 0256-";
        String expected = "0015640256";
        String returned = test.removeUnwantedCharacters(input);
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void findRemainder_zero() {
        String input = "11";
        int expected = 2;
        int returned = test.findRemainder(input);
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void formatEndsInZero() {
        String input = "111111";
        String expected = "111-111";
        String returned = test.formatEndsInZero(input);
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void formatEndsInZero2() {
        String input = "111";
        String expected = "111";
        String returned = test.formatEndsInZero(input);
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void formatEndsInOne() {
        String input = "1111111";
        String expected = "111-11-11";
        String returned = test.formatEndsInOne(input);
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void formatEndsIn2() {
        String input = "11111111";
        String expected = "111-111-11";
        String returned = test.formatEndsInTwo(input);
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void stringToPhoneFormat1() {
        String input = "00-44  48 5555 8361";
        String expected = "004-448-555-583-61";
        String returned = test.stringToPhoneFormat(input);
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void stringToPhoneFormat2() {
        String input = "0 - 22 1985--324";
        String expected = "022-198-53-24";
        String returned = test.stringToPhoneFormat(input);
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void stringToPhoneFormat3_lengthOfTwo() {
        String input = "11";
        String expected = "11";
        String returned = test.stringToPhoneFormat(input);
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void stringToPhoneFormat5() {
        String input = "555372654";
        String expected = "555-372-654";
        String returned = test.stringToPhoneFormat(input);
        Assert.assertEquals(expected, returned);
    }

}
