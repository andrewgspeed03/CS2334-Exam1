import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class ShapeTests {

	@Test
	public void combinedTest() {
		double previousArea = Shape.getSurfaceArea();
		double previousVolume = Shape.getVolume();
		
		ArrayList<Shape> shapes = new ArrayList<Shape>();

		shapes.add(new Circle(5));
		shapes.add(new Cone(7,7));
		shapes.add(new Cuboid(5,8,10));
		shapes.add(new Rectangle(5,6));
		shapes.add(new Sphere(6));
		shapes.add(new Square(12));	
		shapes.add(new Triangle(10,20));

		assertEquals(Math.round(1516.5684624523349 + previousArea),Math.round(Shape.getSurfaceArea()));
		assertEquals(Math.round(1663.9674442942933 + previousVolume),Math.round(Shape.getVolume()));
	}
	
	@Test
	public void testSquare() {
		double previousArea = Shape.getSurfaceArea();
		double previousVolume = Shape.getVolume();
		
		Square square = new Square(5);
		
		assertEquals(Math.round(25.0 + previousArea),Math.round(Shape.getSurfaceArea()));
		assertEquals(Math.round(previousVolume),Math.round(Shape.getVolume()));
	}

	@Test
	public void testCone() {
		double previousArea = Shape.getSurfaceArea();
		double previousVolume = Shape.getVolume();
		
		Cone cone = new Cone(6,9);
		
		assertEquals(Math.round(316.9864567137342 + previousArea),Math.round(Shape.getSurfaceArea()));
		assertEquals(Math.round(339.29200658769764 + previousVolume),Math.round(Shape.getVolume()));		
	}
	
	@Test
	public void testCuboid() {
		double previousArea = Shape.getSurfaceArea();
		double previousVolume = Shape.getVolume();
		
		Cuboid cuboid = new Cuboid(9,5,9);
		
		assertEquals(Math.round(342.0 + previousArea),Math.round(Shape.getSurfaceArea()));
		assertEquals(Math.round(405.0 + previousVolume),Math.round(Shape.getVolume()));		
	}
	
}
