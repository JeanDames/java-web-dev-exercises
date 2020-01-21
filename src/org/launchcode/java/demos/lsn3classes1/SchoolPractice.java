package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student jd = new Student("Jean Dames", 22539, 1, 4.0);
        Student chuck = new Student("Chuck", 25606, 1, 3.7);
        Student amanda = new Student("Amanda S.", 23356, 2, 3.8);
        Teacher ct = new Teacher("Charles", "Thompson", "English", 20);
        ArrayList<Student> studentsInClass = new ArrayList<>();
        studentsInClass.add(jd);
        studentsInClass.add(chuck);
        studentsInClass.add(amanda);
        Course english = new Course("English", studentsInClass, ct);
        System.out.println("The course " + english.getCourseName() + " is attended by " + english.getStudents() + " and taught by " + ct.getFirstName() + " " + ct.getLastName());
    }
}
