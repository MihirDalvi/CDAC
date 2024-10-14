
import java.util.*;
public class MaxHeap1 {

    static void  heapiFy (int [] arr, int n, int i ){
        int largest = i;

        int lc = 2*i +1;
        int rc = 2*i+ 2;

        if (lc < n && arr[lc] > arr[largest])
        {
            largest = lc;
        }

        if (rc < n && arr[rc] > arr[largest])
        {
            largest = rc;
        }
        if (i != largest)
        {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapiFy(arr, n, largest);
        }

        
    }

    static void buildHeap(int[] arr, int n) {
        // Start from the last non-leaf node and heapify all internal nodes
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapiFy(arr, n, i);
        }
    }
    public static void main (String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter szie of array");
        int n = sc.nextInt();
        int [] arr = new int [n];

        for (int i =0; i < n ; i++ )
        {
            arr[i]= sc.nextInt();
        }

        buildHeap(arr,n);

        System.out.println("max heap");
        for (int ele: arr){
            System.out.print(ele+",");
        }

    }
}
