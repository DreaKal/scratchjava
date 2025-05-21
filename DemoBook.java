import java.util.Scanner;
public class DemoBook {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Book BookObject = new Book();
        Textbook TextbookObject = new Textbook();

        System.out.println("Fill up The following: ");
        System.out.println();
        System.out.println("Title of the book: ");
        String next = input.nextLine();
        BookObject.setName(next);

        System.out.println("Number of Pages: ");
        String next2 = input.nextLine();
        BookObject.setName2(next2);

        System.out.println("Grade level: ");
        String next3 = input.nextLine();
        TextbookObject.setName3(next3);

        System.out.println();
        BookObject.message();
        System.out.println();
        BookObject.message2();
        System.out.println();
        TextbookObject.message3();
    }

}