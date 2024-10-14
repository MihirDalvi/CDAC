
import java.util.Scanner;

public class SqrtIntApproximation {

    static int sqrt(int start, int end, int num) {
        if (num < 0) {
            return 0;
        }

        if (num == 0 || num == 1) {
            return num;
        }

        int ans = 0;
        
        while (start <= end) {
            int mid = (start + end) / 2;
            
            if (mid * mid == num) {
                return mid;
            }
            
            
            if (mid * mid < num) {
                start = mid + 1;
                ans = mid;
                // return sqrt(start, end, num);
            } else {

                end = mid - 1;
                // return sqrt(start, end, num);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sqRt = sqrt(1, num, num);
        System.out.println(sqRt);
        sc.close();
    }
}
