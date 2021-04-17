/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondQ;

import java.util.Scanner;

/**
 *
 * @author S541997
 */
public class TwodArray {
    
    public static boolean equals(int[][] m1, int[][] m2)
    {
        boolean flag=true;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(m1[i][j]!=m2[i][j])
                {
                    flag=false;
                }
            }
        }
        return flag;
    }
    
    public static void main(String[] args) {
        
        int m1[][]=new int[3][3];
        int m2[][]=new int[3][3];
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Answer to 2nd question: Shital Nasam");
        System.out.println("enter first list");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                m1[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("Enter second list");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                m2[i][j]=sc.nextInt();
            }
        }
        
        boolean result=equals(m1,m2);
        if(result==true)
        {
            System.out.println("The two arrays are strictly identical");
        }
        else
        {
            System.out.println("The two arrays are not strictly identical");
        }
                }
}
