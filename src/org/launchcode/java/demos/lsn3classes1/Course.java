package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {

    private String courseName;
    private ArrayList<Student> students;
    private Teacher teacherClass;

    public Course(String courseName, ArrayList<Student> studentList, Teacher courseTeacher) {
        this.courseName = courseName;
        this.students = studentList;
        this.teacherClass = courseTeacher;
    }

    public String getCourseName(){
        return courseName;
    }

     public String getStudents(){
        String classroomList = "";
        int i = 0;
        for(Student student: students){
            if(i == students.size()-1){
                classroomList += "and " + student.getName();
            } else{
                classroomList += student.getName() + ", ";
            }
            i++;
        }
        return classroomList;
     }

    public Teacher getTeacherClass() {
        return teacherClass;
    }

    public void setCourseName(String aCourseName) {
        courseName = aCourseName;
    }

    public void setStudents(ArrayList<Student> aStudents) {
        students = aStudents;
    }

    public void setTeacherClass(Teacher aTeacherClass) {
        teacherClass = aTeacherClass;
    }

    //    private
}
