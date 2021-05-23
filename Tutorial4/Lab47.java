/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4.pkg7;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab47 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double p = 10000;
        double i = 4;
        int N = 12;
        double sum=0;
        System.out.println("Enter principal amount: " + p);
        System.out.println("Enter interest in %: " + i);  
        System.out.println("Enter total number of month(n): " + N);
        
        System.out.println("Month\t\tMonthly Payment\t\tPrincipal\tInterest\tUnpaid Balance\t\tTotal Interest");
        for (int n=1; n<=N; n++){
            double M = (p*i/12/100)/(1-Math.pow(1+i/12/100, -N));
            double C = M * Math.pow(1+i/12/100, -(1+N-n));
            double L = M-C;
            sum+=L;
            double R = L/((i/12/100)) - C;
            System.out.printf("%d\t\t\t%.2f\t\t%.2f\t\t%.2f\t\t\t%.2f\t\t\t%.2f\n",n,M,C,L,R,sum);
            
            }
          
        }
}
        
   
    
    
