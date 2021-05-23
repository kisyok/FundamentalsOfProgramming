/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9.pkg1;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab91 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangle a = new Rectangle();
        a.input();
        a.compute();
        a.display();
        
        Square b = new Square();
        b.input();
        b.compute();
        b.display();
        
        Circle c = new Circle();
        c.input();
        c.compute();
        c.display();
    }
    
}
