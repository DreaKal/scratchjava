/**Create a class named Eggs. Its main() method holds an integer variable
 * named of numberOfEggs to which
 * you will assign a value entered by a user at the keyboard.
 * Create a method to which you pass numberOfEggs.
 * The method displays the eggs in dozens:for example,
 * 50 eggs is 4 full dozen (with 2 eggs remaining).*/

import java.util.Scanner;
public class Eggs {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter number of Eggs: ");
        int numberOfEggs = keyboard.nextInt();
        displayEggs(numberOfEggs);
    }

    public static void displayEggs(int eggs) {
        int dozen = eggs / 12;
        int remainderdozen = eggs % 12;
        System.out.println("You have " + dozen + " dozen eggs with " + remainderdozen + " left over.");
    }
}
