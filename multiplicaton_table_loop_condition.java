import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num=sc.nextInt();
        for(i=1;i<=20;i++){
            System.out.println(i+"*"+num+"="+(i*num));
        }
    
    }

}
