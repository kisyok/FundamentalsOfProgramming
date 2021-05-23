/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor8.pkg5;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Connection {
    private static int numofconnection = 0;
        
        public Connection(){
        numofconnection++;
        }
        public void disconnect(){
        numofconnection--;
        }
        public String toString(){
        return "Number of connection : " + numofconnection;
        }
        }

