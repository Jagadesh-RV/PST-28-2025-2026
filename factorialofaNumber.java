import java.util.Scanner;

public class factorialofaNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n=sc.nextInt();
        int f=1;
        for(int i=n;i>0;i--){
            f=f*i;
        }
        System.out.println("The factorial of the given number is : "+f);
        sc.close();
    }
}