import java.util.Scanner;

public class sum_of_digits{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n=sc.nextInt();
        int n1=0;
        while(n!=0){
            n1=n1+(n%10);
            n=n/10;
            
        }
        System.out.println("The sum of digits of the given number is : "+n1);
        sc.close();
    }
}