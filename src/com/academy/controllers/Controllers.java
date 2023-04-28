package com.academy.controllers;

import com.academy.database.StudentDBConnection;
import com.academy.database.StudentDB;
import com.academy.model.Student;

public class Controllers {

    public static boolean addStudent(Student student){
        StudentDB studentDB = StudentDBConnection.getInstance().getStudentDB();
        return studentDB.addStudent(student);
    }

    public static Student[] getStudents() {
        StudentDB studentDB = StudentDBConnection.getInstance().getStudentDB();
        return studentDB.toArray();
    }

    public static Student searchStudent(String studentId){
        StudentDB studentDB = StudentDBConnection.getInstance().getStudentDB();
        return studentDB.searchStudent(studentId);
    }

    public static boolean removeStudent(String studentID){
        StudentDB studentDB= StudentDBConnection.getInstance().getStudentDB();
        return studentDB.removeStudent(studentID);
    }
}
