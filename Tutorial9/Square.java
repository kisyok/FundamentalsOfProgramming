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
public class Square extends Shape {
    private double length;
    public Square(){
        super("Square");
    }

public void input() {
    Scanner s = new Scanner(System.in);
    System.out.println("Length: ");
    length = s.nextDouble();
    }
public void compute(){
        perimeter=(4*length);
        area = (length*length);
    }
}
