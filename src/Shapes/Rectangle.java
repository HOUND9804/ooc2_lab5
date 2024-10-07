package Shapes;

public class Rectangle implements Shape {
    public int x;
    public int y;
    public double width;
    public double height;
    public Rectangle(int x,int y,double width,double height){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
    }

    @Override
    public double area() {
        return retangleArea();
    }

    private double retangleArea() {
        return width*height;
    }

    @Override
    public int getx() {
        return this.x;
    }

    @Override
    public int gety() {
       return this.y;
    }
}
