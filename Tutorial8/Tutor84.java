/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor8.pkg4;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Tutor84 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Payment a = new Payment(12.56);
        System.out.println(a);
        Payment b = new Payment(12.56, "123456");
        Payment c = new Payment(12.56, "1234123412341234", "Visa", "12/19", "245");
       
        
    }
    
}
