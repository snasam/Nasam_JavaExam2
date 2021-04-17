/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fourthquestion;

/**
 *
 * @author S541997
 */
public class ElcDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer to fourth question:Shital Nasam");
        ElectronicDevice ec= new Mobile("AXP",100,600,"nokia");
        System.out.println(ec);
        System.out.println(ec);
       System.out.println("the cost is");
        System.out.println(ec.caluCost());
        
         
    }
    
}
