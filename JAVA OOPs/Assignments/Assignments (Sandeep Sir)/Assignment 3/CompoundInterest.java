package com.assignment3;

import java.util.Scanner;

class CompoundInterestCalculator{
	private double futureValue;
	private double principal;
	private double annualInterestRate;
	private double numberOfCompounds;
	private double years;
	private double totalInterest;
	
	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter intial investment is ");
		this.principal = sc.nextDouble();
		System.out.println("Enter annual interest rate is ");
		this.annualInterestRate = sc.nextDouble();
		System.out.println("Enter no of times interest is compounded per year is ");
		this.numberOfCompounds = sc.nextDouble();
		System.out.println("Enter duration(in years) is  ");
		this.years = sc.nextDouble();
		
		sc.close();
	}
	
	public void calculateFutureValue() {
		this.futureValue = principal * (1 + annualInterestRate / numberOfCompounds)*Math.pow(years, numberOfCompounds);
		this.totalInterest = futureValue - principal;
	}
	
	public void printRecord() {
		System.out.printf(" Future value %.3f%n", futureValue);
		System.out.printf("Total interest earned %.3f%n", totalInterest);
	}
	
}

public class CompoundInterest {

	public static void main(String[] args) {

		CompoundInterestCalculator CiC = new CompoundInterestCalculator();
		
		CiC.acceptRecord();
		CiC.calculateFutureValue();
		CiC.printRecord();
	}

}
