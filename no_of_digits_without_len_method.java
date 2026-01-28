import java.util.Scanner;

public class no_of_digits_without_len_method {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int temp;
        int c=0;
        while(n!=0){
            n=n/10;
            c=c+1;
        }
        System.out.println("The number of digits in the given number is :"+c);
        sc.close();
    }
}
