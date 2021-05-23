/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.pkg6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab76 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("ProductID" + "\tProductName" + "\t\tQuantity" + "\tPricePerUnit" + "\tTotal");
        try{
      
       Scanner order = new Scanner (new FileInputStream("order.txt"));
       Scanner product = new Scanner (new FileInputStream("product.txt"));
       
       while(order.hasNextLine()){
           String orderLine = order.nextLine();
           String[] orderColumns = orderLine.split(",");
           String productID = orderColumns[1];
           int quantity = Integer.parseInt(orderColumns[2]);
           
       product = new Scanner (new FileInputStream("product.txt"));
       while(product.hasNextLine()){
           String productLine = product.nextLine();
           String productColumns[] = productLine.split(",");
           String productID1 = productColumns[0];
           String productname = productColumns[1];
           double productprice = Double.parseDouble(productColumns[2]);
           
       
       double total;
       if(productID.equals(productID1)){
           total = quantity*productprice;
           System.out.printf( "%s\t\t%s\t\t%d\t\t%.2f\t\t%.2f\n", productID, productname, quantity, productprice, total);
           
       }
       }
       }
       
       order.close();
       product.close();
        }catch(FileNotFoundException e){
        System.out.println("File not found");
}
    }
}
    

