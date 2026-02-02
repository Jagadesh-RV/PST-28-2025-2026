import java.util.Scanner;

public class HCFofTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();
        int min=Math.min(n1,n2);
        int d=0;
        for(int i=min;i>0;i--){
            if((n1%i==0) && (n2%i==0)){
                if(d<i){
                    d=i;
                }
            }
        }
        System.out.println("The HCF of the given numbers is : "+d);
    }
}

