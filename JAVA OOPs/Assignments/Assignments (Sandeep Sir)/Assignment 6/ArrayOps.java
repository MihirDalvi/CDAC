package single.dimensional.array;
import java.util.Scanner;
public class ArrayOps {


	    // Step 1: Declare the array as a field in the class
	    private int[] numbers;

	    // Constructor to instantiate the array
	    public ArrayOps(int size) {
	        numbers = new int[size]; // Initialize the array in the constructor
	    }

	    // Method to accept records from the user
	    public void acceptRecord() {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter " + numbers.length + " integers to populate the array:");

	        for (int i = 0; i < numbers.length; i++) {
	            System.out.print("Enter value for index " + i + ": ");
	            numbers[i] = sc.nextInt(); // Accept values from the user
	        }
	    }

	    // Method to print the records (array elements)
	    public void printRecord() {
	        System.out.println("Array elements are:");
	        for (int i = 0; i < numbers.length; i++) {
	            System.out.println("numbers[" + i + "] = " + numbers[i]);
	        }
	    }

	    public static void main(String[] args) {
	        // Step 2: Create an instance of ArrayOperations with an array size
	        ArrayOps arrayOps = new ArrayOps(5);

	        // Step 3: Test the acceptRecord and printRecord methods
	        arrayOps.acceptRecord();  // Accept values from the user
	        arrayOps.printRecord();   // Print the values of the array
	    }
}
