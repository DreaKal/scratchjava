/**Write an application for a furniture company; the program determines the price of a table.
 * Ask the user to choose 1 for pine, 2 for oak, or 3 for mahogany. The output is the name of the
 * wood chosen as well as the price of the table. Pine tables cost $100, oak tables cost $225,
 * and mahogany tables cost $310. If the user enters an invalid wood code, set the price to 0.

 Save the file as Furniture.java.*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class Furniture {
    private static final int PINE_WOOD_TABLE_PRICE = 100;
    private static final int OAK_WOOD_TABLE_PRICE = 225;
    private static final int MAHOGANY_WOOD_TABLE_PRICE = 310;

    public static void main(String[] args) {
        System.out.println("Select wood for the table: ");
        System.out.println("  [1] Pine");
        System.out.println("  [2] Oak");
        System.out.println("  [3] Mahogany");

        byte option = 0;
        Scanner userInput = new Scanner(System.in);
        try {
            option = userInput.nextByte();
        }
        catch (InputMismatchException e) {

            System.out.println("You must enter a number.");
            System.exit(1);
        }

        switch (option) {
            case 1:
                printTableInformation("Pine", PINE_WOOD_TABLE_PRICE);
                break;
            case 2:
                printTableInformation("Oak", OAK_WOOD_TABLE_PRICE);
                break;
            case 3:
                printTableInformation("Mahogany", MAHOGANY_WOOD_TABLE_PRICE);
                break;
            default:
                System.out.println("Please select 1, 2 or 3.");
                break;
        }
    }

    private static void printTableInformation(String wood, int price) {
        System.out.println("Wood chosen: " + wood + "; Table price: $" + price);
    }
}
