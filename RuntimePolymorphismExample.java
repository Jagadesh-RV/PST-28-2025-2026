
class Shape {
    void area() {
        System.out.println("Area method in Shape class");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    @Override
    void area() {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + result);
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    
    @Override
    void area() {
        double result = length * breadth;
        System.out.println("Area of Rectangle = " + result);
    }
}


public class RuntimePolymorphismExample {
    public static void main(String[] args) {

        Shape s;

        s = new Circle(5);
        s.area();  

       
        s = new Rectangle(4, 6);
        s.area();   
    }
}
