package com.github.dewarepk;

import java.text.DecimalFormat;
import java.util.Scanner;

public class StockProduct {

	public static final String CONSOLE_LINE = "--------------------------------------------------";

	public static void main(String[] args) {

		DecimalFormat decimalFormat = new DecimalFormat("#,###.00");
		Scanner scan = new Scanner(System.in);
		Product[] productList = new Product[4];

		for (int i = 0; i < productList.length; i++) {
			productList[i] = new Product();

			System.out.print("Input product Id\t: ");
			productList[i].setId(scan.next());
			System.out.print("Input product Unit\t: ");
			productList[i].setUnit(scan.nextInt());
			while (productList[i].getUnit() < 0) {
				System.out.print("Input product Unit, Again\t: ");
				productList[i].setUnit(scan.nextInt());
			}
			System.out.print("Input product Price\t: ");
			productList[i].setPrice(scan.nextDouble());
			while (productList[i].getPrice() < 0) {
				System.out.print("Input product Price, Again\t: ");
				productList[i].setPrice(scan.nextInt());
			}
			System.out.println();

		}

		double sum = 0;

		System.out.println(CONSOLE_LINE);
		for(Product goods : productList) {
			System.out.println("Product ID : " + goods.getId() + ", " + "Total price = " + decimalFormat.format(goods.calculate()) + " baht.");
			sum += goods.calculate();
		}
		System.out.println(CONSOLE_LINE);

		System.out.println("Total price of all products is " + decimalFormat.format(sum) + " baht.");
	}
}