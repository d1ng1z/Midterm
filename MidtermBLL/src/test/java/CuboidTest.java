import static org.junit.Assert.*;

import org.junit.Test;

import pkgCode.Cuboid;

import pkgCode.*;

public class CuboidTest extends Cuboid {

	public CuboidTest(int idepth, int length, int width) {
		super(idepth, length, width);
		// TODO Auto-generated constructor stub
	}
	@Test
	public void  getiDepthTest() {
		Cuboid c1 = new Cuboid(1,2,3);
		int ExpectedDepth=1;
		assertEquals(ExpectedDepth, c1.getiDepth());
	
	}
	@Test
	public void  setiDepthTest() {
		Cuboid c1 = new Cuboid(1,2,3);
		c1.setiDepth(4);
		int ExpectedDepth=4;
		assertEquals(ExpectedDepth, c1.getiDepth());
	
	}
	@SuppressWarnings("deprecation")
	@Test public void AreaTest() {
		Cuboid c1 = new Cuboid(1,2,3);
		double ExpectedArea = 22;
		assertEquals(ExpectedArea,c1.Area());
	}
	@Test (expected = UnsupportedOperationException.class)
	public void PerimeterTest() {
		Cuboid c1 = new Cuboid(1,2,3);
		c1.Perimeter();
	}
	@Test(expected=IllegalArgumentException.class)
	public void BadArgumentTest() {
		Cuboid c1 = new Cuboid(-5,2,3);
	}
	
	@Test
	public void ConstructorTest() {
		Cuboid c3 = new Cuboid(5,6,7);
		int ExpectedDepth = 5;
		assertEquals(ExpectedDepth,c3.getiDepth());
	}
	@Test 
	public void SortByAreaTest() {
		SortByArea sort = new SortByArea();
		Cuboid c1 = new Cuboid (2,2,2);
		Cuboid c3 = new Cuboid (3,3,3);
		int ExpectedResult = -1;
		assertEquals(ExpectedResult, sort.compare(c1,c3));
	}
	@Test 
	public void SortByVolumeTest() {
		SortByVolume sort = new SortByVolume();
		Cuboid c1 = new Cuboid (2,2,2);
		Cuboid c3 = new Cuboid (3,3,3);
		int ExpectedResult = -1;
		assertEquals(ExpectedResult, sort.compare(c1,c3));
	}
}
