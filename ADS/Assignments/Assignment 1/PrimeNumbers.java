
import java.util.Scanner;
public class PrimeNumbers {

    static boolean isPrime(int num){
        if (num <= 1){
            return false;
        }
        if (num == 2)
        {
            return true;
        }
        if (num % 2 == 0 ) {
           return false; 
        } 


        for (int i = 3 ; i <= Math.sqrt(num); i++){
            if(num % i == 0)
            {
                return false;
            }
        }
        return true;
        
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        String str = isPrime(num) ? "number is "+num+" prime" : "number is not prime";
        System.out.println(str);

    }
}
