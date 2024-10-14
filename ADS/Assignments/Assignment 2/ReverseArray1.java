
import java.util.*;
public class ReverseArray1{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		
		int arr [] = new int[size];
		
		for (int i=0 ; i < size; i++){
			System.out.println("Enter array element");
			arr[i] = sc.nextInt();
		}
		
		int start = 0;
		int end = size-1;
		
		while(start < end){
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		
		System.out.println("Reversed array:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
		
		
	}
}
