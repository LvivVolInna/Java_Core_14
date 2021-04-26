package hw14;

import java.util.Scanner;

public class CommodityApp2 {

	public static void main(String[] args) {
		Store store = new Store();
		Scanner scanner = new Scanner(System.in);

		store.add(new Commodity("N", 1, 1, 1));
		store.add(new Commodity("B", 300, 58.46, 23.6));
		store.add(new Commodity("A", 150, 99.50, 47.56));
		store.add(new Commodity("D", 1255.5, 148.20, 126.89));
		store.add(new Commodity("S", 320, 256.25, 12.56));
		store.add(new Commodity("A", 250, 99.50, 75.45));
		store.add(new Commodity("D", 1278.5, 152.20, 147.60));

		for (Commodity com : store.getStore()) {
			System.out.println(com);
		}

		while (true) {
			System.out.println();
			System.out.println("press 1 to add commodity" + "\npress 2 to delete commodity"
					+ "\npress 3 to replace commodity " + "\npress 4 to sort by name" + "\npress 5 to sort by length"
					+ "\npress 6 to sort by width" + "\npress 7 to sort by weight" + "\npress 8 to show i-th element"
					+ "\npress 9 to exit the program");
			switch (scanner.next()) {

			case "1": {
				store.addNewCom();

				break;
			}

			case "2": {
				store.removeCom();

				break;
			}

			case "3": {
				store.setCom();

				break;
			}

			case "4": {
				store.sortByName();

				break;
			}

			case "5": {
				store.sortByLength();

				break;
			}

			case "6": {
				store.sortByWidth();

				break;
			}

			case "7": {
				store.sortByWeight();

				break;
			}

			case "8": {
				store.showSomeCom();

				break;
			}

			case "9": {
				System.out.println("VSbO");
				System.exit(0);

				break;
			}

			}

		}

	}

}
