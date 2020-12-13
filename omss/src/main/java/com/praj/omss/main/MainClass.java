package com.praj.omss.main;

import com.praj.omss.entity.Product;
import com.praj.omss.services.*;

import java.util.Map;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {

		UserServiceImpl ucn = new UserServiceImpl();
		ProductServiceImpl psI = new ProductServiceImpl();
		OrderServiceImpl osI = new OrderServiceImpl();
		CartServiceImpl csI = new CartServiceImpl();
		Scanner scanner = new Scanner(System.in); /* Integer input */
		Scanner scannerString = new Scanner(System.in); /* String input */
		Scanner option = new Scanner(System.in);
		/* ----- Selecting Role------- */
		System.out.println("Online Medicine Shopping System");
		System.out.println("----------------------------------");
		System.out.println("Select the person role");
		System.out.println("1.Admin\n2.User\n3.Exit");
		int personRole = option.nextInt();
		switch (personRole) {
		case 1:
			System.out.println("Admin Page");
			System.out.println("1.Login\n2.Exit");
			String adminUsername = "admin";
			String adminPassword = "1234";
			int adminOption = option.nextInt();
			switch (adminOption) {
			/* ---------------------Admin Page----------------------- */

			case 1:
				System.out.println("Admin login Page");
				System.out.println("Enter Adminname: ");
				adminUsername = scannerString.next();
				System.out.println("Enter password: ");
				adminPassword = scanner.next();
				if (adminUsername.equals("admin") && adminPassword.equals("1234")) {
					System.out.println("Login Successful");
					do {
						System.out.print(
								"1.Add Product\n2.View All Products\n3.View All Users\n4.View All Orders\n5.logout\n");
						System.out.println("Enter the choice");
						int choice = option.nextInt();
						switch (choice) {
						case 1:
							System.out.println("---------------------Add Product Page-------------------------------");
							System.out.println("Enter product details");
							System.out.println("Product Id:");
							int productId = scanner.nextInt();
							System.out.println("Product Name: ");
							String productName = scannerString.next();
							System.out.println("Product Category: ");
							String category = scannerString.next();
							System.out.println("Quantity");
							int quantity = scanner.nextInt();
							// scanner.next();
							System.out.println("Product amount: ");
							Long amount = scanner.nextLong();
							psI.addProduct(productId, productName, category, quantity, amount);
							break;
						case 2:
							System.out.println("All Products:" + psI.getProductList() + "\n");
							break;

						case 3:
							System.out.println("All Users:" + ucn.ViewAllUsers() + "\n");
							break;
						case 4:
							System.out.println("All Orders:" + osI.ViewAllOrder() + "\n");
							break;
						case 5:
							System.out.println("---------------Thank You---------------");
							System.out.println(0);
							;
							System.exit(0);
							break;

						}
					} while (true);

				}
			case 2:
				System.exit(0);
			}
			break;

		/* --------------------------User Page----------------------------- */
		case 2:
			boolean again = true;
			while (again) {
				again = false;
				System.out.println("User Page");
				System.out.println("1.Registration\n2.Login\n3.Exit");
				int userOption = option.nextInt();
				switch (userOption) {
				case 1:
					System.out.println("Welcome for User Registration");
					System.out.println("-----------------------------------------------------------");
					System.out.println("Enter the User Details");
					System.out.println("User Id:");
					int userId = scanner.nextInt();
					System.out.print("First Name:  ");
					String firstName = scannerString.nextLine();
					System.out.print("Last Name:  ");
					String lastName = scannerString.nextLine();
					System.out.println("Address: ");
					String address = scannerString.nextLine();
					System.out.println("Phone No: ");
					Long mobileNo = scanner.nextLong();
					System.out.println("Enter the email id");
					String Email = scanner.next();
					System.out.println("Create the new password");
					scanner.nextLine();
					String password = scanner.nextLine();
					ucn.register(userId, firstName, lastName, address, mobileNo, Email, password);
					System.out.println("-----User Registered-----");
					again = true;
					break;
				case 2:
					System.out.println("--------User Login Page---------");
					String loginPassword;
					int UserId;
					System.out.println("Enter your userId");
					UserId = scanner.nextInt();
					System.out.print("Enter the password: ");
					loginPassword = scannerString.next();
					if (ucn.login(UserId, loginPassword)) {
						System.out.println("--------Login Successful-------");
						String name = ucn.getusername(UserId);
						System.out.println("welcome  " + name);
						do {
							System.out.print(
									"Menu\n1.View Products\n2.Add to Cart\n3.Pay using Card\n4.View Order\n5.logout\n");
							System.out.println("Enter the choice");
							int choice = option.nextInt();
							switch (choice) {
							case 1:
								System.out.println("All Products Details");
								System.out.println(psI.getProductList());
								System.out.println("Menu:\n1.View based on category\n2.Previous Menu");
								int userChoice = option.nextInt();
								switch (userChoice) {
								case 1:
									System.out.print("Enter the category of the product to View:");
									String category = scannerString.next();
									System.out.println(psI.viewSingleProduct(category));
									break;
								case 2:
									break;
								}
								break;
							case 2:
								System.out.print("Add the products to cart:");
								System.out.println("Enter Id of product");
								int productId = scanner.nextInt();
								System.out.println("Enter the quantity of product");
								int Qty = scanner.nextInt();
								csI.addProductToCart(productId, Qty);
								break;
							case 3:
								//System.out.println("Payment using card:");
								for(Map.Entry<Product, Integer> c : csI.viewCart().entrySet()) {
									System.out.println(c.getKey() + "-" + c.getValue());
								}
								break;
							case 4:
								System.out.println(
										"1.View All Produts\n2.View Based on Category\n3.View a Single Product");
								int productChoice = option.nextInt();
								switch (productChoice) {
								case 1:
									System.out.println("All Products Available.\n" + psI.getProductList() + "\n");
									break;
								case 2:
									System.out.print("Enter the Category to view the products:");
									String category = scanner.next();
									System.out.println(
											"Product Based on " + category + ":\n" + psI.viewSingleProduct(category));
									break;
								case 3:
									System.out.print("Enter the Id of the product to View:");
									String category1 = scanner.next();
									System.out.println("Product:" + psI.viewSingleProduct(category1));
									break;
								}
								break;
							case 5:
								System.exit(0);
							}
						}

						while (true);
					}
				case 3:
					System.exit(0);
				}
			}
			break;

		case 3:
			System.exit(0);

		}
		scanner.close();
		scannerString.close();
		option.close();

	}
}
