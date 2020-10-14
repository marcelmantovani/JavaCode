package numbers;

/**
 * 
 * @author Marcel
 * You have a grid of size n x 3 and you want to paint each cell of the grid with exactly one of the three colors: 
 * Red, Yellow or Green while making sure that no two adjacent cells have the same color 
 * (i.e no two cells that share vertical or horizontal sides have the same color).
 * 
 * You are given n the number of rows of the grid.
 * 
 * Return the number of ways you can paint this grid. As the answer may grow large, the answer must be computed modulo 10^9 + 7.
 * 
 * this code was copied from https://leetcode.com/problems/number-of-ways-to-paint-n-3-grid/discuss/574943/Java-Detailed-Explanation-with-Graph-Demo-DP-Easy-Understand
 */

public class WaysToPaintGrid {
	public int Solution (int n) {
		int MOD = (int) (1e9 + 7);
		/*
		init: for the single row, there are C(3, 3) * 3! = 6 3-color combinations, and C(3, 2) * 2 = 6 2-color combinations.
		C(3, 3) * 3! means: choose 3 colors out of 3, and, first cell: 3 possibilities, second cell: 2 possibilities, third cell: only 1 possibility.
		C(3, 2) * 2 means: choose 2 colors out of 3, and, there are only two ways: ABA or BAB.
		*/
		long color3 = 6;
		long color2 = 6;

		for (int i = 2; i <= n; ++i) {
			long tempColor3 = color3;
			color3 = (2 * color3 + 2 * color2) % MOD;
			color2 = (2 * tempColor3 + 3 * color2) % MOD;
		}

		return (int) (color3 + color2) % MOD;
	}
}
