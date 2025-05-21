import java.util.Scanner;

public class Overloading {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

        System.out.println("Input your message ");
        String a = userInput.nextLine();
        ourGreeting(a = "there! ");

    }

    public static void ourGreeting(String a){
        System.out.println("Hello " + a);
    }
}
