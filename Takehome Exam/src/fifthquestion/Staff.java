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
public class Staff extends Employee{
    
    private String title;

    public Staff(String title, String office, double salary, int dateHired, String name, String phno, String email,String address) {
        super(office, salary, dateHired, name, phno, email,address);
        this.title = title;
    }

    

    @Override
    public String toString() {
        return "Staff{"+super.getName()+ "title=" + title + '}';
    }
    
    
    
}
