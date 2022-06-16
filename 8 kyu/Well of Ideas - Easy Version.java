/*For every good kata idea there seem to be quite a few bad ones!

In this kata you need to check the provided array (x) for good ideas 'good' and bad ideas 'bad'. 
If there are one or two good ideas, return 'Publish!', if there are more than 2 return 'I smell a series!'. 
If there are no good ideas, as is often the case, return 'Fail!'.*/

import java.util.Arrays;

public class MyClass {
    
    public static String well(String[] x) {
        long result = Arrays.stream(x).filter(i -> i.equals("good")).count();
      
        if (result == 0) {
            return "Fail!";
        } else if (result >= 1 && result <= 2) {
            return "Publish!";
        } 
        return "I smell a series!";
    }
}
