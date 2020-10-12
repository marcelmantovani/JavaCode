package numbers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 * @author Marcel
 * Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
 * Find all the elements that appear twice in this array.
 * Could you do it without extra space and in O(n) runtime?
 */
public class FindDuplicatesInArray {

	public List<Integer> findDuplicates(int[] nums) {
        List<Integer> outList = new ArrayList<Integer>();
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        
        for (int i : nums) {
        	if (hashMap.containsKey(i)) {
        		hashMap.put(i, hashMap.get(i) + 1);
        	} else {
        		hashMap.put(i, 1);
        	}
        	
        }
        
        for (Map.Entry<Integer, Integer> m:hashMap.entrySet()) {
        	if (m.getValue() == 2) {
        		outList.add(m.getKey());
        	}
        }
        return outList;
    }
}
