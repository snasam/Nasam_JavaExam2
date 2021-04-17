/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ninthquestion;

/**
 *
 * @author S541997
 */
public class Student implements Course {

    @Override
    public String getCourse(String course) {
       return "Course enrolled for student is " + course;
    }
    
    public static void main(String[] args) {
    Student stu = new Student();
       System.out.println("Answer to ninth question:Shital Nasam");
       System.out.println(stu.getCourse("Java"));
  }
}
