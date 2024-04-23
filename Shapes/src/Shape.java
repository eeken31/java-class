import java.lang.Math;
public abstract class Shape {
    private String colour;

    public abstract double getArea();


    public abstract double getPerimeter();

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }
}
