import java.util.*;

class Question {
    String Q;
    String option1;
    String option2;
    String option3;
    String option4;
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

}

class QuizManager {
    

        void quick(){

        

        Scanner sc = new Scanner(System.in);
        
        Question q1 = new Question("Q1: What is Java?", "a) Programming Language", "b) Indian Language", "c) Game",
                "d) Application", 'a');
        Question q2 = new Question("Q2: Who developed Java?", "a) Microsoft", "b) Sun Microsystems", "c) Google",
                "d) Apple", 'b');
        Question q3 = new Question("Q3: What is OOP?", "a) Object Oriented Programming", "b) Open Operating Platform",
                "c) Output Operation Process", "d) None", 'a');

        int score = 0;

         char arr[]={Question.q1,Question.q2,Question.q3}; 
         for(int i = 0; i< arr.length; i++){
            System.out.println();

         }

        for (int i = 1; i <= 3; i++) {
            if (i == 1) {
                q1.display();

            }

            if (i == 2) {
                q2.display();
            }
            if (i == 3) {
                q3.display();
            }

            char ans1 = sc.next().charAt(0);

            switch (i) {

                case 1:
                    if (ans1 == q1.ans) {
                        System.out.println("Correct.");
                        System.out.println(" ");
                        score++;

                    } else {
                        System.out.println("Incorrect !");
                        System.out.println(" ");

                    }

                    break;
                case 2:
                    if (ans1 == q2.ans) {
                        System.out.println("Correct.");
                        System.out.println(" ");
                        score++;

                    } else {
                        System.out.println("Incorrect !");
                        System.out.println(" ");

                    }
                    break;
                case 3:
                    if (ans1 == q3.ans) {
                        System.out.println("Correct.");
                        System.out.println(" ");
                        score++;

                    } else {
                        System.out.println("Incorrect !");
                        System.out.println(" ");

                    }

                    break;

                default:
                    break;
            }

        }
        System.out.println("Score = " + score + "/3");
        System.out.println("Percentage = ");
    }
}

public class OnlineQuizApp {
    public static void main(String[] args) {

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");
        System.out.println("-------------------Quiz Start------------------");
        System.out.println(" ");
        System.out.println(" ");

        QuizManager q = new QuizManager();
        q.quick();

        
    }
}
