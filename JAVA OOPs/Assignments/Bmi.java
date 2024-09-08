package com.assignment3;

import java.util.Scanner;

class BMITracker{
	private float weight;
	private float height;
	private float bmi;

	public void acceptRecord() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your Weight (in KGs) ");
		this.weight = sc.nextFloat();
		System.out.println("Enter your Height (in Meters) ");
		this.height = sc.nextFloat();
		
		sc.close();
	}
	public void calculateBMI() {
		this.bmi = weight / (height * height);
	}
	public void classifyBMI() {
		if (this.bmi <= 18.4) {
			System.out.println("UnderWeight!");
		}
		else if ((this.bmi >= 18.5) || (this.bmi <= 24.9)) {
			System.out.println("Normal Weight!");
		}
		else if ((this.bmi >= 25) || (this.bmi <= 29.9)) {
			System.out.println("Over Weight!");
		}
		else
		{
			System.out.println("Obese !!!");
		}
	}
	public void printRecord() {
		System.out.printf("Your B.M.I. is: %.3f%n", this.bmi);
	}
}

public class Bmi {
	public static void main(String[] args) {

		BMITracker t = new BMITracker();
		
		t.acceptRecord();
		t.calculateBMI();
		t.printRecord();
		t.classifyBMI();
		
	}

}
