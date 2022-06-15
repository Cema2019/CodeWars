/*Given an array of integers.

Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers. 0 is neither positive nor negative.

If the input is an empty array or is null, return an empty array.

Example
For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65].*/


import java.util.Arrays;
import java.util.stream.*;
import java.util.Optional;

public class Kata {
    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) return new int[0];
        int countPos = (int)Arrays.stream(input).filter(i -> i > 0).count();
        int sumNeg = (int)Arrays.stream(input).filter(i -> i < 0).sum();
        return new int[] {countPos, sumNeg};
    }
}
