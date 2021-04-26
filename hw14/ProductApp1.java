package hw14;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProductApp1 {

	public static void main(String[] args) {

		Set <Product> set = new LinkedHashSet<>();
		
		set.add(new Product("N", 250, 25.50));
		set.add(new Product("B", 300, 58.46));
		set.add(new Product("A", 150, 99.50));
		set.add(new Product("D", 12.5, 148.20));
		set.add(new Product("S", 320, 28.625));
		set.add(new Product("A", 260, 49.50));
		set.add(new Product("D", 12.5, 152.20));
		set.add(new Product("N", 250, 25.50));
		set.add(new Product("S", 320, 27.50));
		set.add(new Product("B", 350, 28.50));
		
		System.out.println("Before sorting");
		for (Product product : set) {
			System.out.println(product);
		}
		
		System.out.println("_____________");
		System.out.println("After AllFieldsComparator");
		
		TreeSet<Product> ts = new TreeSet<> (new ProductAllFieldsComparator());
		
		ts.addAll(set);
		
		for (Product product : ts) {
			System.out.println(product);
		}
		
		System.out.println("_____________");
		System.out.println("After comparable");
		
		TreeSet<Product> ts2 = new TreeSet<> ();
		
		ts2.addAll(ts);
		
		for (Product product : ts2) {
			System.out.println(product);
		}
	}
}
