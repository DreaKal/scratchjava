/**
 Write an application that accepts a user’s password from the keyboard.
 When the entered password is less than six characters, more than 10 characters,
 or does not contain at least one letter and one digit, prompt the user again.
 When the user’s entry meets all the password requirements, prompt the user to reenter the password,
 and do not let the user continue until the second password matches the first one.

 Save the file as Password.java.
 */

import javax.swing.JOptionPane;
public class Password {
    public static void main(String[] args) {
        String pInput = "";
        String pInput2 = "";
        int i = 0;
        do {
            pInput = JOptionPane.showInputDialog(null, "Please enter your password.\n"
                    + "Your password must have 6-10 characters\n"
                    + "Your password must contain at least one letter and one digit");
        } while (authenticate(pInput) == false);

        do {
            pInput2 = JOptionPane.showInputDialog(null, "Please re-enter your password: \n");
        } while (!pInput.equals(pInput2));

        if (pInput.equals(pInput2)) {
            JOptionPane.showMessageDialog(null, "Your password was successfully entered.");
        }

    }

    private static boolean compare(String pass1, String pass2) {
        char[] passArray1 = pass1.toCharArray();
        char[] passArray2 = pass2.toCharArray();
        boolean passCompare = false;
        int x = 0;

        for(int i = 0; i >= pass1.length(); i++) {

            if (passArray1[i] == passArray2[i]) {
                x++;
            }
        }

        if (x == pass1.length()) {
            passCompare = true;
        }
        else passCompare = false;

        if (passCompare = true)
            return true;

        else
            return false;
    }

    private static boolean authenticate(String password)
    {
        if (password == null || password.length() < 6 || password.length() > 10) {
            return false;

        }
        boolean containsChar = false;
        boolean containsDigit = false;

        for (char c : password.toCharArray()) {
            if (Character.isLetter(c)) {
                containsChar = true;
            } else if (Character.isDigit(c)) {
                containsDigit = true;
            }
            if (containsChar && containsDigit) {
                return true;
            }
        }
        return false;
    }
}