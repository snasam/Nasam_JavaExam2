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
public class Employee extends Person {
    private String office;
    private double salary;
    private int dateHired;

   

    public Employee(String office, double salary, int dateHired, String name, String phno, String email,String address) {
        super(name, phno, email,address);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
        
    }

    @Override
    public String toString() {
        return "Employee{"+super.getName() + "office=" + office + ", salary=" + salary + ", dateHired=" + dateHired + '}';
    }

    
    
    
    
}
