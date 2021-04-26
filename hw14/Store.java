package hw14;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Scanner;

public class Store {

	public LinkedHashSet<Commodity> store = new LinkedHashSet<>();

	public LinkedHashSet<Commodity> getStore() {
		return store;
	}

	public void setStore(LinkedHashSet<Commodity> store) {
		this.store = store;
	}

	@Override
	public String toString() {
		return "Store [store=" + store + "]";
	}

	public void add(Commodity com) {
		store.add(com);
	}

	// 1. Додати товар

	public void addNewCom() {
		System.out.println("Enter the name of new commodity");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();

		System.out.println("Enter length of new commodity");
		Double length = sc.nextDouble();

		System.out.println("Enter width of new commodity");
		Double width = sc.nextDouble();

		System.out.println("Enter weight of new commodity");
		Double weight = sc.nextDouble();

		Commodity com = new Commodity(name, length, width, weight);
		store.add(com);
		System.out.println(com.toString() + " have been added:");
		System.out.println("-----------------");
		for (Commodity commodity : store) {
			System.out.println(commodity);
		}
	}

	// 2. Видалити товар

	public void removeCom() {
		System.out.println("Enter the name of commodity");
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		String name = sc.nextLine();

		System.out.println("Enter length of commodity");
		Double length = sc.nextDouble();

		System.out.println("Enter width of commodity");
		Double width = sc.nextDouble();

		System.out.println("Enter weight of commodity");
		Double weight = sc.nextDouble();

		boolean comExists = isComExists(store, name, length, width, weight);

		if (comExists) {

			Iterator<Commodity> iterator = store.iterator();

			while (iterator.hasNext()) {
				Commodity nextCommodity = iterator.next();
				if (nextCommodity.getName().equalsIgnoreCase(name) && nextCommodity.getLength() == length
						&& nextCommodity.getWidth() == width && nextCommodity.getWeight() == weight) {
					iterator.remove();
					System.out.println(nextCommodity.toString() + " have been deleted:");
					System.out.println("-----------------");
					for (Commodity commodity : store) {
						System.out.println(commodity);
					}
				}
			}

		} else {
			System.out.println("This commodity is missing!");
		}
	}

	private boolean isComExists(LinkedHashSet<Commodity> store, String name, Double length, Double width,
			Double weight) {
		boolean flag = false;

		for (Commodity commodity : store) {
			if (commodity.getName().equalsIgnoreCase(name) && commodity.getLength() == length
					&& commodity.getWidth() == width && commodity.getWeight() == weight) {
				flag = true;
			}
		}

		return flag;

	}

	// 3. Замінити товар

	public void setCom() {
		System.out.println("Enter the name of commodity");
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		String name = sc.next();

		System.out.println("Enter length of commodity");
		Double length = sc.nextDouble();

		System.out.println("Enter width of commodity");
		Double width = sc.nextDouble();

		System.out.println("Enter weight of commodity");
		Double weight = sc.nextDouble();

		Commodity prevCom = new Commodity(name, length, width, weight);

		boolean comExists = isComExists(store, name, length, width, weight);

		if (comExists) {

			for (Commodity commodity : store) {
				if (commodity.getName().equalsIgnoreCase(name) && commodity.getLength() == length
						&& commodity.getWidth() == width && commodity.getWeight() == weight) {
					System.out.println("Enter the name of new commodity");
					String name1 = sc.next();
					System.out.println("Enter length of new commodity");
					Double length1 = sc.nextDouble();

					System.out.println("Enter width of new commodity");
					Double width1 = sc.nextDouble();

					System.out.println("Enter weight of new commodity");
					Double weight1 = sc.nextDouble();

					Commodity newCom = new Commodity(name1, length1, width1, weight1);

					commodity.setName(name1);
					commodity.setLength(length1);
					commodity.setWidth(width1);
					commodity.setWeight(weight1);

					System.out.println(newCom + " have been added instead " + prevCom);
					System.out.println("-----------------");
					System.out.println(store.toString());

					break;

				}
			}

		} else {
			System.out.println("This commodity is missing!");
		}
	}

//		4. Сортувати за назвою

	public void sortByName() {

		Commodity[] storeArray = new Commodity[store.size()];
		storeArray = store.toArray(storeArray);
		Arrays.sort(storeArray, new CommodityNameComparator());
		for (Commodity com : storeArray) {
			System.out.println(com);
		}

	}

//		5. Сортувати за довжиною

	public void sortByLength() {
		Commodity[] storeArray = new Commodity[store.size()];
		storeArray = store.toArray(storeArray);
		Arrays.sort(storeArray, new CommodityLengthComparator());
		for (Commodity com : storeArray) {
			System.out.println(com);
		}
	}

//		6. Сортувати за шириною

	public void sortByWidth() {
		Commodity[] storeArray = new Commodity[store.size()];
		storeArray = store.toArray(storeArray);
		Arrays.sort(storeArray, new CommodityWidthComparator());
		for (Commodity com : storeArray) {
			System.out.println(com);
		}
	}

//		7. Сортувати за вагою

	public void sortByWeight() {
		Commodity[] storeArray = new Commodity[store.size()];
		storeArray = store.toArray(storeArray);
		Arrays.sort(storeArray, new CommodityWeightComparator());
		for (Commodity com : storeArray) {
			System.out.println(com);
		}
	}

//		8. Вивecти і-тий елемент колекції(який ми вводимо з консолі(використовуємо Scanner))

	public void showSomeCom() {

		System.out.println("Enter some number within the set size: from 0 to " + (store.size() - 1));
		Scanner sc = new Scanner(System.in);
		Commodity[] storeArray = new Commodity[store.size()];
		storeArray = store.toArray(storeArray);
		int n = sc.nextInt();
		System.out.println(n + " element of collection: " + storeArray[n]);

	}
}
