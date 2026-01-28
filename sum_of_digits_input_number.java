import java.util.Scanner;

public class sum_of_digits_input_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int temp,sum;
        sum=0;
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        while(n!=0){
            temp=n%10;
            sum=sum+temp;
            n=n/10;
        }
        System.out.println("The sum of digits of the given number is:"+sum);
        sc.close();
    }
}
