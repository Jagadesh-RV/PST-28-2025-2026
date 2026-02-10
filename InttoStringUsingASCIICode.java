import java.util.Scanner;
public class InttoStringUsingASCIICode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: "); 
        int number = scanner.nextInt();
        String str = "";
        while(number > 0) {
            int digit = number % 10;
            char ch = (char)(digit + '0');
            str = ch + str;
            number /= 10;
        }
        System.out.println("The string representation of the integer is: " + str);
    }
}  