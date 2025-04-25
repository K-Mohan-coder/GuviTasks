package Task_no_1;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        String numberToString = String.valueOf(number);
        String reversedString = "";

        for (int i = numberToString.length() - 1; i >= 0; i--) {
            reversedString += numberToString.charAt(i);
        }
        System.out.println(reversedString);
        scanner.close();
    }
}
