package Shapes;

import static java.lang.Math.PI;

public class Circle implements Shape {
    public int x;
    public int y;
    public double radius;
    public Circle(int x,int y,double radius){
        this.x=x;
        this.y=y;
        this.radius=radius;
    }
    @Override
    public double area() {
        return circleArea();
    }

    @Override
    public int getx() {
        return this.x;
    }

    @Override
    public int gety() {
        return this.y;
    }

    public double circleArea(){
        return radius*radius*PI;
    }

}
