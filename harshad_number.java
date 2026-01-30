import java.util.Scanner;

public class harshad_number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int digit_sum=0;
        int dn=n;
        while(dn!=0){
            digit_sum+=dn%10;
            dn=dn/10;
        }
        if(n%digit_sum==0) {
             System.out.println("The given number is a harshad number");
        }
        else{
            System.out.println("The given number is not a harshad number");
        }

       
      
    }
}
