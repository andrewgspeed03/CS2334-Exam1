
public class Shape {
    private static double surfaceArea = 0;
    private static double volume = 0;

    public void calculateArea() {
        // Default implementation for 2D/3D shapes
    }

    public void calculateVolume() {
        // Default implementation for 3D shapes
    }

    public static double getSurfaceArea() {
        return surfaceArea;
    }

    public static double getVolume() {
        return volume;
    }

    public static void addToSurfaceArea(double area) {
        surfaceArea += area;
    }

    public static void addToVolume(double vol) {
        volume += vol;
    }
}
