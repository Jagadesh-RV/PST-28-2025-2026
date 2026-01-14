import java.util.Scanner;

public class Recursion{

    static int factorial(int n) {
        if (n == 1) return 1;
        return n * factorial(n - 1);
    }

    static int sum(int n) {
        if (n == 0) return 0;
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Factorial");
        System.out.println("2. Sum from 1 to n");
        System.out.print("Choose option: ");
        int choice = sc.nextInt();

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        if (choice == 1) {
            System.out.println("Factorial = " + factorial(n));
        } else if (choice == 2) {
            System.out.println("Sum = " + sum(n));
        } else {
            System.out.println("Invalid choice");
        }
    }
}
