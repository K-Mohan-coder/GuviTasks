package Task_no_4_q_5;

import java.util.ArrayList;
import java.util.Scanner;

public class IntegerCollection {

	public IntegerCollection() {
		// TODO Auto-generated constructor stub
	}
	
	static ArrayList<Integer> numbers = new ArrayList<>();
	
    public static void addInteger(int num) {
        numbers.add(num);
        System.out.println(num + " added to the collection.");
    }
    
    public static void removeInteger(int num) {
        if (numbers.contains(num)) {
            numbers.remove(Integer.valueOf(num)); 
            System.out.println(num + " removed from the collection.");
        } else {
            System.out.println(num + " not found in the collection.");
        }
    }
    
    public static void displayIntegers() {
        if (numbers.isEmpty()) {
            System.out.println("The collection is empty.");
        } else {
            System.out.println("Integers in the collection: " + numbers);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice, number;

        do {
            System.out.println("\n===== Integer Collection Menu =====");
            System.out.println("1. Add Integer");
            System.out.println("2. Remove Integer");
            System.out.println("3. Display Integers");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter integer to add: ");
                    number = scanner.nextInt();
                    addInteger(number);
                    break;
                case 2:
                    System.out.print("Enter integer to remove: ");
                    number = scanner.nextInt();
                    removeInteger(number);
                    break;
                case 3:
                    displayIntegers();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter 1-4.");
            }

        } while (choice != 4);

        scanner.close();
    }
}


