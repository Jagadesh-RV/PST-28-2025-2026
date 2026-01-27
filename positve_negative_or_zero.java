import java.util.Scanner;

public class positve_negative_or_zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a integer:");
        int n1 = sc.nextInt();
        if(n1>0){
            System.out.println("The integer is positve");
        }
        else if(n1<0){
            System.out.println("The integer is negative");
            
        }
        else{
            System.out.println("The integer is zero");
        }
     
        sc.close();
    }
}
