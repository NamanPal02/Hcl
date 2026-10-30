
package Day3;

import java.util.ArrayList;
import java.util.Comparator;

class Student {
    String name;
    int roll_no;
    int age;
    int marks;

    // Constructor
    Student(String name, int roll_no, int age, int marks) {
        this.name = name;
        this.roll_no = roll_no;
        this.age = age;
        this.marks = marks;
    }

    // Display student details
    void display() {
        System.out.println(
                name + " | " + roll_no + " | " + age + " | " + marks
        );
    }
}

public class students {
    public static void main(String[] args) {

        // Create ArrayList
        ArrayList<Student> student = new ArrayList<>(10);

        // Add 10 students
        student.add(new Student("Naman", 14, 21, 97));
        student.add(new Student("Nancy", 15, 20, 96));
        student.add(new Student("aman", 16, 22, 76));
        student.add(new Student("amanya", 17, 19, 93));
        student.add(new Student("Arya", 18, 23, 69));
        student.add(new Student("garv", 19, 18, 19));
        student.add(new Student("tushar", 20, 24, 88));
        student.add(new Student("modi", 21, 20, 65));
        student.add(new Student("shah", 22, 22, 63));
        student.add(new Student("keju", 23, 21, 65));

        // Sort by age in ascending order
        student.sort(Comparator.comparingInt(s -> s.age));

        // Print student details
        System.out.println("Name | Roll No | Age | Marks");
        System.out.println(" ");

        for (Student s : student) {
            s.display();
        }
    }
}
