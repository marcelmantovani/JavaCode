package arrays;

import java.util.ArrayList;

/**
 * 
 * @author Marcel
 * For some fixed N, an array A is beautiful if it is a permutation of the integers 1, 2, ..., N, such that:
 * 
 * For every i < j, there is no k with i < k < j such that A[k] * 2 = A[i] + A[j].
 * 
 * Given N, return any beautiful array A.  (It is guaranteed that one exists.)
 * Example 1: Input: 4 Output: [2,1,4,3]
 * Example 2: Input: 5 Output: [3,1,2,5,4]
 * Example 3: Input: 6 Output: [1,5,3,2,6,4]
 * 
 * Credits: https://leetcode.com/problems/beautiful-array/discuss/186679/Odd-%2B-Even-Pattern-O(N)
 */

public class BeautifulArray {
	public int[] beautifulArray(int N) {
		ArrayList<Integer> res = new ArrayList<>();
        res.add(1);
        while (res.size() < N) {
            ArrayList<Integer> tmp = new ArrayList<>();
            for (int i : res) if (i * 2 - 1 <= N) tmp.add(i * 2 - 1);
            for (int i : res) if (i * 2 <= N) tmp.add(i * 2);
            res = tmp;
        }
        return res.stream().mapToInt(i -> i).toArray();
    }
}
