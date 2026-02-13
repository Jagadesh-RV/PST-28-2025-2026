import java.util.Scanner;

public class HollowSquarePattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                for (int j = 0; j < n; j++) {
                    System.out.print("*");
                }
            }
            else {
                for (int k = 0; k < n; k++) {

                    if (k == 0 || k == n - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
