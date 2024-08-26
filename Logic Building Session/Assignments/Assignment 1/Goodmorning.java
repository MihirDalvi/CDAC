import java.util.Scanner;

public class Goodmorning{
	public static void main(String[] args)
	{
		//String gm = "Good morning";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Time");
		int time = sc.nextInt();
		
		if(time>=5 && time<=12){
			System.out.println("Good Morning");
		}
		else
		{
			System.out.println("Hello");
		}
	}
}