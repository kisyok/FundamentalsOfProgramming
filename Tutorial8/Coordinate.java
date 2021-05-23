/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutor8.pkg3;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Coordinate {
   private int x, y;
        public Coordinate(){
        int x= 0;
        int y = 0;
        }
        public Coordinate(int a, int b){
        x = a; 
        y = b;
        }
        public void setX(int a){
        x=a;
        }
        public void setY(int b){
        y=b;
        }
        public int getX(){
        return x;
        }
         public int getY(){
        return y;
        }
        public String toString(){
        return "x : " + x + " " + "y : " + y;
        }
        }  

