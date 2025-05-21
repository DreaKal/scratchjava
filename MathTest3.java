/**Write a Java application that uses the Math class to determine the answers
 for each of the following:

 The larger and the smaller of the character K and the integer 70

 Save the application as MathTest.java
 */

import java.lang.Math;

public class MathTest3 {
    public static void main(String[] args){
        int max = Math.max((int)'K', 70);
        System.out.println("The Maximum between K and 70 is " + max);
    }
}
