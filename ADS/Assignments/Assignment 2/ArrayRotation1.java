
import java.util.*;
public class ArrayRotation1 {

    static int[] rotation (int start, int end, int [] arr){
        while (start < end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
        return arr;
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter size of array");
        int size = sc.nextInt();
        int arr[] = new int[size];

        
        for (int i =0; i < size ; i++ )
        {
            System.out.println("enter element in to an array "+i+"position:");
            arr[i]=sc.nextInt();
        }
        System.out.println("no of rotation");
        int d = sc.nextInt();


        rotation(0, d-1, arr);
        rotation(d, size-1, arr);
        rotation(0, size-1, arr);

        System.out.println(Arrays.toString(arr));

    }
}
