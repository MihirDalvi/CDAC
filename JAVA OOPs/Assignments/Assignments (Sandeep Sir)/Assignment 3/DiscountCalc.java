package com.assignment3;

import java.util.Scanner;

class DiscountCalculator{
	private double originalPrice; 
	private double discountRate; 
	private double discountAmount; 
	private double finalPrice;
	
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Original Price: ");
		this.originalPrice = sc.nextDouble();
		System.out.println("Enter Discount Percentage: ");
		this.discountRate = sc.nextDouble();
		
		sc.close();
	}
	
	public void calculateDiscount() {
		this.discountAmount = this.originalPrice * (this.discountRate / 100);
		this.finalPrice = this.originalPrice - this.discountAmount;
	}
	
	public void printRecord() {
		System.out.printf("Discount Amount is: ₹%.2f%n ", this.discountAmount);
		System.out.printf("Final Price of Item: ₹%.2f%n", this.finalPrice);
	}
}

public class DiscountCalc {
	public static void main(String[] args) {
		DiscountCalculator d = new DiscountCalculator();
		
		d.acceptRecord();
		d.calculateDiscount();
		d.printRecord();
	}

}
