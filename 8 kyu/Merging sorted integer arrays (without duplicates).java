/*Write a function that merges two sorted arrays into a single one. 
The arrays only contain integers. Also, the final outcome must be sorted and not have any duplicate.*/

import java.util.Arrays;
import java.util.stream.*;

public class Kata {
	public static int[] mergeArrays(int[] first, int[] second) {
		return Stream.of(first, second)
                        .flatMapToInt(Arrays::stream)
                        .distinct()
                        .sorted()
                        .toArray();
	}
}
