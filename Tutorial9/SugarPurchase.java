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
public class SugarPurchase extends PurchaseSystem{
    private double weight;
    
    
    public SugarPurchase(double a, int b, int c){
        code = "sugar1234";
        unitprice = a;
        quantity = b;
        weight = c;
    }
    @Override
    public void getTotalPrice(){
         totalprice = unitprice*quantity*weight; 
    }
}
