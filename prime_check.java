import java.util.Scanner;

public class prime_check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int c=0;
        if(n%2==0){
            c=c+1;
        }
        if(n%3==0){
            c=c+1;
        }
        if(n%5==0){
            c=c+1;
        }
        if(c<2){
            System.out.println("The number "+n+" is a prime number");
        }
        else{
            System.out.println("The number is not a prime");
        }
        sc.close();
    }
}
