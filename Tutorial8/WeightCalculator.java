/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8.pkg3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class WeightCalculator {
    private int age; 
    private double height;
    private double recommendedWeight;

    public WeightCalculator(int age, double height){
        this.age= age;
        this.height=height;
}
    public double recommendedWeight(){ 
        return ((this.height-100)+(this.age/10))*0.9;
    }

    public String toString() {
//        String recommendedWeight;
        return "age: " + age +"\n" + "height: " + height +"\n"+ "recommendede weight: " + recommendedWeight();
    }
    
}
