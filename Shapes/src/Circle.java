import java.lang.Math;
public class Circle extends Shape{
    private double radius;
    private final double PI = 3.14;



    public Circle(double radius){
        this.radius=radius;
    }
    @Override
    public double getArea(){
        return PI*Math.pow(radius,2);
    }
    @Override
    public double getPerimeter(){
        return 2*PI*radius;
    }
}
