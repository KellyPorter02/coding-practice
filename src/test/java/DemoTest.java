import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;


public class DemoTest {

    Demo test;


    @Before
    public void setup() {
        test = new Demo();
    }

    @Test
    public void test() {
        String input = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        List<String> expected = new ArrayList<>();
        expected.add("AAAAACCCCC"); expected.add("CCCCCAAAAA");
        List<String> returned = test.repeatedDNASequences(input);
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void test2() {
        String input = "AAAAAAAAAAAAA";
        List<String> expected = new ArrayList<>();
        expected.add("AAAAAAAAAA");
        List<String> returned = test.repeatedDNASequences(input);
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void loadArr() {
        String input = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        Map<String, Integer> inputMap = new HashMap<>(test.loadMap(input));
        List<String> expected = new ArrayList<>();
        expected.add("AAAAACCCCC"); expected.add("CCCCCAAAAA");
        List<String> returned = test.loadArr(inputMap);
        System.out.println(expected);
        System.out.println(returned);
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void loadArr2() {
        String input = "AAAAAAAAAAAAA";
        Map<String, Integer> inputMap = new HashMap<>(test.loadMap(input));
        List<String> expected = new ArrayList<>();
        expected.add("AAAAAAAAAA");
        List<String> returned = test.loadArr(inputMap);
        System.out.println(expected);
        System.out.println(returned);
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void loadMap() {
        String input = "AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        Map<String, Integer> expectedMap = new HashMap<>(test.loadMap(input));
        String expectedStr = "{ACCCCCAAAA=1, CCAAAAACCC=1, AAAAACCCCC=2, ACCCCCCAAA=1, AACCCCCAAA=1, CAAAAACCCC=1, CCAAAAAGGG=1, CCCCCAAAAA=2, CCCCAAAAAG=1, AAAACCCCCC=1, CCCCAAAAAC=1, CAAAAAGGGT=1, AAAACCCCCA=1, CCCCCCAAAA=1, AAACCCCCCA=1, AAACCCCCAA=1, AACCCCCCAA=1, AAAAAGGGTT=1, CCCAAAAACC=1, CCCAAAAAGG=1}";
        String actual = expectedMap.toString();
        Assert.assertEquals(expectedStr, actual);

    }

    @Test
    public void loadMap2() {
        String input = "AAAAAAAAAAAAA";
        Map<String, Integer> expectedMap = new HashMap<>(test.loadMap(input));
        String expectedStr = "{AAAAAAAAAA=3}";
        String actual = expectedMap.toString();
        Assert.assertEquals(expectedStr, actual);

    }

    @Test
    public void testAnagrams() {
        String a = "anagram";
        String b = "margana";

        boolean returned = test.isAnagram(a, b);
        Assert.assertTrue(returned);
    }

    @Test
    public void toolChangerTest() {
        List<String> inputArr = new ArrayList<>();
        inputArr.add("ballendmill");
        inputArr.add("keywaycutter");
        inputArr.add("slotdrill");
        inputArr.add("facemill");
        int startingInd = 1;
        String targetItem = "ballendmill";
        int expected = 1;
        int returned = test.toolChanger(inputArr, startingInd, targetItem);
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void maxTicketsTest() {
        List<Integer> input = new ArrayList<>();
        input.add(8);
        input.add(5);
        input.add(4);
        input.add(8);
        input.add(4);
        int expected = 3;
        int returned = test.maxTickets(input);
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void maxTicketsTest2() {
        List<Integer> input = new ArrayList<>();
        input.add(2);
        input.add(5);
        input.add(13);
        input.add(4);
        input.add(3);
        int expected = 3;
        int returned = test.maxTickets(input);
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void maximumOccurringCharacterTest() {
        String input = "abbbaacc";
        char expected = 'a';
        char returned = test.maximumOccurringCharacter(input);
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void maximumOccurringCharacterTest2() {
        String input = "ccaabbba";
        char expected = 'a';
        char returned = test.maximumOccurringCharacter(input);
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void maximumOccurringCharacterTest3() {
        String input = "ccaabbbacccaabbbacccaabbbacccaabbbacccaabbbacccaabbbacccaabbbac";
        char expected = 'c';
        char returned = test.maximumOccurringCharacter(input);
        Assert.assertEquals(expected, returned);
    }


    @Test
    public void loadCountMap() {
        String input = "fjklkljarasraffffff";
        String expected = "{f=7, j=2, k=2, l=2, a=3, r=2, s=1}";
        String returned = test.loadCountMap(input).toString();
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void secondHighestTest() {
        int[] input = {7, 2, 6, 9, 3};
        int expected = 7;
        int returned = test.secondHighest(input);
        Assert.assertEquals(expected, returned);
    }

    @Test
    public void solutionTest1() {
        String input = ".X..X";
        int expected = 2;
        int returned = test.minNum3LengthPatches(input);
        Assert.assertEquals(expected,returned);
    }

    @Test
    public void solutionTest2() {
        String input = "X.XXXXX.X.";
        int expected = 3;
        int returned = test.minNum3LengthPatches(input);
        Assert.assertEquals(expected,returned);
    }

    @Test
    public void solutionTest3() {
        String input = "XX.XXX..";
        int expected = 2;
        int returned = test.minNum3LengthPatches(input);
        Assert.assertEquals(expected,returned);
    }

    @Test
    public void solutionTest4() {
        String input = "XXXX";
        int expected = 2;
        int returned = test.minNum3LengthPatches(input);
        Assert.assertEquals(expected,returned);
    }

    @Test
    public void solutionTest5() {
        String input = "....X..X.X..XX.XXX.X.X.X..";
        int expected = 6;
        int returned = test.minNum3LengthPatches(input);
        Assert.assertEquals(expected,returned);
    }
}