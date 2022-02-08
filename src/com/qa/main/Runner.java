package com.qa.main;

public class Runner {
	public static void main(String[] args) {
		Taxes tax = new Taxes();
		System.out.println(tax.amountTax(23345));
	}
}
