/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RC_Student_lab
 */
public class StudentTest {

    public static void main(String[] args) {
        // Reset the student list before running tests
        resetStudentList();

        testSaveStudent();
        testSearchStudent();
        testSearchStudent_StudentNotFound();
        testDeleteStudent();
        testDeleteStudent_StudentNotFound();
    }

    private static void resetStudentList() {
        // Clear the static student list before running tests
        Student.students();
    }

    public static void testSaveStudent() {
        Student student = new Student(1, "Tsakani", 20, "Zithatsakani56@gmail.com", "Software development");
        Student.saveStudent(student);
        if (Student.searchStudent(1) == student) {
            System.out.println("TestSaveStudent: Passed");
        } else {
            System.out.println("TestSaveStudent: Failed");
        }
    }

    public static void testSearchStudent() {
        Student student = new Student(1, "Tsakani", 20, "Zithatsakani56@gmail.com", "Software development");
        Student.saveStudent(student);
        Student foundStudent = Student.searchStudent(1);
        if (foundStudent != null && foundStudent.getId() == 1) {
            System.out.println("TestSearchStudent: Passed");
        } else {
            System.out.println("TestSearchStudent: Failed");
        }
    }

    public static void testSearchStudent_StudentNotFound() {
        Student foundStudent = Student.searchStudent(999); // Assuming 999 is not in the list
        if (foundStudent == null) {
            System.out.println("TestSearchStudent_StudentNotFound: Passed");
        } else {
            System.out.println("TestSearchStudent_StudentNotFound: Failed");
        }
    }

    public static void testDeleteStudent() {
        Student student = new Student(1, "Tsakani", 20, "Zithatsakani56@gmail.com", "Software development");
        Student.saveStudent(student);
        Student.deleteStudent(1);
        if (Student.searchStudent(1) == null) {
            System.out.println("TestDeleteStudent: Passed");
        } else {
            System.out.println("TestDeleteStudent: Failed");
        }
    }

    public static void testDeleteStudent_StudentNotFound() {
        Student.deleteStudent(999); // Assuming 999 is not in the list
        if (Student.students()) {
            System.out.println("TestDeleteStudent_StudentNotFound: Passed");
        } else {
            System.out.println("TestDeleteStudent_StudentNotFound: Failed");
        }
    }
}
