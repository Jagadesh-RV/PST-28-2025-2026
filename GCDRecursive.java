import java.util.Scanner;

public class GCDRecursive {

    static int gcd(int a, int b) {
        if (b == 0)
            return a;             
        return gcd(b, a % b);      
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = sc.nextInt();

        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        int result = gcd(x, y);
        System.out.println("GCD = " + result);
    }
}
