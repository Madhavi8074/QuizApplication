package projects;

import java.util.Scanner;

public class QuizApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the Quiz!");
        System.out.println("----------------------");

        // Question 1
        System.out.println("1. What is the capital of France?");
        System.out.println("   a) Berlin");
        System.out.println("   b) Madrid");
        System.out.println("   c) Paris");
        System.out.println("   d) Rome");
        System.out.print("Your answer: ");
        char answer1 = scanner.next().charAt(0);

        if (answer1 == 'c' || answer1 == 'C') {
            System.out.println("Correct!\n");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is c) Paris.\n");
        }

        // Question 2
        System.out.println("2. What is 5 + 7?");
        System.out.println("   a) 10");
        System.out.println("   b) 12");
        System.out.println("   c) 14");
        System.out.println("   d) 15");
        System.out.print("Your answer: ");
        char answer2 = scanner.next().charAt(0);

        if (answer2 == 'b' || answer2 == 'B') {
            System.out.println("Correct!\n");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is b) 12.\n");
        }

        // Question 3
        System.out.println("3. Which planet is known as the Red Planet?");
        System.out.println("   a) Earth");
        System.out.println("   b) Mars");
        System.out.println("   c) Venus");
        System.out.println("   d) Jupiter");
        System.out.print("Your answer: ");
        char answer3 = scanner.next().charAt(0);

        if (answer3 == 'b' || answer3 == 'B') {
            System.out.println("Correct!\n");
            score++;
        } else {
            System.out.println("Wrong! The correct answer is b) Mars.\n");
        }

        // Display final score
        System.out.println("----------------------");
        System.out.println("Quiz Over!");
        System.out.println("Your final score is: " + score + "/3");
        
        scanner.close();
    }
}

