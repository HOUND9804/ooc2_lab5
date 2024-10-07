package Shapes;

public class Square implements Shape {
    public int x;
    public int y;
    public double side;
    public Square(int x,int y,double side){
        this.x=x;
        this.y=y;
        this.side=side;
    }
    @Override
    public double area() {
        return squareArea();
    }

    @Override
    public int getx() {
        return this.x;
    }

    @Override
    public int gety() {
        return this.y;
    }
    public double squareArea(){
        return side*side;
    }

}