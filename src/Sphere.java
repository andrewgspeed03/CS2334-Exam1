
public class Sphere extends Shape {
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
        calculateArea();
        calculateVolume();
    }

    @Override
    public void calculateArea() {
        double area = 4 * Math.PI * radius * radius;
        addToSurfaceArea(area);
    }

    @Override
    public void calculateVolume() {
        double vol = 4 * Math.PI * radius * radius * radius / 3;
        addToVolume(vol);
    }
}