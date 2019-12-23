package Interface;

public class Circle implements Shape,Graphics{
	double radius;
    public Circle(){
        this.radius = 0;
    }
    public Circle(double radius){
        this.radius = radius;
    }
    public void draw(){
        System.out.println("I am drawing Circle");
    }
    public double getArea(){
        return 3.14*radius*radius;
    }
    public double getPerimeter(){
        return 2*3.14*radius;
    }
}