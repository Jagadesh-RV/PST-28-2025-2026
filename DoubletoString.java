import java.util.Scanner;
public class DoubletoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a double:");
        double num = sc.nextDouble();
        String str = num + "";
        System.out.println("The string representation of the double is: " + str);
    }
}