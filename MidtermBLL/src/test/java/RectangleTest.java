import static org.junit.Assert.*;

import org.junit.Test;

import pkgCode.Rectangle;

public class RectangleTest {

	@Test
	public void getiWidthTest() {
		int expectedWidth=9;
		
		Rectangle r1 = new Rectangle(9, 2);
		assertEquals(expectedWidth,r1.getiWidth());
	}
	@Test
	public void getiLengthTest() {
		int expectedLength=2;
		
		Rectangle r1 = new Rectangle(9, 2);
		assertEquals(expectedLength,r1.getiLength());

}
	
	@Test
	public void setiWidthTest() {
		int expectedWidth=10;
		Rectangle r2 = new Rectangle(8,2);
		r2.setiWidth(10);
		assertEquals(expectedWidth, r2.getiWidth());
		
	}
	@Test
	public void setiLengthTest() {
		int expectedLength=10;
		Rectangle r2 = new Rectangle(2,8);
		r2.setiLength(10);
		assertEquals(expectedLength, r2.getiLength());
		
	}
	
	@SuppressWarnings("deprecation")
	@Test 
	public void areaTest() {
		Rectangle r3 = new Rectangle(5,6);
		double expectedArea = 30;
		assertEquals(expectedArea, r3.Area());
	}
	@Test
	public void ConstructorTest() {
		Rectangle r4 = new Rectangle(4,5);
		int expectedWidth = 4;
		int expectedLength = 5;
		assertEquals(expectedWidth, r4.getiWidth());
		assertEquals(expectedLength, r4.getiLength());
	}
	@Test (expected=IllegalArgumentException.class)
	public void IllegalArgumentExceptionTest() {
		Rectangle r3 = new Rectangle(4,-1);
	}
	@SuppressWarnings("deprecation")
	@Test
	public void perimeterTest() {
		Rectangle r3 = new Rectangle(5,6);
		double expectedPerimeter = 22;
		assertEquals(expectedPerimeter, r3.Perimeter());
		
	}
	

	
}
