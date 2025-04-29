package Task_no_4_q_4;

import java.util.*;

public class StudentGrades {
	
	static HashMap<String, Integer> studentMap = new HashMap<>();

	public static void addStudent(String name, int grade) {
        studentMap.put(name, grade);
        System.out.println("Student added: " + name + " -> " + grade);
    }
	
    public static void removeStudent(String name) {
        if (studentMap.containsKey(name)) {
            studentMap.remove(name);
            System.out.println("Student removed: " + name);
        } else {
            System.out.println("Student not found: " + name);
        }
    }
    
    public static void displayGrade(String name) {
        if (studentMap.containsKey(name)) {
            System.out.println("Grade of " + name + ": " + studentMap.get(name));
        } else {
            System.out.println("Student not found: " + name);
        }
    }
    
    public static void displayAllStudents() {
        if (studentMap.isEmpty()) {
            System.out.println("No student data available.");
        } else {
            System.out.println("All Students and Grades:");
            for (String name : studentMap.keySet()) {
                System.out.println(name + " -> " + studentMap.get(name));
            }
        }
    }

}
