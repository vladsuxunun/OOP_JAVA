package Interface;

public class Main{
    public static void main(String[] args) {
        Circle c = new Circle(5);
        c.draw();
        System.out.println("CIRCLE'S AREA : "+c.getArea());
        System.out.println("CIRCLE'S PERIMETER : "+c.getPerimeter());
    }
}