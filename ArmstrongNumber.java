import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original = n;
        int digits = 0;
        int sum = 0;

        int temp = n;
        while (temp != 0) {
            digits++;
            temp /= 10;
        }

        temp = n;
        while (temp != 0) {
            int r = temp % 10;
            sum += Math.pow(r, digits);
            temp /= 10;
        }

        if (sum == original) {
            System.out.println("The given number is an Armstrong number");
        } else {
            System.out.println("The given number is not an Armstrong number");
        }
    }
}
