import java.io.*;
public class ConvertingStringtoReal2
{
    public static void main(String [] args)throws Exception
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        String profName,subject,room,rate,age;
        int profAge;
        double profRate;

        System.out.print("\n\n\t\tEnter name of professor: ");
        profName = input.readLine();
        System.out.print("\n\n\t\tEnter age: ");
        age = input.readLine();
        profAge = Integer.parseInt(age);
        System.out.print("\n\n\t\tEnter rate: ");
        rate = input.readLine();
        profRate = Double.parseDouble(rate);
        System.out.print("\n\n\t\tEnter subject: ");
        subject = input.readLine();
        System.out.print("\n\n\t\tEnter room assignment: ");
        room = input.readLine();

        System.out.println("\n\n**********************************************");
        System.out.println("\t\t\tNAME: " + profName);
        System.out.println("\t\t\tAGE: " + age);
        System.out.println("\t\t\tRATE: " + profRate);
        System.out.println("\t\t\tSUBJECT: " + subject);
        System.out.println("\t\t\tROOM: " + room);
        System.out.println("\n\n**********************************************");

    }
}