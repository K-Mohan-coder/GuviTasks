package Task_n_2_q_1;

import java.util.*;

public class ProductMainClass {
	
	public static void main(String args[]) {
		
		 System.out.println("1.2");
	     
	     Scanner sc = new Scanner(System.in);
	     Product[] products = new Product[5];
	
	     for (int i = 0; i < 5; i++) {
	         System.out.println("Enter details for product " + (i + 1) + ":");
	         System.out.print("Product ID: ");
	         int pid = sc.nextInt();
	         System.out.print("Price: ");
	         double price = sc.nextDouble();
	         System.out.print("Quantity: ");
	         int quantity = sc.nextInt();
	
	         products[i] = new Product(pid, price, quantity);
	     }
	
	     double maxPrice = products[0].price;
	     int maxPid = products[0].pid;
	
	     for (int i = 1; i < products.length; i++) {
	         if (products[i].price > maxPrice) {
	             maxPrice = products[i].price;
	             maxPid = products[i].pid;
	         }
	     }
	
	     System.out.println("\nProduct ID with the highest price: " + maxPid);
	
	     double totalAmount = 0;
	     for (Product p : products) {
	         totalAmount += p.getTotalCost();
	     }
	
	     System.out.println("Total amount spent on all products: ₹" + totalAmount);
	     
	
	}
}
