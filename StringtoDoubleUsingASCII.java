import java.util.Scanner;
public class StringtoDoubleUsingASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");  
        String str = sc.nextLine();
        double result = 0.0;
        boolean isNegative = false;
        int i = 0;
        if (str.charAt(0) == '-') {
            isNegative = true;
            i = 1;
        }
        while (i < str.length() && str.charAt(i) != '.') {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                result = result * 10 + (ch - '0');
            } else {
                System.out.println("Invalid input");
                return;
            }
            i++;
        }
        if (i < str.length() && str.charAt(i) == '.') {
            i++;
            double decimalPlace = 1.0;
            while (i < str.length()) {
                char ch = str.charAt(i);
                if (ch >= '0' && ch <= '9') {
                    decimalPlace /= 10.0;
                    result += (ch - '0') * decimalPlace;
                } else {
                    System.out.println("Invalid input");
                    return;
                }
                i++;
            }
        }
        if (isNegative) {
            result = -result;
        }
        System.out.println("The double value is: " + result);
    }
}