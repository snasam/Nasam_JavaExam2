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
public class Person {

    private String name;
    private String phno;
    private String email;
private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Person(String name, String phno, String email,String address) {
        this.name = name;
        this.phno = phno;
        this.email = email;
        this.address=address;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", phno=" + phno + ", email=" + email +"address"+address;
    }

    
    
    

}
