/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor9.pkg4;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class PaySystem {
    protected double payrate;
    protected int numofhours;
    
    public double getTotalPay(){
        return payrate*numofhours;
    }
    public String toString(){
        return "Total: " + getTotalPay();
    }
    
    
    
}
