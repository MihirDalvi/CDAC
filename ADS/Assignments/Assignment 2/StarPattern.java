
import java.util.Scanner;

public class StarPattern {

   
    static int pattern(int rows, int currentRow) {
        
        if (currentRow > rows) {
            return 0;
        }

       
        for (int i = 0; i < currentRow; i++) {
            System.out.print("* ");
        }
        System.out.println();

        
        return pattern(rows, currentRow + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        pattern(rows, 1);

        sc.close();
    }
}
