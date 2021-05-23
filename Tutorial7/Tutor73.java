/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor7.pkg3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Tutor73 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        try{
            String sentence = "Hi, hello";
            PrintWriter p = new PrintWriter(new FileOutputStream("data.txt"));
            
            for(int i=0; i<sentence.length(); i++){
                p.printf("%08d\n", Integer.parseInt(Integer.toBinaryString((int) sentence.charAt(i))));
            }
            p.close();
        }catch(IOException e){
            System.out.println("Problem with file output");
        }
        try{
            Scanner s = new Scanner(new FileInputStream("data.txt"));
            while(s.hasNextLine()){
                System.out.print((char) Integer.parseInt("" + Integer.parseInt(s.nextLine()),2));
            }
            s.close();
        }catch (FileNotFoundException e){
            System.out.println("file not found");
        }
        
        
//        String str = "Sample Sentence";
//        byte[] a = str.getBytes();
//        
//        try{
//            PrintWriter p = new PrintWriter(new FileOutputStream("data.txt"));
//            int temp=0;
//            for(int i=0; i<a.length; i++){
//                temp = a[i];
//            }
//            for(int j=0; j<8; j++){
//                if((temp&120)==0){
//                    p.print(0);
//                }
//                else{
//                    p.print(1);
//                }
//                temp = temp<<1;
//            }
//        
//        p.close();
//    }catch(IOException e){
//        System.out.println("Problem with file output");
//    }
       
}
}