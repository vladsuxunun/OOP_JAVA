package lab5_1a;
public class Square extends Shape{
    double width;
    public Square(){
        this.width = width;
    }
    public Square(double width){
        this.width = width;
    }
    public double getArea(){
        return width*width;
    }
    public double getPerimeter(){
        return 4*width;
    }
    
    public void printArea(){
        System.out.println("SQUARE AREA IS : "+getArea());
    }
    
    public void printPerimeter(){
        System.out.println("SQUARE PERIMETER IS : "+getPerimeter());
    }
}