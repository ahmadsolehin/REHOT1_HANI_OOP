/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userprofile;

/**
 *
 * @author admin
 */
public class Student {
    private String studentId;
    private int totalCreditHours;
    private double cgpa;
    Person personInfo;

    public Student(Person personInfo , String studentId, int totalCreditHours, double cgpa) {
        this.studentId = studentId;
        this.totalCreditHours = totalCreditHours;
        this.cgpa = cgpa;
        this.personInfo = personInfo;
    }
    
    public void displayStudentInfo(){
        System.out.println("The student Info : ");
        System.out.println("Name : "+personInfo.getName());
        System.out.println("Age : "+personInfo.getAge());
        System.out.println("Gender : "+personInfo.getGender());
        System.out.println("Student id : "+studentId);
        System.out.println("Total credit hours : "+totalCreditHours);
        System.out.println("CGPA : "+cgpa);
    }
}