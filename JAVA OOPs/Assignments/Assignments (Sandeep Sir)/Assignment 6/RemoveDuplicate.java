package single.dimensional.array;

import java.util.*;

public class RemoveDuplicate {

	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        // Step 1: Accept the size of the array
	        System.out.print("Enter the number of elements in the array: ");
	        int n = sc.nextInt();
	        
	        // Step 2: Declare and input elements in the array
	        int[] num = new int[n];
	        System.out.println("Enter " + n + " integers:");
	        for (int i = 0; i < num.length; i++) {
	            System.out.print("Enter value for index " + i + ": ");
	            num[i] = sc.nextInt();
	        }
	        
	        // Step 3: Use a HashSet to remove duplicates
	        HashSet<Integer> uniqElements = new HashSet<>();
	        for (int value : num) {
	            uniqElements.add(value); // HashSet automatically removes duplicates
	        }
	        
	        // Step 4: Convert the HashSet back to an array (if needed)
	        Integer[] resultArray = uniqElements.toArray(new Integer[0]);
	        
	        // Step 5: Print the array after removing duplicates
	        System.out.println("Array after removing duplicates: " + Arrays.toString(resultArray));
	        
	        sc.close();
	    }
	
	}


