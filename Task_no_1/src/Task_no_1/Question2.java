package Task_no_1;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Positive.");
        } else if (number < 0) {
            System.out.println("Negative.");
        } 
        scanner.close();
    }
}
