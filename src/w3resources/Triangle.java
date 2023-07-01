package w3resources;

import static java.lang.Math.sqrt;

public class Triangle extends Shape{
    private double side1;
    private double side3;
    private double side2;
    public Triangle(double side1, double side2, double side3) {//конструктор
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }

    @Override
    public double getArea() {
    double s = (side1+side2+side3);
    return sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }
    @Override
    public double getPerimeter(){
        return side1+side2+side3;
    }
}
