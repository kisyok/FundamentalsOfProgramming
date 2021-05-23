/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor9.pkg2;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Animal extends Organism{
    private int eatingNeed;

    public Animal(int a, double b, int c) {
        super(a, b);
        this.eatingNeed = c;
    }

    
    public String toString() {
        return "Size: " + size + "\n" + "Growth Rate: " + growthRate + "\n" + "Amount of eating need: " + eatingNeed ; 
    
    }
}
