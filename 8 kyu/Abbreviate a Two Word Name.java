/*Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.

The output should be two capital letters with a dot separating them.

It should look like this:

Sam Harris => S.H

patrick feeney => P.F*/

public class AbbreviateTwoWords {

  public static String abbrevName(String name) {
        String[] ab = name.toUpperCase().split(" ");
        return ab[0].charAt(0) + "." + ab[1].charAt(0);
  }
}
