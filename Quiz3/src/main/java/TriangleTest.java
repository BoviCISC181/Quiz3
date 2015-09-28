import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

	@Test
	public void test() {
		Triangle tri = new Triangle(2,4,5);
		
		assertEquals(true, tri.getArea()==3.799671038392666);
		assertEquals(true, tri.getPerimeter()==11);
		System.out.println(tri.toString());
	}

}
