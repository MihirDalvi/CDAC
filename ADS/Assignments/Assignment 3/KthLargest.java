
import java.util.PriorityQueue;
import java.util.Scanner;

public class KthLargest {

    static int findKthLargest(int[] stream, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        for (int num : stream) {
            if (minHeap.size() < k) {
                minHeap.add(num);
            } else {
                if (num > minHeap.peek()) {
                    minHeap.poll();
                    minHeap.add(num);
                }
            }
        }
        return minHeap.peek();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the stream:");
        int n = sc.nextInt();
        int[] stream = new int[n];

        System.out.println("Enter the elements of the stream:");
        for (int i = 0; i < n; i++) {
            stream[i] = sc.nextInt();
        }

        System.out.println("Enter the value of k:");
        int k = sc.nextInt();

        int result = findKthLargest(stream, k);
        System.out.println("The " + k + "th largest element in the stream is: " + result);
    }
}
