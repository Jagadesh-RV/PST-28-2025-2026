import java.util.Scanner;

public class Palindrome_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original = n;  
        int rn = 0;

        while (n > 0) {
            rn = rn * 10 + (n % 10);
            n = n / 10;
        }

        if (original == rn) {
            System.out.println("The given number is a palindrome");
        } else {
            System.out.println("The given number is not a palindrome");
        }

        sc.close();
    }
}
