import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Demo5Test {

    Demo5 test;

    @Before
    public void setup() {
        test = new Demo5();
    }

    @Test
    public void solution1() {
        //A = [1, 3, 6, 4, 1, 2], the function should return 5.
        int[] input = {1, 3, 6, 4, 1, 2};
        int expected = 5;
        int returned = test.solution(input);
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void solution2() {
        //Given A = [1, 2, 3], the function should return 4.
        int[] input = {1, 2, 3};
        int expected = 4;
        int returned = test.solution(input);
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void solution3() {
        //Given A = [−1, −3], the function should return 1.
        int[] input = {-1, -3};
        int expected = 1;
        int returned = test.solution(input);
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void solution4() {
        //Given A = [−3], the function should return 1.
        int[] input = {-3};
        int expected = 1;
        int returned = test.solution(input);
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void solution5() {
        //Given A = [0], the function should return 1.
        int[] input = {0};
        int expected = 1;
        int returned = test.solution(input);
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void solution6() {
        //Given A = [3, 3, 3, 3, 3, 3], the function should return 4/.
        int[] input = {3, 3, 3, 3, 3, 3};
        int expected = 4;
        int returned = test.solution(input);
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void findMin() {
        //A = [1, 3, 6, 4, 1, 2], the function should return 5.
        int[] input = {1, 3, 6, 4, 1, 2};
        int expected = 1;
        int returned = test.findMin(input);
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void findMin2() {
        //Given A = [1, 2, 3], the function should return 4.
        int[] input = {1, 2, 3};
        int expected = 1;
        int returned = test.findMin(input);
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void findMin3() {
        //Given A = [−1, −3], the function should return 1.
        int[] input = {-1, -3};
        int expected = -3;
        int returned = test.findMin(input);
        Assert.assertEquals(expected, returned);
    }


    @Test
    public void findSecondMin() {
        //A = [1, 3, 6, 4, 1, 2], the function should return 5.
        int[] input = {1, 3, 6, 4, 1, 2};
        int expected = 2;
        int returned = test.findSecondMin(input);
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void findSecondMin2() {
        //Given A = [1, 2, 3], the function should return 4.
        int[] input = {1, 2, 3};
        int expected = 2;
        int returned = test.findSecondMin(input);
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void findSecondMin3() {
        //Given A = [−1, −3], the function should return 1.
        int[] input = {-1, -3};
        int expected = -1;
        int returned = test.findSecondMin(input);
        Assert.assertEquals(expected, returned);
    }
}