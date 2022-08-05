/*Find the sum of the odd numbers within an array, after cubing the initial integers. 
The function should return undefined/None/nil/NULL if any of the values aren't numbers.*/

import java.util.Arrays;

public class FindOddCubes {
 
 public static int cubeOdd(int arr[]) {
    return Arrays.stream(arr)
                  .filter(x -> x % 2 != 0)
                  .map(x -> (int) Math.pow(x, 3))
                  .sum();
  }
}
