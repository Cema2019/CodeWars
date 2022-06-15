/*Write a function to split a string and convert it into an array of words.

Examples (Input ==> Output):
"Robin Singh" ==> ["Robin", "Singh"]*/

import java.util.Arrays;
import java.util.stream.*;

public class Solution {

    public static String[] stringToArray(String s) {
        return Stream.of(s.split(" "))
                  .toArray(String[]::new);
    }
}
