/*Given a string s. You have to return another string such that even-indexed and odd-indexed characters of s are 
grouped and groups are space-separated (see sample below)

Note: 
0 is considered to be an even index. 
All input strings are valid with no spaces*/


import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OddEvenSort {
  public static String sortMyString(String s) {

 return  IntStream.range(0, s.length())
            .filter(x -> x % 2 == 0)
            .mapToObj(x -> String.valueOf(s.charAt(x)))
            .collect( Collectors.joining( "" )) 
          + " " +
          IntStream.range(0, s.length())
            .filter(x -> x % 2 != 0)
            .mapToObj(x -> String.valueOf(s.charAt(x)))
            .collect( Collectors.joining( "" )); 
  }
}
