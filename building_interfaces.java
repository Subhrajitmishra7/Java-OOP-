/*Write a program to create an interface in java named figure. 
Define method calculate area and variable pi and assign some value.
Create another interface Polygon, where area is undefined.
Create a class, circle, which will implement both the methods of interfaces, polygon and figure.
And calculate the area of circle. */

interface Figure {
    double calcArea();
    double pi = 3.14159;
}

interface Polygon {
    void area();
}

class circle implements Figure, Polygon {
    double radius;
    
    circle(double r) {
        radius = r;
    }
    
    public double calcArea() {
        return pi * radius * radius;
    }
    
    public void area() {
        System.out.println("The area of the circle is: " + calcArea());
    }
}

public class building_interfaces {
    public static void main(String[] args) {
        circle c = new circle(5);
        c.area();
    }
}