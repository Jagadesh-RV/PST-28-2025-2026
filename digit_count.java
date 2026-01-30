import java.util.Scanner;

public class digit_count{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int digit=0;
        while(n!=0){
            n=n/10;
            digit++;
        }


        System.out.println("The number of digit in the given number is :"+ digit);
      
    }
}
