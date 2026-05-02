package com.tnsif.scannerclassdemo;
// finding the tax of the person
public class person {
	
private String name;  // varibales
private int income;
private int tax;

//getter and setter 
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getIncome() {
	return income;
}
public void setIncome(int income) {
	this.income = income;
}
public int getTax() {
	return tax;
}
public void setTax(int tax) {
	this.tax = tax;
}

// to string
@Override
public String toString() {
	return "Person [name=" + name + ", income=" + income + ", tax=" + tax + "]";
}

}
