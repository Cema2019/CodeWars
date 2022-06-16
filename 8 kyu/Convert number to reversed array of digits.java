/*Given a random non-negative number, you have to return the digits of this number within an array in reverse order.

Example(Input => Output):
348597 => [7,9,5,8,4,3]
0 => [0]*/

import java.util.Arrays;

public class Kata {
  public static int[] digitize(long n) {
    return Arrays.stream(new StringBuilder().append(n).reverse().toString().split(""))
                            .mapToInt(Integer::parseInt)
                            .toArray();
  }
}
