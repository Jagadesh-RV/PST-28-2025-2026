import java.util.Scanner;
public class InttoString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: "); 
        int number = scanner.nextInt();
        String str = Integer.toString(number);
        System.out.println("The string representation of the integer is: " + str);
    }
}