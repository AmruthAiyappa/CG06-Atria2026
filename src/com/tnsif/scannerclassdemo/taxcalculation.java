package com.tnsif.scannerclassdemo;

public class taxcalculation {
public void CalculateTax(person p) {
	if(p.getIncome()<15000) {
		p.setTax(0);
	}
	else if(p.getIncome()<=15000&&p.getIncome()<50000) {
		p.setTax(5);
	}
	else {
		p.setTax(10);
	}
}
}