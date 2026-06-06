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

      Question[] arr = {
    new Question("Q1: What is Java?", "a) Programming Language", "b) Indian Language", "c) Game", "d) Application", 'a'),
    new Question("Q2: Who developed Java?", "a) Microsoft", "b) Sun Microsystems", "c) Google", "d) Apple", 'b'),
    new Question("Q3: What is OOP?", "a) Object Oriented Programming", "b) Open Operating Platform", "c) Output Operation Process", "d) None", 'a'),
    new Question("Q4: Which keyword is used to inherit a class in Java?", "a) extends", "b) implements", "c) inherit", "d) super", 'a'),
    new Question("Q5: Which of these is not a Java primitive type?", "a) int", "b) float", "c) string", "d) char", 'c'),
    new Question("Q6: Which method is the entry point of a Java program?", "a) start()", "b) run()", "c) main()", "d) init()", 'c'),
    new Question("Q7: Which package is automatically imported in Java?", "a) java.util", "b) java.lang", "c) java.io", "d) java.sql", 'b'),
    new Question("Q8: Which of these is used to handle exceptions?", "a) try-catch", "b) if-else", "c) switch", "d) loop", 'a'),
    new Question("Q9: Which keyword is used to create an object?", "a) create", "b) new", "c) object", "d) alloc", 'b'),
    new Question("Q10: Which concept allows multiple methods with the same name but different parameters?", "a) Inheritance", "b) Polymorphism", "c) Overloading", "d) Overriding", 'c')
};


        int score = 0;

        for (Question q : arr) {
            System.out.println();
            q.display();
            System.out.print("Your answer: ");
            char userAns = sc.next().charAt(0);

            if (q.checkAnswer(userAns)) {
                System.out.println("✅ Correct!\n");
                score++;
            } else {
                System.out.println("❌ Incorrect!\n");
            }
        }

        System.out.println("Final Score = " + score + "/" + arr.length);
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
