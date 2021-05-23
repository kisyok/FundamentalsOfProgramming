/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor9.pkg3;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class PurchaseSystem {
    protected String code;
    protected double unitprice, totalprice;
    protected int quantity;
    
    public void getTotalPrice(){
        totalprice = quantity*unitprice;
    }

    @Override
    public String toString() {
        return "code: " + code + "\nunitprice: " + unitprice + "\nQuantity: " + quantity + "\nTotal Price: " + totalprice ;
    }
    
}
