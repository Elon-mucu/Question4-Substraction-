package final_exam;

import java.util.Scanner;
import java.util.Random;

public class subtraction {

    public static void main(String[] args) {
        Random rand = new Random();
        int number1 = rand.nextInt(10);
        int number2 = rand.nextInt(10);

        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        System.out.print("What is " + number1 + " - " + number2 + "? ");
        int answer = new Scanner(System.in).nextInt();

        if (answer == (number1 - number2)) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. The correct answer is " + (number1 - number2));
        }
    }
}

