
import java.util.Scanner;

public class LeapYear1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        String result = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) 
                        ? year + " is a leap year" 
                        : year + " is not a leap year";

        System.out.println(result);
        sc.close();
    }
}
