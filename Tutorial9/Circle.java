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
public class Circle extends Shape{
    private double diameter;

  public Circle(){
      super("Circle");
    }
  public void input (){
      Scanner s = new Scanner(System.in);
      System.out.println("Diameter: ");
      diameter = s.nextDouble();
  }
    public void compute(){
        perimeter=(Math.PI*diameter);
        area=Math.PI*(diameter/2)*(diameter/2);
    }
}
