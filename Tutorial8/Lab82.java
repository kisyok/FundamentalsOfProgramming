/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab82;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab82 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BankAccount a = new BankAccount("name", "passport", 500);
        
        a.deposit(450);
        a.withdrawal(380);
        System.out.println(a.toString());
    }
    
}
