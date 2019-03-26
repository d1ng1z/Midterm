package pkgCode;
import java.util.Comparator;

public class SortByVolume extends Cuboid implements Comparator<Cuboid>{  

	
	public SortByVolume()  {
		super(0, 0, 0);
		
	}

	public int compare(Cuboid o1, Cuboid o2) {
		if(o1.volume()>o2.volume()) {
			return 1;
		}
		else if(o1.volume()==o2.volume()) {
			return 0;
		}
		else {
			return -1;
		}
	}
}
