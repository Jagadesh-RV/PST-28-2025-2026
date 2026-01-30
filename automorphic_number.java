import java.util.Scanner;

public class automorphic_number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int s=0;
        s=((n*n)%100);
        if(n==s) {
             System.out.println("The given number is a automorphic number");
        }
        else{
            System.out.println("The given number is not a automorphic number");
        }

       
      
    }
}
