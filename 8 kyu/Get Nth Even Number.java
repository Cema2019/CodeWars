/*Return the Nth Even Number

Example(Input --> Output)

1 --> 0 (the first even number is 0)
3 --> 4 (the 3rd even number is 4 (0, 2, 4))
100 --> 198
1298734 --> 2597466
The input will not be 0.*/

import java.util.stream.IntStream;

public class Num {
  public static int nthEven(int n) {
    return IntStream.iterate(0, i -> i + 2)
                    .limit(n)
                    .reduce((a, b) -> b)
                    .getAsInt();
  }
}
