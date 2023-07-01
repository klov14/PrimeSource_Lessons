package w3Resources_Int;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(4));
        shapes.add(new Rectangle(3,5));
        for (Shape s :shapes) {
            System.out.println(s.getArea());
        }
    }
}
