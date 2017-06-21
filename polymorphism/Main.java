package polymorphism;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        
         ArrayList<Shape>shapes = new ArrayList<Shape>();
        
        shapes.add(new Circle(5));
        shapes.add(new Triangle(5,5,5));
        shapes.add(new Rectangle(5,5));

        for (Shape s: shapes) {
            System.out.println(s.findArea());
        }
    }
}
