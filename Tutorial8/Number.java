/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab81;

import java.util.Random;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Number {
    private int[] num;
    private Random r = new Random();
    

public Number(){
    num = new int[10];
    for(int i=0; i<num.length; i++){
        num[i] = r.nextInt(101);
        System.out.print(num[i] + " ");
    } 
    System.out.println();
    
}
public Number(int size){
    num = new int[size];
    for(int i=0; i<num.length; i++){
        num[i] = r.nextInt(101);
        System.out.print(num[i] + " ");
    }
    System.out.println();
}
public Number(int size,int max){
    num = new int[size];
    for(int i=0; i<num.length; i++){
        num[i] = r.nextInt(max+1);
        System.out.print(num[i] + " ");
}
    System.out.println();
}   
//preferred method
//public void displayPrime(){
//        boolean check = true;
//        String str = "";
//        for(int i=0; i<num.length; i++){
//            for(int j=2; j<=num[i]/2; j++){
//                if(num[i]%j==0){
//                    check=false;
//                }
//            }
//            if(check==true){
//            str = str + num[i] + " ";
//        }
//        }
//        System.out.println("Prime: " + str);
//    }
public void displayEven() {
        String str = "";
        for(int i=0; i<num.length; i++) {
            
            if (num[i]%2==0) {
                str = str + num[i] + " ";
            }
             
         
    }
        System.out.println("The even numbers are " + str);
}
        
public void displayPrime(){
    String str = "";
    int prime=0;
     for(int i=0; i<num.length; i++) {
     if(isPrime(num[i])){
            prime = num[i];
        }
     str = str + prime + " ";
}      
        System.out.println("Prime: " + prime);
}
public boolean isPrime(int num){
    
    boolean test=true;
        for (int j = 2; j <=num/2; j++){
            if (num % j == 0){
            test = false;
        }
        }

  return test; 
}

   public void displayMaximum(){
   String str = "";
   int max = 0;
        for(int i=0; i<num.length; i++) {
            
            if (num[i]>max) {
                max = num[i];
                
            }
        }   str = str + max + " ";     
        System.out.println("Maximum: " + str);   
    }
   public void displayMinimum(){
   String str = "";
   int min = 99999;
        for(int i=0; i<num.length; i++) {
            if (num[i]<min) {
                min = num[i];
            }
        }        
        str = str + min + " ";
        System.out.println("Minimum: " + str); 
    }
public void displayAverage(){
   String str = "";
   int sum = 0;
        for(int i=0; i<num.length; i++) {
            
            sum+=num[i];  
        }
        int average = sum/(num.length);
        str = str + average + " ";   
        System.out.println("Average: " + str);   
    }   
   public void displaySquare(){
   String str = "";
        for(int i=0; i<num.length; i++) {
            int square=num[i]*num[i];
            str = str + square + " ";
        }        
        System.out.println("Square: " + str); 
    } 
    
}


