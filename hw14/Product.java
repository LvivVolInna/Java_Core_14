package hw14;

public class Product implements Comparable<Product> {

	private String name;
	private double weight;
	private double price;

	public Product(String name, double weight, double price) {
		this.name = name;
		this.weight = weight;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getWeight() {
		return weight;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Product [name=" + name + ", weight=" + weight + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(weight);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (Double.doubleToLongBits(weight) != Double.doubleToLongBits(other.weight))
			return false;
		return true;
	}

//можемо порівняти лише за однією характеристикою (на вибір)
	@Override
	public int compareTo(Product o) {
		// return this.name.compareTo(o.getName());
		// return this.weight>(o.getWeight())?1:-1;
		return this.price > (o.getPrice()) ? 1 : -1;
	}

}
