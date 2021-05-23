/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("course.dat"));
        out.writeUTF("WXES1116 Programming I\n");
        out.writeUTF("WXES1115 Data Structure\n");
        out.writeUTF("WXES1110 Operating System\n");
        out.writeUTF("WXES1112 Computing Mathematics I\n");
        out.close();
    }catch(IOException e){
            System.out.println("Problem with file output");
    }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Course code; ");
        String courseCode = scanner.nextLine();
        String courseName = "";
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("course.dat"));
            while(true){
            String line = in.readUTF();
            if(line.substring(0,8).equals(courseCode)){
            courseName = line.substring(9);
            break;
            }
            }
            System.out.println("Course Name: " + courseName);
            in.close();
        }catch(FileNotFoundException e){
            System.out.println("File not found");
            
        }catch(IOException e){
            System.out.println("Problem with file output");
        }
    
}
}
