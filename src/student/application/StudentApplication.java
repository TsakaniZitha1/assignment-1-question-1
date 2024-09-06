/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package student.application;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class StudentApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("STUDENT MANAGEMENT APPLICATION **********************");
        System.out.println("Enter (1) to launch menu or any other key to exit");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice == 1) {
            ArrayList<Student> students = new ArrayList<>();
            while (true) {
                System.out.println("Please select one of the following menu items:");
                System.out.println("(1) Capture a new student");
                System.out.println("(2) Search for a  student");
                System.out.println("(3) Delete a student");
                System.out.println("(4) Print student report");
                System.out.println("(5) Exit application ");
                System.out.print("Choose an option: ");
                int option = scanner.nextInt();

                switch (option) {
                    case 1:
                        CaptureStudent(scanner, students);
                        break;
                    case 2:
                        searchStudent(scanner, students);
                        break;
                    case 3:
                        deleteStudent(scanner, students);
                        break;
                    case 4:
                        PrintStudentsreport(students);
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid option. Please choose again.");
                }
            }
        } else {
            System.out.println("Exiting...");
        }
    }

    static void CaptureStudent(Scanner scanner, ArrayList<Student> students) {
        System.out.println("CAPTURE A NEW STUDENT");
        System.out.println("*********************");
        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter student name: ");
        String name = scanner.next();
        System.out.print("Enter student age: ");
        int age = scanner.nextInt();
        System.out.print("Enter student email: ");
        String email = scanner.next();
        System.out.print("Enter student course: ");
        String course = scanner.next();

        students.add(new Student(id, name, age, email, course));
        System.out.println("Student added successfully!");
    }

    static void searchStudent(Scanner scanner, ArrayList<Student> students) {
        System.out.print("Enter student ID to search: ");
        System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _");
        int id = scanner.nextInt();

        for (Student student : students) {
            if (student.getid() == id) {
                System.out.println("Student ID: " + student.id);
                System.out.println("Student Name: " + student.name);
                System.out.println("Student Age: " + student.age);
                System.out.println("Student Email: " + student.email);
                System.out.println("Student Course: " + student.course);
                return;
            }
        }

        System.out.println("Student not found!");
    }

    static void deleteStudent(Scanner scanner, ArrayList<Student> students) {
        System.out.print("Enter student ID to delete: ");
        int id = scanner.nextInt();

        for (Student student : students) {
            if (student.getid()== id) {
                students.remove(student);
                System.out.println("Student deleted successfully!");
                return;
            }
        }

        System.out.println("Student not found!");
    }

    static void PrintStudentsreport(ArrayList<Student> students) {
        if (students.isEmpty()) {
            System.out.println("No students in the system!");
        } else {
            for (Student student : students) {
                System.out.println("Student ID: " + student.id);
                System.out.println("Student Name: " + student.name);
                System.out.println("Student Age: " + student.age);
                System.out.println("Student Email: " + student.email);
                System.out.println("Student Course: " + student.course);
            }
        }
    }
}
