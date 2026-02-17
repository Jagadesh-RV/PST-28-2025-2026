import java.util.Scanner;

public class LeapYear{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" To check Leap year or not :
                           Enter year :");
        int y=sc.nextInt();
        if((y%400==0)||(y%4==0)&&(y%100!=0)){
            System.out.println("The given year is a leap year ");
        }
        else {
            System.out.println("The given year is not a leap year ");
        }
        sc.close();
    }
}
