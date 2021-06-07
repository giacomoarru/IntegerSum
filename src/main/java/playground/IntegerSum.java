package playground;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class IntegerSum {

	/**
	 * Given an array of Integers, find all the pairs of Integers whose sum is 10
	 * @param args
	 */
	public static void main(String[] args) {

		for (Entry<Integer, Integer> entry : findIntegers(
				new int[] {-10,-9,-8,-7,-6,-5,-4,-3,-2,-1,0,1,2,3,4,5,6,7,8,9,10}
				).entrySet()
				)
		{
			System.out.println(entry.getKey() + ", " + entry.getValue());
		}

	}

	private static Map<Integer, Integer> findIntegers(int[] input) {
		int neededSum = 10;
		Map<Integer, Integer> result = new HashMap<Integer, Integer>();

		for (int i = 0; i < input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				if (i != j && input[i] + input[j] == neededSum) {
					if (i > j)
						result.put(input[j], input[i]);
					else {
						result.put(input[i], input[j]);
					}
				}
			}

		}
		return result;
	}

}
