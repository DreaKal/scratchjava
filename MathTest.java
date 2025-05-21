/**Write a Java application that uses the Math class to determine the answers
 for each of the following:

 The square root of 30
 The sine and cosine of 100
 The value of the floor, ceiling, and round of 44.7
 The larger and the smaller of the character K and the integer 70

 A random number between 0 and 10
 (Hint: The random() method returns a value between 0 and 1;
 you want a number that is 10 times larger.)
 Save the application as MathTest.java
 */

import java.util.Scanner;

public class MathTest {
    public static void main(String args[]) {
        Double num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = sc.nextDouble();
        Double square = num * num;
        System.out.println("Square of " + num + " is: " + square);
    }
}
