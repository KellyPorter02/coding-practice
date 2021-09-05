import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

    FizzBuzz test;

    @Before
    public void setup() {
        test = new FizzBuzz();
    }

    @Test
    public void fizzBuzz_15() {
        int given = 15;
        String expected = "1\n" +
                "2\n" +
                "Fizz\n" +
                "4\n" +
                "Buzz\n" +
                "Fizz\n" +
                "7\n" +
                "8\n" +
                "Fizz\n" +
                "Buzz\n" +
                "11\n" +
                "Fizz\n" +
                "13\n" +
                "14\n" +
                "FizzBuzz\n";
        String returned = test.fizzBuzz(given);
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void fizzBuzz_65() {
        int given = 65;
        String expected = "1\n" +
                "2\n" +
                "Fizz\n" +
                "4\n" +
                "Buzz\n" +
                "Fizz\n" +
                "7\n" +
                "8\n" +
                "Fizz\n" +
                "Buzz\n" +
                "11\n" +
                "Fizz\n" +
                "13\n" +
                "14\n" +
                "FizzBuzz\n" +
                "16\n" +
                "17\n" +
                "Fizz\n" +
                "19\n" +
                "Buzz\n" +
                "Fizz\n" +
                "22\n" +
                "23\n" +
                "Fizz\n" +
                "Buzz\n" +
                "26\n" +
                "Fizz\n" +
                "28\n" +
                "29\n" +
                "FizzBuzz\n" +
                "31\n" +
                "32\n" +
                "Fizz\n" +
                "34\n" +
                "Buzz\n" +
                "Fizz\n" +
                "37\n" +
                "38\n" +
                "Fizz\n" +
                "Buzz\n" +
                "41\n" +
                "Fizz\n" +
                "43\n" +
                "44\n" +
                "FizzBuzz\n" +
                "46\n" +
                "47\n" +
                "Fizz\n" +
                "49\n" +
                "Buzz\n" +
                "Fizz\n" +
                "52\n" +
                "53\n" +
                "Fizz\n" +
                "Buzz\n" +
                "56\n" +
                "Fizz\n" +
                "58\n" +
                "59\n" +
                "FizzBuzz\n" +
                "61\n" +
                "62\n" +
                "Fizz\n" +
                "64\n" +
                "Buzz\n";
        String returned = test.fizzBuzz(given);
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void isMultOf3_isFalse_4() {
        int given = 4;
        Assert.assertFalse(test.isMultOf3(given));
    }

    @Test
    public void isMultOf3_isTrue_9() {
        int given = 9;
        Assert.assertTrue(test.isMultOf3(given));
    }

    @Test
    public void isMultOf3_isFalse_2() {
        int given = 2;
        Assert.assertFalse(test.isMultOf3(given));
    }

    @Test
    public void isMultOf5_isTrue_10() {
        int given = 10;
        Assert.assertTrue(test.isMultOf5(given));
    }

    @Test
    public void isMultOf5_isFalse_1() {
        int given = 2;
        Assert.assertFalse(test.isMultOf5(given));
    }

    @Test
    public void isMultOf3And5_isTrue_30() {
        int given = 30;
        Assert.assertTrue(test.isMultOf3And5(given));
    }

    @Test
    public void isMultOf3And5_isFalse_18() {
        int given = 18;
        Assert.assertFalse(test.isMultOf3And5(given));
    }
}