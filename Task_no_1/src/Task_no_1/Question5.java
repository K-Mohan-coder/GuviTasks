package Task_no_1;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Amount: ");
        int amt = scanner.nextInt();

        if (amt < 500) {
            System.out.println("No Discount Available and Final Amount is : " + String.valueOf(amt));
        } else if (amt >= 500 && amt <= 1000) {
            System.out.println("Final Amount is : " + String.valueOf(amt - (amt * 1 / 10)));
        } else {
            System.out.println("Final Amount is : " + String.valueOf(amt - (amt * 1 / 5)));
        }
        scanner.close();
    }
}
