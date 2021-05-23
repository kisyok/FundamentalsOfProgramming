/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor7.pkg1b;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Tutor71b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            Scanner read = new Scanner(new FileInputStream("E:\\COURSES\\FUNDAMENTALS OF PROGRAMMING\\TUTORIAL7\\lab\\tutor7-1\\integer.txt"));
            int largest = 0;
            while(read.hasNextInt()){
                int input = read.nextInt();
            System.out.print(input + " ");
            if(input>largest){
                largest=input;
              }
            }
                System.out.println("\nThe largest integer is "+largest);
            read.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found");
    }
    
}
}