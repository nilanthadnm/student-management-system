package com.academy.database;

import com.academy.model.Student;

public class StudentDBConnection {
    private static StudentDBConnection studentDBConnection;
    private StudentDB studentDB;

    private StudentDBConnection(){
        studentDB=new StudentDB();
    }

    public static StudentDBConnection getInstance() {
        if (studentDBConnection==null){
            studentDBConnection =new StudentDBConnection();
        }
        return studentDBConnection;
    }

    public StudentDB getStudentDB(){
        return studentDB;
    }


}
