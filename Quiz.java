/**
 * Write an application that creates a quiz. The quiz should contain at least five questions
 * about a hobby, popular music, astronomy, or any other personal interest.
 * Each question should be a multiple-choice question with at least four answer options.
 * When the user answers the question correctly, display a congratulatory message.
 * If the user responds to a question incorrectly, display an appropriate message as
 * well as the correct answer. At the end of the quiz, display the number of correct
 * and incorrect answers,
 * and the percentage of correct answers. */

import javax.swing.JOptionPane;

public class Quiz {
    private static boolean isValid(String a){
        a = a.toUpperCase();
        if(a.equals("A") || a.equals("B") || a.equals("C") || a.equals("D"))
        {
            return true;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please pick A, B, C or D");
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
            JOptionPane.showMessageDialog(null, "Great!");
            return true;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Infelicitous :)");
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

        String[][] question = new String[5][5];
        String[] correctAnswer = new String[5];

        question[0][0] = "1. Which of the following are not belong?";
        question[0][1] = "A) Alcohol";
        question[0][2] = "B) Facemask";
        question[0][3] = "C) Faceshield";
        question[0][4] = "D) Accessories";
        correctAnswer[0] = "D";

        question[1][0] = "2. As an IT Student, Which of the list is important?";
        question[1][1] = "A) Cellphone";
        question[1][2] = "B) Laptop";
        question[1][3] = "C) Codes";
        question[1][4] = "D) All of the above";
        correctAnswer[1] = "C";

        question[2][0] = "3. What is the smallest planet among the following"
                + " choices?";
        question[2][1] = "A) Mercury";
        question[2][2] = "B) Saturn";
        question[2][3] = "C) Mars";
        question[2][4] = "D) Jupiter";
        correctAnswer[2] = "A";

        question[3][0] = "4. Which of the following is the brightest color?";
        question[3][1] = "A) White";
        question[3][2] = "B) Yellow";
        question[3][3] = "C) Green";
        question[3][4] = "D) Neon Blue";
        correctAnswer[3] = "B";

        question[4][0] = "5. What is the first thing you do when you wake up?";
        question[4][1] = "A) Stretch your body";
        question[4][2] = "B) Get up";
        question[4][3] = "C) Open your eyes";
        question[4][4] = "D) Drink water";
        correctAnswer[4] = "C";

        do
        {
            response = askQuestion(question[i]);
            if(response.equals("ABORT"))
                return;
            if(isCorrect(correctAnswer[i], response))
                correct += 1;
            else
                incorrect += 1;

            i++;
        } while(i < question.length);

        showGrade(correct, incorrect);
    }
}