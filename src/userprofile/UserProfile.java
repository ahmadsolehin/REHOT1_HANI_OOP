/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userprofile;

import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class UserProfile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String name, gender, strAge;
        int age;

//Declare other variables in here
        String status, studentid, credit, cgpa;
        int totalcredit;
        double totalcgpa;

        String staffid;
        int subjecttaught, numofstudent;

        try {

            name = JOptionPane.showInputDialog(null, "What is your name?");
            strAge = JOptionPane.showInputDialog(null, "How old are you?");
            age = Integer.parseInt(strAge);
            gender = JOptionPane.showInputDialog(null, "What is your gender?");

            status = JOptionPane.showInputDialog(null, "Student or Lecturer? type st for student / lec for lecturer");

            Person person = new Person(name, gender, age);

            if (status.equals("st")) {

                studentid = JOptionPane.showInputDialog(null, "What is your student id?");
                credit = JOptionPane.showInputDialog(null, "Total credit hours ?");
                totalcredit = Integer.parseInt(credit);
                cgpa = JOptionPane.showInputDialog(null, "What is your cgpa?");
                totalcgpa = Double.parseDouble(cgpa);
                Student student = new Student(person, studentid, totalcredit, totalcgpa);
                student.displayStudentInfo();

            } else if (status.equals("lec")) {

                staffid = JOptionPane.showInputDialog(null, "What is your staff id?");
                subjecttaught = Integer.parseInt(JOptionPane.showInputDialog("Subject taught : "));
                numofstudent = Integer.parseInt(JOptionPane.showInputDialog("Num of student : "));

                Lecturer lec = new Lecturer(person, staffid, subjecttaught, numofstudent);
                lec.displayLecturerInfo();
            }

        } catch (Exception e) {
            System.out.println("Error : " + e.getMessage());

        }

    }

}
