/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sixthquestion;

/**
 *
 * @author S541997
 */
public class Triangle extends GeometricObject{
    
    private int s1;
    private int s2;
    private int s3;
    private String color;
    private boolean triangleFilled;

    public Triangle(int s1, int s2, int s3, String color, boolean triangleFilled) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.color = color;
        this.triangleFilled = triangleFilled;
    }

    @Override
    public double area() {
        return s1*s2*s3;
    }

    @Override
    public double perimeter() {
       return s1+s2+s3;
    }
    
}
