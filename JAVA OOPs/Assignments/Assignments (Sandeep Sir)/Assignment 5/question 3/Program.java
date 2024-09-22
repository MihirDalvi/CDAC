package com.employee.assign5q3;

public class Program {
	 public static void main(String[] args) {
	       
	    	
    	 Employee emp1 = new Employee(1, "Alice", 5000);
         Employee emp2 = new Employee(2, "Bob", 6000);

         // Display initial details
         System.out.println("Initial Employee Details:");
         System.out.println(emp1);
         System.out.println(emp2);

         // Show total number of employees and total salary expense
         System.out.println("\nTotal Number of Employees: " + Employee.getTotalEmployees());
         System.out.printf("Total Salary Expense: $%.2f%n", Employee.calculateTotalSalaryExpense());

         // Apply a raise to all employees
         Employee.applyRaise(10); // Apply a 10% raise

         // Update salary of a specific employee
         emp1.updateSalary(50000);

         // Display updated details
         System.out.println("\nUpdated Employee Details:");
         System.out.println(emp1);
         System.out.println(emp2);

         // Show updated total number of employees and total salary expense
         System.out.println("\nTotal Number of Employees: " + Employee.getTotalEmployees());
         System.out.printf("Total Salary Expense: $%.2f%n", Employee.calculateTotalSalaryExpense());
    	
    	
    }
}
