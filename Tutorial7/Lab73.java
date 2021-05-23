/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.pkg3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab73 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //preferred method
         try{
        PrintWriter p = new PrintWriter(new FileOutputStream("reverse.txt"));
        Scanner s = new Scanner(new FileInputStream("exam.txt"));
        while(s.hasNextLine()){
            String line = s.nextLine();
            StringBuilder sb = new StringBuilder();
            sb.append(line);
            sb.reverse();
            String reversed = sb.toString();
            p.print(reversed + "\n");
        }
        s.close();
        p.close();
    }catch(FileNotFoundException e){
            System.out.println("File not found");
//    }
//        try{
//        PrintWriter p = new PrintWriter(new FileOutputStream("reverse.txt"));
//        Scanner s = new Scanner(new FileInputStream("exam.txt"));
//        int line = 0;
//        while(s.hasNextLine()){
//            s.nextLine();
//            line++;
//        }
//        
//        String[] str1 = new String[line];
//        s = new Scanner(new FileInputStream("exam.txt"));
//        for(int i=0; i<line; i++){
//            str1[i] = s.nextLine(); 
//        }
//        for(int i = line-1; i>=0; i--){
//            for(int j= str1[i].length()-1; j>=0; j--){
//                p.print(str1[i].charAt(j));
//            }
//            p.println();
//        }
//        s.close();
//        p.close();
//    }catch(FileNotFoundException e){
//            System.out.println("File not found");
//    }
    }
}
}
