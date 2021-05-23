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
public class SpecialPay extends PaySystem{
    public SpecialPay(double a, int b){
        payrate = a;
        numofhours=b;
    }
    @Override
    public double getTotalPay(){
        return payrate*numofhours*1.3;
    }
}
