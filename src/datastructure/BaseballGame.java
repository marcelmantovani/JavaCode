package datastructure;

import java.util.Stack;

/**
 * 
 * @author Marcel
 *
 *You are keeping score for a baseball game with strange rules. The game consists of several rounds, where the scores of past rounds may affect future rounds' scores.

At the beginning of the game, you start with an empty record. You are given a list of strings ops, where ops[i] is the ith operation you must apply to the record and is one of the following:

An integer x - Record a new score of x.
"+" - Record a new score that is the sum of the previous two scores. It is guaranteed there will always be two previous scores.
"D" - Record a new score that is double the previous score. It is guaranteed there will always be a previous score.
"C" - Invalidate the previous score, removing it from the record. It is guaranteed there will always be a previous score.
Return the sum of all the scores on the record.
 */
public class BaseballGame {
	public int calPoints(String[] ops) {
		Stack<Integer> scores = new Stack<Integer>();
		int sum = 0;
		for (String s : ops) {
			
			switch(s) {
			case "+":
				int i = scores.size() - 1;
				scores.add(scores.get(i) + scores.get(i-1));
				break;
			case "D":
				scores.add(scores.peek() * 2);
				break;
			case "C":
				scores.pop();
				break;
			default:
				scores.add( Integer.parseInt(s)  );
				break;
			}
		}
		
		for (int score : scores) {
			sum += score;
		}
		
		return sum;
	}
}
