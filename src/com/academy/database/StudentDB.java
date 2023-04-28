package com.academy.database;

import com.academy.model.Student;

public class StudentDB {
    private Student[] studentArr;
    private int index; //index of the studentArr

    public StudentDB() {
        studentArr = new Student[0];
        index = 0;
    }

    private void extendStudentArr() {
        Student[] tempArr = new Student[studentArr.length + 1];
        for (int i = 0; i < studentArr.length; i++) {
            tempArr[i] = studentArr[i];
        }
        studentArr = tempArr;
    }

    public boolean addStudent(Student student) {
        extendStudentArr();
        studentArr[studentArr.length-1] = student;
        return true;
    }

    //Search Student
    public int searchStudent(Student student) {
        for (int i = 0; i < studentArr.length; i++) {
            if (studentArr[i].equals(student)) {
                return i;
            }
        }
        return -1;
    }

    public Student searchStudent(String studentId) {
        for (int i = 0; i < studentArr.length; i++) {
            if (studentArr[i].getStudentID().equalsIgnoreCase(studentId)) {
                return studentArr[i];
            }
        }
        return null;
    }

    public Student[] toArray() {
        Student[] tempArr = new Student[studentArr.length];
        for (int i = 0; i < studentArr.length; i++) {
            tempArr[i] = studentArr[i];
        }
        return tempArr;
    }

    public boolean removeStudent(String studentID) {
        int n = searchStudent(new Student(studentID,null,0,0)); //get index of the student

        if(n ==-1){
            return false;
        }else{
            for (int i = n; i <index-1 ; i++) {
                studentArr[i]=studentArr[i+1];
            }
            return true;
        }
    }

    public Student getStudentWithID(String studentID) {
        Student student=searchStudent(studentID);
        int index=searchStudent(student);

        return studentArr[index];
    }

    public boolean updateStudent(Student student, String id, String name, double prf, double dbms) {
        student.setStudentID(id);
        student.setStudentName(name);
        student.setPrfMarks(prf);
        student.setDbmsMarks(dbms);

        return true;
    }
}
