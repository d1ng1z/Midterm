package pkgCode;

public class Cuboid extends Rectangle {
	
	private int idepth;
	
	public Cuboid(int idepth, int length, int width) {
		super(width, length);
		if(idepth<=0) {
			throw new IllegalArgumentException();
		}
		this.idepth=idepth;
		
	}
	
	public int getiDepth() {
		return idepth;
	}
	
	public void setiDepth(int depth) {
		idepth = depth;
	}
	public double volume() {
		double volume = iwidth*idepth*ilength;
		return volume;
	}
	public double Area() {
		double surfaceArea= 2*iwidth*ilength+2*iwidth*idepth+2*ilength*idepth;
		return surfaceArea;
		
	}
	public double Perimeter() throws UnsupportedOperationException {
		throw new UnsupportedOperationException();
		
	}
	
	public int Compareto(Object a) {
		
		return super.compareTo(a);
	}
}
