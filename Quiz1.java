/**
 Write an application that contains an array of 10 multiple-choice quiz questions related to your favorite hobby.
 Each question contains three answer choices. Also create an array that holds the correct answer to
 each question—A, B, or C. Display each question and verify that the user enters only A, B, or C as the answer—if
 not, keep prompting the user until a valid response is entered. If the user responds to a question correctly,
 display “Correct!”; otherwise, display “The correct answer is” and the letter of the correct answer.
 After the user answers all the questions, display the number of correct and incorrect answers.

 Save the file as Quiz.java
 */

import javax.swing.JOptionPane;

public class Quiz1 {
    private static boolean isValid(String a) {
        a = a.toLowerCase();
        if(a.equals("a") || a.equals("b") || a.equals("c"))
        {
            return true;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please pick A, B, or C");
            return false;
        }
    }
    private static String askQuestion(String[] q)
    {
        String fmtQuestion = "";
        String answer = "";

        for(int i = 0; i < q.length; i++)
            fmtQuestion += q[i] + "\n";

        do
        {
            answer = JOptionPane.showInputDialog(null, fmtQuestion);
            if(answer == null)
            {
                int quit = JOptionPane.showConfirmDialog(null, "Would you like to quit?", "Quit", JOptionPane.YES_NO_OPTION);
                if(quit == 0)
                    return "ABORT";
                else
                    continue;
            }
        } while (answer == null || !(isValid(answer)));

        return answer;
    }

    private static boolean isCorrect(String a, String r)
    {
        r = r.toUpperCase();
        if(a.equals(r))
        {
            JOptionPane.showMessageDialog(null, "Correct!");
            return true;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "The correct answer is: \n" + a);
            return false;
        }
    }

    public static void showGrade(int c, int i)
    {
        int numberQuestions = c + i;
        String fmtGrade = "";
        int pointsPerQuestion = 100 / numberQuestions;
        int grade = c * pointsPerQuestion;

        fmtGrade += "You answered " + c + " correctly and " + i + " incorrectly";
        fmtGrade += "\nYour grade is: " + grade + "%";

        JOptionPane.showMessageDialog(null, fmtGrade);
    }

    public static void main(String[] args)
    {
        int i = 0;
        int correct = 0;
        int incorrect = 0;
        String response = "";

        String[][] Q = new String[10][4];
        String[] A = new String[10];

        Q[0][0] = "What is the most watched in Netflix?";
        Q[0][1] = "A) Squid Game";
        Q[0][2] = "B) Arcane by League of Legends";
        Q[0][3] = "C) I Am Legend";
        A[0] = "B";

        Q[1][0] = "What is you favorite snacks?";
        Q[1][1] = "A) Cookies";
        Q[1][2] = "B) Junk Food";
        Q[1][3] = "C) All of the above";
        A[1] = "C";

        Q[2][0] = "It is the most exerting yet enjoyable exercise";
        Q[2][1] = "A) Bicycle";
        Q[2][2] = "B) Jogging";
        Q[2][3] = "C) Pushup";
        A[2] = "A";

        Q[3][0] = "What is your type of brand of cellphone?";
        Q[3][1] = "A) Samsung, Huawei, Oppo, Mi";
        Q[3][2] = "B) Real Me, Apple, Xaomi, Vivo";
        Q[3][3] = "C) All of the above";
        A[3] = "C";

        Q[4][0] = "What is the your favorite fast food restaurant";
        Q[4][1] = "A) McDonalds";
        Q[4][2] = "B) Jolibee";
        Q[4][3] = "C) All of the above";
        A[4] = "C";

        Q[5][0] = "What is the most flavourful beverages";
        Q[5][1] = "A) Juice";
        Q[5][2] = "B) Pepsi";
        Q[5][3] = "C) Rootbeer";
        A[5] = "B";

        Q[6][0] = "What is the color of can of San Marino Corned Tuna";
        Q[6][1] = "A) Red";
        Q[6][2] = "B) Yellow";
        Q[6][3] = "C) Orange";
        A[6] = "A";

        Q[7][0] = "If the mosquito bites a boob what will it sucks?";
        Q[7][1] = "A) Milk";
        Q[7][2] = "B) Blood";
        Q[7][3] = "C) Neither?";
        A[7] = "C";

        Q[8][0] = "If the person is blind, will he see a color?";
        Q[8][1] = "A) Yes";
        Q[8][2] = "B) No";
        Q[8][3] = "C) Maybe?";
        A[8] = "C";

        Q[9][0] = "Which of the following would you prefer as a IT Student:";
        Q[9][1] = "A) Earphone";
        Q[9][2] = "B) Airpods";
        Q[9][3] = "C) Headset";
        A[9] = "B";

        do
        {
            response = askQuestion(Q [i]);
            if(response.equals("ABORT"))
                return;
            if(isCorrect(A [i], response))
                correct += 1;
            else
                incorrect += 1;

            i++;
        } while(i < Q.length);

        showGrade(correct, incorrect);
    }
}