/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.pkg2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Lab72 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         try{
            URL u = new URL("http://www.fsktm.um.edu.my");
            URLConnection cnn = u.openConnection();
            InputStream stream = cnn.getInputStream();
            Scanner in = new Scanner(stream); 
            PrintWriter p = new PrintWriter(new FileOutputStream("index.html"));
            while(in.hasNextLine()){
                String line = in.nextLine() + "\n";
                p.write(line);
            }
            p.close();
            in.close();
            }catch(IOException e){
            System.out.println("IO Error " + e.getMessage());
        }
    }
    
}
