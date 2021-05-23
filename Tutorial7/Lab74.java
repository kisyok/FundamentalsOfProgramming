/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.pkg4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab74 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            Scanner s = new Scanner(new FileInputStream("Q4.txt"));
            int numChar = 0;
            int numWord = 0;
            int numLine = 0;
            while(s.hasNextLine()){
                numLine++;
                String line = s.nextLine();
                numChar += line.length();
                numWord += line.split(" ").length;
            }
            System.out.println("Number of characters: " + numChar);
            System.out.println("Num of line: " + numLine);
            System.out.println("Number of words: " + numWord);
            }catch(FileNotFoundException e){
                    System.out.println("File not found");
                    }
        }
    }
    

