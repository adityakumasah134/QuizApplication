import java.util.*;

class Question {
    String Q;
    String option1, option2, option3, option4;
    char ans;

    Question(String Q, String option1, String option2, String option3, String option4, char ans) {
        this.Q = Q;
        this.option1 = option1;
        this.option2 = option2;
        this.option3 = option3;
        this.option4 = option4;
        this.ans = ans;
    }

    void display() {
        System.out.println(Q);
        System.out.println(option1);
        System.out.println(option2);
        System.out.println(option3);
        System.out.println(option4);
    }

    boolean checkAnswer(char userAns) {
        return userAns == ans;
    }
}

class QuizManager {

    void quick() {

        Scanner sc = new Scanner(System.in);

        Question q1 = new Question(
                "Q1: What is Java?",
                "a) Programming Language",
                "b) Indian Language",
                "c) Game",
                "d) Application",
                'a');

        Question q2 = new Question(
                "Q2: Who developed Java?",
                "a) Microsoft",
                "b) Sun Microsystems",
                "c) Google",
                "d) Apple",
                'b');

        Question q3 = new Question(
                "Q3: What is OOP?",
                "a) Object Oriented Programming",
                "b) Open Operating Platform",
                "c) Output Operation Process",
                "d) None",
                'a');

        Question arr[] = { q1, q2, q3 };

        int score = 0;

        for (int i = 0; i < arr.length; i++) {

            System.out.println();
            arr[i].display();

            char userAns = sc.next().charAt(0);

            if (userAns == arr[i].ans) {
                System.out.println("Correct");
                score++;
            } else {
                System.out.println("Incorrect");
            }
        }

        System.out.println();
        System.out.println("Score = " + score + "/" + arr.length);

        double percentage = (score * 100.0) / arr.length;
        System.out.println("Percentage = " + percentage + "%");
    }
}

public class OnlineQuizApp {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("-------------------Quiz Start------------------");
        System.out.println();

        QuizManager q = new QuizManager();
        q.quick();
    }
}
