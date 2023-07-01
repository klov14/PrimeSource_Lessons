package w3resources;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {//конструктор
        this.radius=radius;
    }
    @Override
    public double getArea(){
        return pow(radius,2)*PI;
    }
    @Override
    public double getPerimeter(){
        return radius*PI;
    }


}
