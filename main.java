/*Design an abstract class Shape having 2 methods calculateArea() and display(). Create 
Rectangle and Triangle classes by inheriting the Shape class and override above methods to 
suitably implement for Rectangle and Triangle class.*/
package basicjava_pac.java_prac_quasction;

abstract class Shape {
    abstract void calculateArea();

    abstract void display();
}

class Rectangle extends Shape {
    int length = 5;
    int width = 3;
    int result = 0;

    public void calculateArea() {
        result = length * width;
    }

    public void display() {
        System.out.println("Area of rectangle is : " + result);
    }
}

class Triangle extends Shape {
    int base = 20;
    int height = 13;
    int result = 0;

    public void calculateArea() {
        result = (base * height) / 2;
    }

    public void display() {
        System.out.println("Area of triangle is : " + result);
    }
}

public class main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.calculateArea();
        r.display();
        Triangle t = new Triangle();
        t.calculateArea();
        t.display();
    }
}
