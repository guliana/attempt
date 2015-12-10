package sk.ima.eShop;

import java.util.*;

public class ProductPackage {
	Scanner sc = new Scanner(System.in);

	public void setChoice() {
		String choice = new String();
		List<Product> products = new ArrayList<Product>();
		while (choice != "0") {
			System.out.println(
					"For action press number:\n1) Add product\n2) Remove product\n3) Show all products\n4) Make an order\n5) Show all orders");
			choice = sc.nextLine();
			// choice = (choice > 5) ? System.out.println("Bad option! Choose
			// again!");

			/*
			 * if ("1" > choice || choice > "5") { System.out.println(
			 * "Please select from options"); choice = sc.next();
			 */
		
		

		switch (choice) {
		case "1":
			// add a new product from console
			System.out.println("Add product id");
			int id = sc.nextInt();
			System.out.println("Add product name");
			String productName = sc.next();
			System.out.println("Add product prize");
			sc.useLocale(Locale.US);
			double prize = sc.nextDouble();
			System.out.println("Your product was added to Product list");
			Product one = new Product(id, productName, prize);
			System.out.println(one.toString());
			products.add(one);
			break;
		case "2":
			System.out.println("jef");
			break;
		case "3":
			System.out.println(products.toString());
			break;
		case "4":
			System.out.println("vniv");
			break;
		case "5":
			System.out.println("sgh");
			break;
		}
		// ProductPackage prodd = new ProductPackage();
		// prodd.addProduct(int id, String productName, double prize);
		}
	}
}
