public class Triangle extends Shape{
    private double side1;
    private double side2;
    private double side0;
    //side3 at heart


    public Triangle(double side0, double side1, double side2){
        this.side0=side0;
        this.side1=side1;
        this.side2=side2;
    }
    @Override
    public double getArea(){
        double s = this.getPerimeter()/2;
        double t = s*(s-side0)*(s-side1)*(s-side2);
        return Math.sqrt(t);
    }
    @Override
    public double getPerimeter(){
        return side0+side1+side2;
    }
}
