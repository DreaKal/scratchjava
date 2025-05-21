public class CharacterInputCommand
{
    public static void main(String [] args)throws Exception
    {
        char charInput;

        System.out.println("Enter a character: ");
        charInput = (char)System.in.read();
        System.in.read();
        System.out.print("The character entered is: " + charInput);
    }
}