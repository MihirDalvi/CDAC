package single.dimensional.array;

import java.util.*;

public class TwoSingleDimArr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Step 1: Accept the size and elements of the first array
        System.out.print("Enter the number of elements in the first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter " + n1 + " elements for the first array:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("Enter value for index " + i + ": ");
            arr1[i] = sc.nextInt();
        }

        // Step 2: Accept the size and elements of the second array
        System.out.print("Enter the number of elements in the second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter " + n2 + " elements for the second array:");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("Enter value for index " + i + ": ");
            arr2[i] = sc.nextInt();
        }

        // Step 3: Find the intersection using HashSet
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();

        // Add all elements of the first array to set1
        for (int value : arr1) {
            set1.add(value);
        }

        // Check for elements of the second array in set1 and add to intersection
        for (int value : arr2) {
            if (set1.contains(value)) {
                intersection.add(value);  // Add to intersection if present in both arrays
            }
        }

        // Step 4: Print the intersection
        if (!intersection.isEmpty()) {
            System.out.println("Intersection of the two arrays: " + intersection);
        } else {
            System.out.println("No common elements between the two arrays.");
        }

        sc.close();
	}

}
