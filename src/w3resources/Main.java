package w3resources;

public class Main {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(3.2,4.5,7.3);
        System.out.println(triangle1.getArea());
        System.out.println(triangle1.getPerimeter());

        Circle circle1 = new Circle(4.5);
        System.out.println(circle1.getArea());
        System.out.println(circle1.getPerimeter());
    }
}
