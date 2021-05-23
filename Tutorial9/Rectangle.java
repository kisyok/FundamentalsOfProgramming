/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9.pkg1;

import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Rectangle extends Shape {
    private double length, width;
    public Rectangle(){
        super("Rectangle");
    }
    public void input(){
        Scanner s = new Scanner(System.in);
        System.out.println("Width: ");
        width = s.nextDouble();
        System.out.println("Length: ");
        length = s.nextDouble();
    }
    public void compute(){
        perimeter =  (2*length)+(2*width);
        area = (width*length);
    }
    
}
