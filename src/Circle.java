
public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
        calculateArea();
    }

    @Override
    public void calculateArea() {
        double area = Math.PI * radius * radius;
        addToSurfaceArea(area);
    }
}