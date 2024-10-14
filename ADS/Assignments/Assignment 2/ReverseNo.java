
import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        int reversedNum = 0;
        
        int sign = (num < 0) ? -1 : 1;
        num = Math.abs(num);
        while (num != 0) {
            int lastDigit = num % 10;
            reversedNum = reversedNum * 10 + lastDigit;
            num = num / 10; 
        }
        reversedNum = reversedNum * sign;
        System.out.println("Reversed Number: " + reversedNum);
        
        sc.close();
    }
}
