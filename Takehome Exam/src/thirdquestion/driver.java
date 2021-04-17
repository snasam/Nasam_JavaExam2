/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thirdquestion;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author S541997
 */
public class driver {

    /**
     * @param args the command line arguments
     */
  
        public static void main(String[] args) {
        
        ArrayList<Object> a = new ArrayList<Object>();
        Loan l= new Loan(1,"US",12.5);
        Circle c1 = new Circle(2.5,30.6);
    Date date=new Date();
    a.add(l);
    a.add(c1);
    a.add(date.toString());
    System.out.println("answer to question 3:Shital Nasam");
    for(int i=0;i<a.size();i++)
    {
        System.out.println(a.get(i).toString());
    }
    }
    }

    
    

