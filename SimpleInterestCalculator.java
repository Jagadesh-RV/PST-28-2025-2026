import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter amount :");

        double P = sc.nextDouble();
        System.out.println("Enter rate of interest :");
        double R = sc.nextDouble();
        System.out.println("Enter time period:");
        double T = sc.nextDouble();

        double SI = (P * R * T) / 100;

        System.out.println("The simple interest amount is :"+SI);

        sc.close();
    }
}