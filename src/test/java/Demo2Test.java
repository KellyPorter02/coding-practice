import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class Demo2Test {

    Demo2 test;

    @Before
    public void setup() {
        test = new Demo2();
    }

    @Test
    public void countLettersTest1() {
        String input = "fun&!!";
        int expected = 3;
        int returned = test.countLetters(input);
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void countLettersTest2() {
        String input = "0000000000";
        int expected = 0;
        int returned = test.countLetters(input);
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void countLettersTest3() {
        String input = "&!!z2z3z";
        int expected = 3;
        int returned = test.countLetters(input);
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void longestWordTest1() {
        String input = "fun&!! time";
        String expected = "time";
        String returned = test.longestWordTest(input);
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void longestWordTest2() {
        String input = "I love dogs";
        String expected = "love";
        String returned = test.longestWordTest(input);
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void longestWordTest3() {
        String input = "8a8a8a8a two one";
        String expected = "8a8a8a8a";
        String returned = test.longestWordTest(input);
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void longestWordTest4() {
        String input = "coderbyte";
        String expected = "coderbyte";
        String returned = test.longestWordTest(input);
        System.out.println(returned);
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void longestWordTest5() {
        String input = "a confusing /:sentence:/[ this is not!!!!!!!~";
        String expected = "confusing";
        String returned = test.longestWordTest(input);
        System.out.println(returned);
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void longestWordTest6() {
        String input = "a /:sentence:/[ confuse this is not!!!!!!!~";
        String expected = "/:sentence:/[";
        String returned = test.longestWordTest(input);
        System.out.println(returned);
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void minPositiveIntNotAlreadyInArrayTest1() {
        int[] input = {1, 3, 6, 4, 1, 2};
        int expected = 5;
        int returned = test.minPositiveIntNotAlreadyInArray(input);
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void minPositiveIntNotAlreadyInArrayTest2() {
        int[] input = {1, 2, 3};
        int expected = 4;
        int returned = test.minPositiveIntNotAlreadyInArray(input);
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void minPositiveIntNotAlreadyInArrayTest3() {
        int[] input = {-1, -3};
        int expected = 1;
        int returned = test.minPositiveIntNotAlreadyInArray(input);
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void minPositiveIntNotAlreadyInArrayTest4() {
        int[] input = {0, 0, 0};
        int expected = 1;
        int returned = test.minPositiveIntNotAlreadyInArray(input);
        Assert.assertEquals(expected, returned);
    }
}