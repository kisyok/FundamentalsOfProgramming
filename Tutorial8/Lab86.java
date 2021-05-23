/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8.pkg6;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab86 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Burger a = new Burger("AD123", 12);
       Burger b = new Burger("AD124", 13);
       Burger c = new Burger("AD125", 14);
       a.sold(2);
       System.out.println(a);
        System.out.println(b);
        System.out.println(c);
       a.total(); 
    }
    
}
