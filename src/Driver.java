import java.util.ArrayList;

public class Driver {
	public static void main(String[] args) {
		
		Cuboid cuboid = new Cuboid(9,5,9);
		
		System.out.println("Total shapes area: " + Shape.getSurfaceArea());
		System.out.println("Total shapes volume: " + Shape.getVolume());
	}
}
