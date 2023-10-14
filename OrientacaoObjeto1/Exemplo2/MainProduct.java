package Exemplo2;

import java.util.Locale;
import java.util.Scanner;

import Entities.Product;


public class MainProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Locale.setDefault(Locale.US);
	      Scanner sc = new Scanner(System.in);
	      
	      Product product = new Product(null, 0, 0);
	      
	      System.out.println("Enter product data: ");
	      System.out.print("Name: ");
	      String name = sc.nextLine();
	      System.out.print("Price: ");
	      double price = sc.nextDouble();
	      
	      product.setName("Computer");
	      System.out.println();
	      System.out.println("Product name: " + product.getName());
	      
	      product.setPrice(1200.00);
	      System.out.println("Product Price: " + product.getPrice());
	     
	      //System.out.print("Quantity in stock: ");
	      //int quantity = sc.nextInt();
	      System.out.println();
	      System.out.println("Product data: " + product);
	      System.out.println();
	      System.out.print("Enter the number of products to be added in stock: ");
	      
	      int quantity = sc.nextInt();
	      product.addProducts(quantity);
	      System.out.println();
	      System.out.println("Updated data: " + product);
	      System.out.println();
	      System.out.print("Enter the number of products to be removed from stock: ");
	      quantity = sc.nextInt();
	      product.removeProduct(quantity);
	      
	      System.out.println();
	      System.out.println("Updated data: " + product);
		  sc.close();
	}

}
