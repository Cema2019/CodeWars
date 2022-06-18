/*Given an array of integers as strings and numbers, return the sum of the array values as if all were numbers.

Return your answer as a number.*/


import java.util.List;

public class MixedSum {

  public int sum(List<?> mixed) { 
    return mixed.stream()
                .map(Object::toString)
                .mapToInt(Integer::parseInt)
                .sum();
  }
}
