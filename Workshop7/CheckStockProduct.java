package com.github.dewarepk;

import java.util.Arrays;
import java.util.Scanner;

public class CheckStockProduct {

	public static final String CONSOLE_LINE = "--------------------------------------------------";

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("How many product list in stock : ");

		Product[] productList = new Product[scan.nextInt()];

		for (int i = 0; i < productList.length; i++) {
			System.out.println();

			productList[i] = new Product();

			System.out.print("Input product Id\t: ");
			productList[i].setId(scan.next());
			System.out.print("Input product Unit\t: ");
			productList[i].setUnit(scan.nextInt());

			while (productList[i].getUnit() < 0) {
				System.out.print("Input product Unit, Again\t: ");
				productList[i].setUnit(scan.nextInt());
			}

		}

		header("LOW");
		Arrays.stream(productList)
				.filter(product -> product.getUnit() < 5)
				.forEach(product -> System.out.println(">> " + product.getId() + " has " + product.getUnit() + " units"));
		header("NORMAL");
		Arrays.stream(productList)
				.filter(product -> product.getUnit() >= 5 && product.getUnit() < 50)
				.forEach(product -> System.out.println(">> " + product.getId() + " has " + product.getUnit() + " units"));
		header("HIGH");
		Arrays.stream(productList)
				.filter(product -> product.getUnit() >= 50)
				.forEach(product -> System.out.println(">> " + product.getId() + " has " + product.getUnit() + " units"));
	}

	public static void header(String msg) {
		System.out.println(CONSOLE_LINE);
		System.out.println("List of product in '" + msg + "' status");
		System.out.println(CONSOLE_LINE);
	}

}
