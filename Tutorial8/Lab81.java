/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab81;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab81 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Number a = new Number();
        a.displayPrime();
        a.displayEven();
        a.displayMaximum();
        a.displayMinimum();
        a.displayAverage();
        a.displaySquare();
        System.out.println("");
        
        Number b = new Number(5);
        b.displayPrime();
        b.displayEven();
        b.displayMaximum();
        b.displayMinimum();
        b.displayAverage();
        b.displaySquare();
        System.out.println("");
    
        Number c = new Number(4,50);
        c.displayPrime();
        c.displayEven();
        c.displayMaximum();
        c.displayMinimum();
        c.displayAverage();
        c.displaySquare();
}
}
