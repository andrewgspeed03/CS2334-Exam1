
public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
        calculateArea();
    }

    @Override
    public void calculateArea() {
        double area = 0.5 * base * height;
        addToSurfaceArea(area);
    }
}