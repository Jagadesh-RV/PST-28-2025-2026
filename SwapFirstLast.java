import java.util.Scanner;

public class SwapFirstLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = sc.nextLine();

        if (str.length() <= 1) {
            System.out.println("Swapped string: " + str);
            return;
        }

        char first = str.charAt(0);
        char last = str.charAt(str.length() - 1);

        String middle = str.substring(1, str.length() - 1);

        String result = last + middle + first;

        System.out.println("Swapped string: " + result);
    }
}
