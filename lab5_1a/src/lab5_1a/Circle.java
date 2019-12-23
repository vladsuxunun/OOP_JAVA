package lab5_1a;

public class Circle extends Shape{
    double radius;

    public Circle(){
        this.radius = 0;
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return 3.14*radius*radius;
    }
    public double getPerimeter(){
        return 2*3.14*radius;
    }
    
    public void printArea(){
        System.out.println("CIRCLE AREA IS : "+getArea());
    }
    
    public void printPerimeter(){
        System.out.println("CIRCLE PERIMETER IS : "+getPerimeter());
    }
}