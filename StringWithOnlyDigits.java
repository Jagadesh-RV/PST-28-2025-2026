import java.util.Scanner;

public class StringWithOnlyDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        boolean isDigitOnly = true;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                isDigitOnly = false;
                break;
            }
        }

        if (isDigitOnly && str.length() > 0)
            System.out.println("String contains only digits");
        else
            System.out.println("String does NOT contain only digits");
    }
}
