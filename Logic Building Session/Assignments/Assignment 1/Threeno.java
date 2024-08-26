import java.util.*;

	class Threeno{
		public static void main(String[] arg)
		{
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("Enter First Number: ");
			int n1 = scanner.nextInt();
			System.out.println("Enter Second Number: ");
			int n2 = scanner.nextInt();
			System.out.println("Enter Third Number: ");
			int n3 = scanner.nextInt();
			
			if(n1>n2 && n1>n3)
			{
				System.out.println("First Number is Largest");
			}
			else if(n3>n2 && n3>n1)
			{
				System.out.println("Third Number is Largest");
			}
			else 
			{
				System.out.println("Second Number is Largest");
			}
		}
}