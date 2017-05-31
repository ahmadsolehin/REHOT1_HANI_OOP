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
public class Lecturer {

    private String staffId;
    private int subjectTaught, numofstudent;
    Person personInfo;

    public Lecturer(Person personInfo ,  String staffId, int subjectTaught, int numofstudent) {
        this.staffId = staffId;
        this.subjectTaught = subjectTaught;
        this.numofstudent = numofstudent;
        this.personInfo = personInfo;
    }
    
        
    public void displayLecturerInfo(){
        System.out.println("The lecturer Info : ");
        System.out.println("Name : "+personInfo.getName());
        System.out.println("Age : "+personInfo.getAge());
        System.out.println("Gender : "+personInfo.getGender());
        System.out.println("Staff id : "+staffId);
        System.out.println("Subject taught : "+subjectTaught);
        System.out.println("Total num of student : "+numofstudent);
    }
}
