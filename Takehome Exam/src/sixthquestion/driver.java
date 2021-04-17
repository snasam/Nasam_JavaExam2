/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sixthquestion;

import java.util.Scanner;

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
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Answer for question 6: Shital Nasam");
        System.out.println("Enter 3 sides");
        int s1=sc.nextInt();
        int s2=sc.nextInt();
        int s3=sc.nextInt();
        System.out.println("enter colour");
        String colour=sc.next();
        System.out.println("whether filled or not");
        boolean b=sc.nextBoolean();
        
        Triangle t= new Triangle(s1,s2,s3,colour,b);
        double area=t.area();
        double perimter=t.perimeter();
        
        System.out.println("sides are: "+s1+","+s2+","+s3+"\n"
        +"colour is: "+colour+"\n"+"whether filled or not:"+b+"\n"+"area is"+area+"\n"+"perimter is"
        +perimter);
        
        
    }
    
}
