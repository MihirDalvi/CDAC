package single.dimensional.array;

import java.util.Scanner;

public class MaxMinArr {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Step 1: Declare a single-dimensional array
        int[] num = new int[5];
        
        // Step 2: Accept values from the user
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < num.length; i++) {
            System.out.print("Enter value for index " + i + ": ");
            num[i] = sc.nextInt();
        }
        
        // Step 3: Initialize max and min with the first element of the array
        int max = num[0];
        int min = num[0];
        
        // Step 4: Traverse the array to find the max and min values
        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
            if (num[i] < min) {
                min = num[i];
            }
        }
        
        // Step 5: Print the max and min values
        System.out.println("Maximum value in the array: " + max);
        System.out.println("Minimum value in the array: " + min);
        
        sc.close();
    }
}
