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
public class Faculty extends Employee{
    private double officeHours;
    private String subject;

    public Faculty(double officeHours, String subject, String office, double salary, int dateHired, String name, String phno, String email,String address) {
        super(office, salary, dateHired, name, phno, email,address);
        this.officeHours = officeHours;
        this.subject = subject;
    }

    

    @Override
    public String toString() {
        return "Faculty{"+super.getName() + "officeHours=" + officeHours + ", subject=" + subject + '}';
    }
    
    
    
}
