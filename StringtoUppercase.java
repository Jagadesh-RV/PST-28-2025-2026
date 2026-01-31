import java.util.Scanner;

public class StringtoUppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();

        String upper = s.toUpperCase();
        System.out.println("Uppercase string: " + upper);
    }
}
