
import java.util.*;
public class MinHeap1 {

    static void  heapiFy (int [] arr, int n, int i ){
        int smallest = i;

        int lc = 2*i +1;
        int rc = 2*i+ 2;

        if (lc < n && arr[lc] < arr[smallest])
        {
            smallest = lc;
        }

        if (rc < n && arr[rc] < arr[smallest])
        {
            smallest = rc;
        }
        if (i != smallest)
        {
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
            heapiFy(arr, n, smallest);
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

        System.out.println("min heap");
        for (int ele: arr){
            System.out.print(ele+",");
        }

    }
}
