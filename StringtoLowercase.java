import java.util.Scanner;

public class StringtoLowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();

        String upper = s.toLowerCase();
        System.out.println("Lowercase string: " + upper);
    }
}
