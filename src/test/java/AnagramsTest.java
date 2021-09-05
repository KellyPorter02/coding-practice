import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

public class AnagramsTest {

    Anagrams test;

    @Before
    public void setup() {
        test = new Anagrams();
    }

    @Test
    public void isAnagrams_True_ArmyMary() {
        String givenA = "army";
        String givenB = "mary";
        Assert.assertTrue(test.isAnagrams(givenA, givenB));
    }

    @Test
    public void isAnagrams_False_ArmyMarry() {
        String givenA = "army";
        String givenB = "marry";
        Assert.assertFalse(test.isAnagrams(givenA, givenB));
    }

    @Test
    public void isAnagrams_True_StopTops() {
        String givenA = "stop";
        String givenB = "tops";
        Assert.assertTrue(test.isAnagrams(givenA, givenB));
    }

    @Test
    public void isAnagrams_True_capitalLetters() {
        String givenA = "Tokyo";
        String givenB = "Kyoto";
        Assert.assertTrue(test.isAnagrams(givenA, givenB));
    }

    @Test
    public void sameLength_True() {
        String givenA = "army";
        String givenB = "mary";
        Assert.assertTrue(test.sameLength(givenA, givenB));
    }

    @Test
    public void sameLength_False() {
        String givenA = "army";
        String givenB = "marry";
        Assert.assertFalse(test.sameLength(givenA, givenB));
    }

    @Test
    public void sameLetters_True() {
        String givenA = "army";
        String givenB = "mary";
        Assert.assertTrue(test.sameLetters(givenA, givenB));
    }

    @Test
    public void sameLetters_False() {
        String givenA = "army";
        String givenB = "navy";
        Assert.assertFalse(test.sameLetters(givenA, givenB));
    }

    @Test
    public void sameLetterCounts_True() {
        String givenA = "army";
        String givenB = "mary";
        Assert.assertTrue(test.sameLetterCounts(givenA, givenB));
    }

    @Test
    public void sameLetterCounts_False() {
        String givenA = "army";
        String givenB = "aarrmmy";
        Assert.assertFalse(test.sameLetterCounts(givenA, givenB));
    }

    @Test
    public void loadMap() {
        String given = "kelly";
        String expected = "{e=1, y=1, k=1, l=2}";
        Map returnedMap = test.loadMap(given);
        String returned = returnedMap.toString();
        Assert.assertEquals(expected, returned);
    }
}