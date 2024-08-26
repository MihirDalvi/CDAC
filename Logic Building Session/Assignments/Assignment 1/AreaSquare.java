import java.util.Scanner;

	public class AreaSquare{
		public static void main(String[] args)
		{
			System.out.println("Enter a length: ");
			Scanner obj = new Scanner(System.in);
			int area = obj.nextInt();
			System.out.println("Area of Square is "+area*area);
			
		}
}