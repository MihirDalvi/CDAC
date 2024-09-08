package com.assignment3;

import java.util.Scanner;

class LoanAmortizationCalculator {
	private double monthlyPayment;
	private double principal;
	private double monthlyInterestRate;
	private double numberOfMonths;
	private double annualInterestRate;
	private double loanTerm;

	//monthlyInterestRate = annualInterestRate / 12 / 100 and 
	//numberOfMonths = loanTerm * 12
	
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter principal amount (loan amount) : ");
		this.principal = sc.nextDouble();
		System.out.println("Enter annual interest rate: ");
		this.annualInterestRate = sc.nextDouble();
		System.out.println("Enter loan term : ");
		this.loanTerm  = sc.nextDouble();

		sc.close();
	}
	
	public void calculateMonthlyPayment () {
		
		this.monthlyInterestRate = annualInterestRate / 12 / 100;
		this.numberOfMonths = loanTerm * 12;
		this.monthlyPayment = (double) (principal * (monthlyInterestRate  * Math.pow(1 +monthlyInterestRate, numberOfMonths)) / (Math.pow(1 + monthlyInterestRate, numberOfMonths) - 1  ) );
	}
	
	public void printRecord() {
		System.out.printf("Monthly payment is %.3f%n", monthlyPayment);
		System.out.printf("Monthly interest rate is  %.3f%%%n", monthlyInterestRate*100);  // Multiplied by 100 to display percentage
		//double totalAmt = principal*Math.pow(1+annualInterestRate, numberOfMonths);
		//System.out.printf("Total amount paid is %.3f%n", totalAmt);
		
	}
}
public class LoanCalc {
	public static void main(String[] args) {
		
		LoanAmortizationCalculator LaC = new LoanAmortizationCalculator();
		
		LaC.acceptRecord();
		LaC.calculateMonthlyPayment();
		LaC.printRecord();
		
	}

}
