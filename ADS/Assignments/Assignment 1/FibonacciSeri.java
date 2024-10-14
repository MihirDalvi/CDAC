import java.util.Scanner;

public class FibonacciSeri {
    static void FibSeries(int a, int b, int num) {
        if (num == 0) return;
        
        System.out.print(a);
        if (num > 1) {
            System.out.print(", "); 
        }
        
        FibSeries(b, a + b, num - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Fibonacci terms to display: ");
        int num = sc.nextInt();

        if (num <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            FibSeries(0, 1, num);
        }

        sc.close();
    }
}
