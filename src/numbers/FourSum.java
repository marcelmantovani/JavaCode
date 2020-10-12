package numbers;

import java.util.HashMap;

/**
 * 
 * @author Marcel
 * Given four lists A, B, C, D of integer values, compute how many tuples (i, j, k, l) there are such that A[i] + B[j] + C[k] + D[l] is zero.
 */

public class FourSum {
	public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        int tuplesCount = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        
        for (int i : A) {
        	for (int j : B) {
        		hashMap.put(i + j, hashMap.getOrDefault(i + j, 0) + 1);
        	}
        }
        
        for (int k : C) {
			for (int l : D) {
				if (hashMap.containsKey(-(k + l))) {
					tuplesCount += hashMap.get(-(k+l));
				}
			}
		}
        
        return tuplesCount;
    }
}
