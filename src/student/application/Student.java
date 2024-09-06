/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student.application;

import java.util.ArrayList;

/**
 *
 * @author RC_Student_lab
 */
class Student {
       int id;
    String name;
    int age;
    String email;
    String course;
    private static ArrayList<Student> students = new ArrayList<>();

    public Student(int id, String name, int age, String email, String course) {
        this.id= id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.course = course;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getCourse() {
        return course;
    }

    public static void saveStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

    public static void searchStudent(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println("Student ID: " + student.getId());
                System.out.println("Student Name: " + student.getName());
                System.out.println("Student Age: " + student.getAge());
                System.out.println("Student Email: " + student.getEmail());
                System.out.println("Student Course: " + student.getCourse());
                return;
            }
        }
        System.out.println("Student not found!");
    }

    public static void deleteStudent(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                students.remove(student);
                System.out.println("Student deleted successfully!");
                return;
            }
        }
        System.out.println("Student not found!");
    }

    public static void studentReport() {
        if (students.isEmpty()) {
            System.out.println("No students in the system!");
        } else {
            for (Student student : students) {
                System.out.println("Student ID: " + student.getId());
                System.out.println("Student Name: " + student.getName());
                System.out.println("Student Age: " + student.getAge());
                System.out.println("Student Email: " + student.getEmail());
                System.out.println("Student Course: " + student.getCourse());
            }
        }
    }

    public static void exitStudentApplication() {
        System.out.println("Exiting...");
        System.exit(0);
    }

    int getid() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
