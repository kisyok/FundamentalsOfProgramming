/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8.pkg7;

import java.text.DecimalFormat;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class money {
    private double money;
    
    public void add(double num1, double num2){
        double sum = num1 + num2;
        System.out.println("The sum is " + sum);
    }
     public void subtraction(double num1, double num2){
        if(num1>num2){
            double diff = num1-num2;
            System.out.println("The difference is " + diff);
        }
        else if(num2>num1){
            double diff = num2-num1;
            System.out.println("The difference is " + diff);
        }
     }
        public void count(double money){
            boolean check = true;
            double total = money;
            int hundred=0, fifty=0, ten=0, five=0,one=0;
            while(check){
                if(total>=100){
                    total = total-100;
                    hundred+=1;
                }
                else if(total>=50){
                    total=total-50;
                    fifty +=1;
                }
                else if(total>=10){
                    total=total-10;
                    ten +=1;
                }
                else if(total>=5){
                    total=total-5;
                    five +=1;
                }
                else if(total>=1){
                    total=total-1;
                    one +=1;
                }
                else{
                   break;
                }
            }
            DecimalFormat df = new DecimalFormat("###.##");
            String str=df.format(total);
            double x=Double.parseDouble(str);
            total=x;

            total = total*100;
            int fiftycent=0, twentycent=0, tencent=0,fivecent=0;
            while(check){
               
                if(total>=50){
                    total=total-50;
                    fiftycent +=1;
                }
                else if(total>=20){
                    total=total-20;
                    twentycent +=1;
                }
                else if(total>=10){
                    total=total-10;
                    tencent +=1;
                }
                else if(total>=5){
                    total=total-5;
                    fivecent +=1;
                }
                
                else{
                   break;
                }
            
            }
            
            
            System.out.println("Hundred Ringgit notes: " + hundred );
            System.out.println("Fifty Ringgit notes: " + fifty );
            System.out.println("Ten Ringgit notes: " + ten );
            System.out.println("Five Ringgit notes: " + five );
            System.out.println("One Ringgit notes: " + one );
            System.out.println("Fifty cents: " + fiftycent );
            System.out.println("Twenty cents: " + twentycent );
            System.out.println("Ten cents: " + tencent );
            System.out.println("Five cent: " + fivecent );
        }
        public void roundoff(double num){
       String str = Double.toString(num);
       int a = Integer.parseInt(str.substring(3));
            if(a==11 || a==12 ){
                a=10;
            }
            else if(a==13 || a==14 || a==16 || a==17 ){
                a=15;
            }
            else if(a==18 || a==19 ){
                a=20;
            }
            System.out.println("After rounding off the value: " + str.substring(0,3)+a);    
        }
    }

        