import java.util.Scanner;

public class strong_number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum=0;
        int dn=n;
        while(dn!=0){
            int m=1;
            int f=dn%10;
            for(int i=1;i<=f;i++){
                m=m*i;
            }
            sum=sum+m;
            dn=dn/10;
            
        }
        if(n==sum){
             System.out.println("The given number is a strong number");
        }
        else{
            System.out.println("The given number is not a strong number");
        }

       
      
    }
}
