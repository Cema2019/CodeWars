/*Task
Given the a list of numbers, return a fixed list so that the values increment by 1 for each index from the minimum value up to the maximum value (both included).

Example
Input: 1,3,5,6,7,8 Output: 1,2,3,4,5,6,7,8*/

import java.util.Arrays;
import java.util.stream.*;

public class Kata {
  public static int[] pipeFix(int[] numbers) {
    return IntStream.rangeClosed(numbers[0], numbers[numbers.length - 1]).toArray();
  }
}
