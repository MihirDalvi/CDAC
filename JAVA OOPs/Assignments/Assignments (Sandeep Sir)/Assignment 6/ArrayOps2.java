package single.dimensional.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOps2 {
    // Step 1: Declare the array as a field in the class
    private int[] numbers;

    // Constructor to instantiate the array
    public ArrayOps2(int size) {
        numbers = new int[size]; // Initialize the array in the constructor
    }

    // Getter method to get the array
    public int[] getNumbers() {
        return numbers;
    }

    // Setter method to set values in the array
    public void setNumbers(int[] numbers) {
        if (numbers.length == this.numbers.length) {
            this.numbers = numbers;
        } else {
            System.out.println("Array size mismatch.");
        }
    }

    // Method to display the array (printing values)
    public void displayArray() {
        System.out.println("Array elements are:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }
    }

    public static void main(String[] args) {
        // Step 2: Create an instance of ArrayOperations with an array size
    	ArrayOps2 arrayOps = new ArrayOps2(5);

        // Step 3: Accept values from the user and set them using the setter method
        Scanner sc = new Scanner(System.in);
        int[] userInput = new int[5];
        System.out.println("Enter 5 integers to populate the array:");
        for (int i = 0; i < userInput.length; i++) {
            System.out.print("Enter value for index " + i + ": ");
            userInput[i] = sc.nextInt();
        }
        arrayOps.setNumbers(userInput);  // Set values using setter method

        // Display the array using the displayArray method
        arrayOps.displayArray();   // Print the values of the array

        sc.close();
    }
}
