/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eightquestpion;

/**
 *
 * @author S541997
 */
public class Rose extends Flower {

    @Override
    public void colour() {
        System.out.println("The colour is red");
    }
    
    public static void main(String args[]){
    Flower f= new Rose();
    System.out.println("Answer to eight question: Shital Nasam");
    f.colour();
    
    }
   
    
    
}
