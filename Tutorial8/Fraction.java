/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8.pkg4;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Fraction {
    private int numerator, denominator;
    
    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }
    public int simplifiedFraction(int numerator, int denominator){
       int a = this.numerator;
       int b = this.denominator;
        
        int tmp = a;
        a = Math.max(a,b);
        b = Math.min(tmp,b);
    
        //write GCD
        int remainder;
    do{
        remainder = a%b;
        a = b;
        b = remainder;
    } while(remainder !=0);
     return a;
    }    

 
    public String toString() {
//        int a = simplifiedFraction(numerator, denominator);
        return "Fraction = " + numerator/simplifiedFraction(numerator, denominator) + "/" + denominator/simplifiedFraction(numerator, denominator);
    }
        
   
    
}
