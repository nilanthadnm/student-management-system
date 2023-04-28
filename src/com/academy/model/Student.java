package com.academy.model;

public class Student {
    private String studentID;
    private String studentName;
    private double prfMarks;
    private double dbmsMarks;

    public Student(String studentID, String studentName, double prfMarks, double dbmsMarks) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.prfMarks = prfMarks;
        this.dbmsMarks = dbmsMarks;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getPrfMarks() {
        return prfMarks;
    }

    public double getDbmsMarks() {
        return dbmsMarks;
    }

    @Override
    public boolean equals(Object obj) {
        Student student=(Student) obj;
        return this.studentID.equalsIgnoreCase(student.studentID);
    }

    public boolean equals(String studentID) {
        return this.studentID.equalsIgnoreCase(studentID);
    }

}
