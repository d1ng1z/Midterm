package pkgCode;
import java.util.Comparator;

public class SortByArea extends Cuboid implements Comparator<Cuboid> {
//public SortByArea() {
//	super();
//}

public SortByArea() {
		super(0, 0, 0);
		// TODO Auto-generated constructor stub
	}

public int compare(Cuboid o1, Cuboid o2) {
	if(o1.Area()>o2.Area()) {
		return 1;
	}
	else if(o1.Area()==o2.Area()) {
		return 0;
	}
	else {
		return -1;
	}
}
}
