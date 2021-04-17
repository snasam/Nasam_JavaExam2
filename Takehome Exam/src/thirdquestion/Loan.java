/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thirdquestion;

import java.util.ArrayList;

/**
 *
 * @author S541997
 */
public class Loan {
    
    private int id;
    private String bank;
    private double interest;

    public Loan(int id, String bank, double interest) {
        this.id = id;
        this.bank = bank;
        this.interest = interest;
    }

    @Override
    public String toString() {
        return "Loan{" + "id=" + id + ", bank=" + bank + ", interest=" + interest + '}';
    }
    
}
   
        
        
    
    
    
