/**Write a Java application that uses the Math class to determine the answers
 for each of the following:

 A random number between 0 and 10
 (Hint: The random() method returns a value between 0 and 1;
 you want a number that is 10 times larger.)
 Save the application as MathTest.java
 */

import java.util.Random;

public class MathTest4 {
    public static void main(String[] args){
        Random rand = new Random();
        int RandValue = rand.nextInt(10);
        System.out.println("A random Number between 0 and 10 is "+ RandValue);
    }
}
