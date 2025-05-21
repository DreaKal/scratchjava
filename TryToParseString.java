/**
 The Integer.parseInt() method requires a String argument,
 but fails if the String cannot be converted to an integer.
 Write an application in which you try to parse a String that does not represent
 an integer value. Catch the NumberFormatException that is thrown,
 and then display an appropriate error message.

 Save the file as TryToParseString.java.*/

public class TryToParseString{
    public static void main(String[] args){
        String s = "100";
        String a = "TwoHundred";

        try
        {
            int i = Integer.parseInt(s.trim());
            System.out.println("int i = " + i);
        }
        catch (NumberFormatException nfe)
        {
            System.out.println("NumberFormatException: " + nfe.getMessage());
        }
    }
}