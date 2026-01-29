import java.util.Scanner;

public class swapping_two_numbers_without_third_variable{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter number 1:");
        int n1=sc.nextInt();
        System.out.println(" Enter number 2:");
        int n2=sc.nextInt();
        n1=n1+n2;
        n2=n1-n2;
        n1=n1-n2;
        System.out.println("The numbers after swapping will be : "+ n1+" and " + n2);
        sc.close();
    }
}