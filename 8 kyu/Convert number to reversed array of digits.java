/*Given a random non-negative number, you have to return the digits of this number within an array in reverse order.

Example(Input => Output):
348597 => [7,9,5,8,4,3]
0 => [0]*/

import java.util.Arrays;
import java.util.stream.*;

public class Kata {
  public static int[] digitize(long n) {
    String reversedNum = Stream.of(String.valueOf(n))
                .map(string -> new StringBuilder(string).reverse())
                .collect(Collectors.joining());
        
     return Stream.of(reversedNum.split("(?!^)"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
  }
}
