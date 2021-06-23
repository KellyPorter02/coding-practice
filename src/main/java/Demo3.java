import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo3 {

        public Map<Integer, Boolean> loadIntegersMap(List<Integer> inputList) {
        Map<Integer, Boolean> integerMap = new HashMap<>();
        for (Integer integer : inputList) {
            if (!integerMap.containsKey(integer)) {
                integerMap.put(integer, true);
            }
        }
        return integerMap;
    }

    public List<Integer> difference(List<Integer> A, List<Integer> B) {
        List<Integer> diffArrList = new ArrayList<>();  // new arraylist for just the integers that are only in one list, not both
        Map<Integer, Boolean> integerMap = new HashMap<>(loadIntegersMap(A)); // Step 1: load the first list into a map (using helper method .loadIntegersMap), the key is the integer & the value is just the boolean true - just using that as a placeholder, the point of the map is to make looking up values easy

        for (int i = 0; i < B.size(); i++) {  // Step 2: loop through all the elements in the second list, if the integermap doesn't contain the current element, add to diffArrayList
            if (!integerMap.containsKey(B.get(i))) {
                diffArrList.add(B.get(i));
            }
        }

        return diffArrList; // Step 3: return diffArrList
    }




}
