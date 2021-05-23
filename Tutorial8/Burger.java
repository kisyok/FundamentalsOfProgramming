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
public class Burger {
    private String Id;
    private int numOfBurgerSold;
    public static int totalnumOfBurgerSold=0;
    

    public Burger(String Id, int numOfBurgerSold) {
        this.Id = Id;
        this.numOfBurgerSold = numOfBurgerSold;
        this.totalnumOfBurgerSold+=numOfBurgerSold;
    }
    
    public int sold(int s){
        this.totalnumOfBurgerSold += s;
        return this.totalnumOfBurgerSold;
    }
    
//    public void 
    public void total(){
        System.out.println("Total number of burger sold " + this.totalnumOfBurgerSold);
    }

    @Override
    public String toString() {
        return "Id: " + Id + "\n" + "Nummber of burger sold: " + numOfBurgerSold;
    }
    
    
}
