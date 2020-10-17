package words;

import java.util.HashMap;

/**
 * 
 * @author Marcel
 * Given two strings s and t , write a function to determine if t is an anagram of s.
 */

public class ValidAnagram {
	public boolean isAnagram(String s, String t) {
		HashMap<Character, Integer> set = new HashMap<>();
		
		for (int i = 0; i< s.length(); i++) {
			if (set.get(s.charAt(i)) == null) {
				set.put(s.charAt(i), 1);
			} else {
				set.put(s.charAt(i), set.get(s.charAt(i)) + 1);
			}
		}
		
		for (int j = 0; j < t.length(); j++) {
			if (set.get(t.charAt(j))==null) {
				return false;
			} else {
				set.put(t.charAt(j), set.get(t.charAt(j)) - 1);
			}
		}
		for (int v : set.values()) {
			if (v != 0) return false;
		}
		return true;

	}
}
