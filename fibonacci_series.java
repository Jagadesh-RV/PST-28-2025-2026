import java.util.Scanner;
public class fibonacci_series{
	public static void main(String[] args) {
		System.out.println("Enter a number :");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int n1 = 0, n2 = 1;

        for (int i = 0; i < n; i++) {
            // Print the number
            System.out.print(n1 + " ");

            // Swap
            int n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
        }
	}
}
