import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num > 100) {
            System.out.println("The given number is greater than 100 ");
        } else {
            System.out.println("The number is smaller than 100");
        }

        sc.close();
    }
}
