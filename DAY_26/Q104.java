import java.util.Scanner;
public class Q104 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;

        String[] questions = {
            "1. What is the capital of France?\n a) London\n b) Paris\n c) Rome",
            "2. Which data type is used to create a variable that should store text in Java?\n a) String\n b) Txt\n c) myString",
            "3. Which method can be used to find the length of a string?\n a) getSize()\n b) length()\n c) len()"
        };

        char[] answers = {'b', 'a', 'b'};

        System.out.println("Welcome to the Java Quiz!\n");

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.print("Your answer (a/b/c): ");
            char answer = sc.next().toLowerCase().charAt(0);

            if (answer == answers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer was '" + answers[i] + "'.\n");
            }
        }

        System.out.println("Quiz over! Your final score is " + score + " out of " + questions.length + ".");
    }
}