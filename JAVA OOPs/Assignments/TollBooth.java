package com.assignment3;

import java.util.Scanner;

class TollBoothRevenueManager {
	private int noOfCar;
	private int noOfTru;
	private int noOfMoto;
	private float car;
	private float truck;
	private float motorcycle;
	private float TotalRevenue;
	private int TotalVehicles;
	
	Scanner sc = new Scanner(System.in);
	
	public void acceptRecord() {
		System.out.println("Enter toll rate for CAR: ");
		this.car = sc.nextFloat();
		System.out.println("Enter toll rate for TRUCK: ");
		this.truck = sc.nextFloat();
		System.out.println("Enter toll rate for MOTORCYCLE: ");
		this.motorcycle = sc.nextFloat();
	}
	
	public void setTollRates() {
		System.out.println("Enter total no of CAR/S passing thru: ");
		this.noOfCar = sc.nextInt();
		System.out.println("Enter total no of TRUCK/S passing thru: ");
		this.noOfTru = sc.nextInt();
		System.out.println("Enter total no of MOTORCYCLE/S passing thru: ");
		this.noOfMoto = sc.nextInt();
	}
	
	public void calculateRevenue() {
		this.TotalRevenue = (this.car * this.noOfCar) + (this.truck * this.noOfTru) + (this.motorcycle * this.noOfMoto);
		this.TotalVehicles = this.noOfCar + this.noOfTru + this.noOfMoto;
	}
	
	public void printRecord() {
		System.out.println("Total no of Vehicles: "+this.TotalVehicles);
		System.out.printf("Total no of Revenue of all Vehicles : ₹%.2f%n",this.TotalRevenue);	
	}
}

public class TollBooth {
	public static void main(String[] args) {
		
		TollBoothRevenueManager t = new TollBoothRevenueManager();
		
		t.acceptRecord();
		t.setTollRates();
		t.calculateRevenue();
		t.printRecord();
		
	}

}
