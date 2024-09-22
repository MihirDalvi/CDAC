package single.dimensional.array;

import java.util.Scanner;

public class SingleDimenArray {

	public static void main(String[] args) {
		int[] numbers = new int[5];
		System.out.println("Default values of the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 integers to update the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter value for index " + i + ": ");
            numbers[i] = sc.nextInt();
        }
        
        System.out.println("Updated values of the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        sc.close();
	}

}
