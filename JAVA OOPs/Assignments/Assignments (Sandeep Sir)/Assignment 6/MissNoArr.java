package single.dimensional.array;

import java.util.*;

public class MissNoArr {

	public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        // Step 1: Accept the size of the array (should be N - 1, where N is the range)
	        System.out.print("Enter the value of N (the range of numbers): ");
	        int N = sc.nextInt();

	        int[] arr = new int[N - 1]; // The array should contain N - 1 elements, since one number is missing

	        // Step 2: Accept the elements of the array
	        System.out.println("Enter " + (N - 1) + " elements of the array (numbers from 1 to " + N + "):");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print("Enter value for index " + i + ": ");
	            arr[i] = sc.nextInt();
	        }

	        // Step 3: Calculate the expected sum of numbers from 1 to N
	        int expectedSum = N * (N + 1) / 2;

	        // Step 4: Calculate the sum of elements in the given array
	        int actualSum = 0;
	        for (int value : arr) {
	            actualSum += value;
	        }

	        // Step 5: Find the missing number
	        int missingNumber = expectedSum - actualSum;

	        // Step 6: Output the missing number
	        System.out.println("The missing number is: " + missingNumber);

	        sc.close();
	}

}
