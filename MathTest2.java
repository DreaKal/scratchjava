/**Write a Java application that uses the Math class to determine the answers
 for each of the following:


 The value of the floor, ceiling, and round of 44.7
 Save the application as MathTest.java
 */

import java.lang.Math;

public class MathTest2 {

    public static void main(String[] args) {
        double c = 44.7;
        System.out.println("The Floor, Ceiling and Round Value of 44.7 are "+Math.floor(c)+", "+Math.ceil(c)
                +", "+Math.round(c));
    }
}