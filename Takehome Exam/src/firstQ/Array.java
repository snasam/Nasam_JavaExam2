/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstQ;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author S541997
 */
public class Array{
    
    public static void removeDuplicate(ArrayList<Integer> list) {
        ArrayList<Integer> array = new ArrayList<>();
        for(int number : list) {
            if (!array.contains(number)) {
                array.add(number);
            }
        }
        String output = "The distinct integers are";
        for(int n : array) {
            output = output + " " + n;
        }
        System.out.println(output);
    }

 
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Answer to 1stquestion:Shital Nasam");
        System.out.print("Enter 10 integers: ");
        ArrayList<Integer> newList = new ArrayList<>();
        for(int i=0; i < 10; i++) {
            newList.add(sc.nextInt());
        }
        removeDuplicate(newList);
    }
    
    
}
