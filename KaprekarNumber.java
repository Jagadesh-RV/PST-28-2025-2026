
import java.util.Scanner;

public class KaprekarNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int square = n*n ;
        int digits = 0;

        int temp = square;
        while (temp != 0) {
            digits++;
            temp /= 10;
        }
        temp = square;
        int left_part = (int) (temp % ((int) Math.pow(10, (digits / 2))));
        int right_part=temp/((int) Math.pow(10, (digits / 2)));
        if ((left_part+right_part)==n) {
            System.out.println("The given number is a Kaprekar number");
        } else {
            System.out.println("The given number is not a Kaprekar number");
        }
    }
}

        
