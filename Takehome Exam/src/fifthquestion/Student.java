/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fifthquestion;

/**
 *
 * @author S541997
 */
public class Student extends Person {
    
    private String grade;
    private static final String classStatus="Graduate";

    public Student(String grade, String name, String phno, String email,String address) {
        super(name, phno, email,address);
        this.grade = grade;
        
    }

        @Override
    public String toString() {
        return "Student"+super.getName()+ "grade=" + grade + ", classStatus=" + classStatus;
    }
    
    
    
}
