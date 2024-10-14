import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicate1 {


    static int removeDuplicate(int[] arr, int size) {
        if (size == 0) {
            return 0;
        }

        int j = 0; 


        for (int i = 1; i < size; i++) {
 
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }
        
        return j + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        

        int[] arr = new int[size];
        

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }


        Arrays.sort(arr);
        

        int newLength = removeDuplicate(arr, size);
        

        System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOf(arr, newLength)));
        System.out.println(newLength);
        
        sc.close(); 
    }
}
