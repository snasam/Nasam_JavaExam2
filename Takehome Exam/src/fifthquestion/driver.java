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
public class driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Answer for 5th question:Shital Nasam");
        Person per=new Person("John","6604322","abc@gmail.com","Maryville");
        Student stu=new Student("A","John","6604322","abc@gmail.com","Maryville");
        Employee emp= new Employee("acs",500,12,"John","6604322","abc@gmail.com","Maryville");
        Faculty fac=new Faculty(3,"adb","acs",500,12,"John","6604322","abc@gmail.com","Maryville");
        Staff sta=new Staff("Assistant professor","acs",500,12,"John","6604322","abc@gmail.com","Maryville");
        
        System.out.println(per);
        System.out.println(stu);
        System.out.println(emp);
        System.out.println(fac);
        System.out.println(sta);
                
    }
    
}
