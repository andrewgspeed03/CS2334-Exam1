
public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        calculateArea();
    }

    @Override
    public void calculateArea() {
        double area = length * width;
        addToSurfaceArea(area);
    }
}
