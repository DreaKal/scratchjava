/**Three-letter acronyms are common in the business world. For example, in Java you use the IDE
  (Integrated Development Environment) in the JDK (Java Development Kit) to write programs used
  by the JVM (Java Virtual Machine) that you might send over a LAN (Local Area Network).
  Programmers even use the acronym TLA to stand for three-letter acronym.
  Write a program that allows a user to enter three words, and display the appropriate
  three-letter acronym in all uppercase letters.
  If the user enters more than three words, ignore the extra words.
  Figure 7-19 shows a typical execution.

  Save the file as ThreeLetterAcronym.java.
 */

import javax.swing.JOptionPane;

public class ThreeLetterAcronym{
    public static void main(String[]args){
        String RAM;
        RAM = JOptionPane.showInputDialog(null, "Please enter three words");
        String[] letters = RAM.split(" ");
        char firstWord = letters[0].charAt(0);
        char secondWord = letters[1].charAt(0);
        char thirdWord = letters[2].charAt(0);
        JOptionPane.showMessageDialog(null, "Original phrase was\nThree-letter Acronym is: "+firstWord+secondWord+thirdWord);
    }
}