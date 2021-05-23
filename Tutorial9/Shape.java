/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab9.pkg1;

/**
 *
 * @author Kisyok Indran Veerasamy
 */
public class Shape {
    private String name;
    protected double perimeter, area;

    public Shape(String name){
        this.name=name;
    }
    public double getPerimeter() {
        return perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void display(){
        System.out.printf("name: %s\nperimeter:%.2f\narea:%.2f\n",name,perimeter,area);
    }
}
