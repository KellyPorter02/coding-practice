import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;


public class Demo3Test {


    Demo3 test;

    @Before
    public void setup() { test = new Demo3(); }


    @Test
    public void loadIntegersMapTest1() {
        List<Integer> input = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3));
        Map<Integer, Boolean> returnedMap = new HashMap<>(test.loadIntegersMap(input));
        String expectedStr = "{1=true, 2=true, 3=true}";
        String actual = returnedMap.toString();
        System.out.println(actual);
        Assert.assertEquals(expectedStr, actual);
    }


    @Test
    public void differenceTest1() {
        List<Integer> inputA = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3));
        List<Integer> inputB = new ArrayList<>(Arrays.asList(1, 1, 1, 2, 2, 3, 4, 5, 6));

        List<Integer> returnedArrayList = new ArrayList<>(test.difference(inputA, inputB));

        String expectedStr = "[4, 5, 6]";
        String actual = returnedArrayList.toString();
        Assert.assertEquals(expectedStr, actual);
    }
}
