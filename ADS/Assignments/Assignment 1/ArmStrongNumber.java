import java.util.*;

public class ArmStrongNumber {

    public static double isArmstrong(int num, int power)
    {
        if (num ==0){
            return 0;
        }
        int remainder = num % 10;
        num = num /10;

        return Math.pow(remainder,power) + isArmstrong(num, power);

    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        int power = String.valueOf(num).length();

        String str1 = isArmstrong(num,power) == num ? "it is armStron no":"not a armStrong no";

        System.out.println(str1);
        sc.close();


    }
}
