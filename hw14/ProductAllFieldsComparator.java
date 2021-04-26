package hw14;

import java.util.Comparator;

public class ProductAllFieldsComparator implements Comparator<Product>{
	
	public int compare(Product o1, Product o2) {
		if(o1.getName().compareTo(o2.getName())>0) {
			return 1;
		}else if(o1.getName().compareTo(o2.getName())<0) {
			return -1;
		}else {
			if(o1.getWeight()>o2.getWeight()) {
				return 1;	
			}else if (o1.getWeight()<o2.getWeight()) {
				return -1;	
			}else {
				if(o1.getPrice()>o2.getPrice()) {
					return 1;	
				}else if (o1.getPrice()<o2.getPrice()) {
					return -1;	
				}
		}
		return 0;
	}
	}
	
}


