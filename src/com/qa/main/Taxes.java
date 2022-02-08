package com.qa.main;

public class Taxes {
	
	
	public double percentTax(double salary) {
		if (salary < 15000) {
			return 0;
		} else if (salary < 20000) {
			return 10;
		} else if (salary < 30000) {
			return 15;
		} else if (salary < 45000) {
			return 20;
		} 
		return 25;
	}
	
	public double amountTax(double salary) {
		return (salary/100) * percentTax(salary);
	}
}
