package pkgCode;

public class Rectangle extends Shape {
    protected int ilength;
    protected int iwidth;
    
    public Rectangle(int iwidth, int ilength) {
    	if(iwidth<=0 || ilength<=0) {
    		throw new IllegalArgumentException();
    	}
    	else {
    	this.iwidth=iwidth;
    	this.ilength=ilength;
    	}
    	
    }

	public int getiLength() {
		return ilength;
	}

	public void setiLength(int length) {
		this.ilength = length;
	}

	public int getiWidth() {
		return iwidth;
	}

	public void setiWidth(int width) {
		this.iwidth = width;
	}
    
    public double Area() {
        double area1 = ilength*iwidth;
        return area1;
    }
    
    public double Perimeter() {
    	double perimeter1 = 2*ilength+2*iwidth;
    	return perimeter1;
    }
  public int compareTo(Object a) {
    	if(a instanceof Rectangle) {
    		Rectangle b = (Rectangle)a;
    		return(((Double)(this.Area())).compareTo((Double)b.Area()));
    	}
    	throw new IllegalArgumentException();
    }
  
    	
    
}
