package Task_no_4_q_4;

import java.util.Scanner;

public class Testing {

	public Testing() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Display Grade");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // clear newline

            switch (choice) {
                case 1:
                    System.out.print("Enter student name: ");
                    String nameAdd = scanner.nextLine();
                    System.out.print("Enter grade: ");
                    int grade = scanner.nextInt();
                    StudentGrades.addStudent(nameAdd, grade);
                    break;
                case 2:
                    System.out.print("Enter student name to remove: ");
                    String nameRemove = scanner.nextLine();
                    StudentGrades.removeStudent(nameRemove);
                    break;
                case 3:
                    System.out.print("Enter student name to display grade: ");
                    String nameDisplay = scanner.nextLine();
                    StudentGrades.displayGrade(nameDisplay);
                    break;
                case 4:
                    StudentGrades.displayAllStudents();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 5);

        scanner.close();
	}
}