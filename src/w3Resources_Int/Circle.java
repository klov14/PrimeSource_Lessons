package w3Resources_Int;

import static java.lang.Math.PI;

public class Circle implements Shape {
    private int radius;
    public Circle(int radius){
        this.radius = radius;
    }

    @Override
    public double getArea(){
        return radius*radius*PI;
    }

}
