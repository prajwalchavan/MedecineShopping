package com.praj.omss.main;

import com.praj.omss.services.*;

import java.util.Scanner;

import com.praj.omss.entity.Product;
import com.praj.omss.entity.User;

public class MainClass {
	public static void main(String[] args) {

		UserServiceImpl ucn = new UserServiceImpl();
		ProductServiceImpl psI = new ProductServiceImpl();
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
						System.out.print("1.Add Product\n2.View Product\n3.View User\n4.View Orders\n5.logout\n");
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
							Product product = new Product(productId, productName, category, quantity, amount);
							psI.addProduct(product);
							break;
						case 2:
							System.out.println("All Products:" + ProductService.ViewAllProducts() + "\n");
							break;

						case 3:
							System.out.println("All Users:" + UserService.ViewAllUsers() + "\n");
							break;
						case 4:
							System.out.println("All Orders:" + OrderService.ViewAllOrder() + "\n");
							break;
						case 5: 
							System.out.println(0);;
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
				// scanner.next();
				System.out.println("Phone No: ");
				Long mobileNo = scanner.nextLong();
				System.out.println("Enter the email id");
				String Email = scanner.next();
				System.out.println("Create the new password");
				scanner.nextLine();
				String password = scanner.nextLine();
				ucn.register(userId, firstName, lastName, address, mobileNo, Email, password); 
				break;
			case 2:
				System.out.println("--------User Login Page---------");
				String UserId, loginPassword;
				System.out.println("Enter your userId");
				UserId = scannerString.next();
				System.out.print("Enter the password: ");
				loginPassword = scannerString.next();
				if (UserId.equals("user") && loginPassword.equals("1234")) {
					System.out.println("Login Successful");
					do {
						System.out.print(
								"Menu\n1.View Products\n2.Add to Cart\n3.Pay using Card\n4.View Order\n5.logout\n");
						System.out.println("Enter the choice");
						int choice = option.nextInt();
						switch (choice) {
						case 1:
							System.out.println("All Products Details");
							System.out.println(ProductService.ViewAllProduct());
							System.out.println("Menu:\n1.View a Single Product\n2.Previous Menu");
							int userChoice = option.nextInt();
							switch (userChoice) {
							case 1:
								System.out.print("Enter the Product Id of the product to View:");
								int productId = scanner.nextInt();
								System.out.println(ProductService.ViewSingleProduct(productId));
								break;
							case 2:
								break;
							}
							break;
						case 2:
							System.out.print("Add the products to cart:");
							int productId = scanner.nextInt();
							System.out.println(CartService.addProduct(productId));
							break;
						case 3:
							System.out.println("Payment using card:");
							break;
						case 4:
							System.out.println("1.View All Produts\n2.View Based on Category\n3.View a Single Product");
							int productChoice = option.nextInt();
							switch (productChoice) {
							case 1:
								System.out
										.println("All Products Available.\n" + ProductService.ViewAllProduct() + "\n");
								break;
							case 2:
								System.out.print("Enter the Category to view the products:");
								String category = scanner.next();
								System.out.println("Product Based on " + category + ":\n"
										+ ProductService.ViewBasedOnCategory(category));
								break;
							case 3:
								System.out.print("Enter the Id of the product to View:");
								int productId1 = scanner.nextInt();
								System.out.println("Product:" + ProductService.ViewSingleProduct(productId1));
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
			break;

		case 3:
			System.exit(0);

		}
		scanner.close();
		scannerString.close();
		option.close();

	}
}
