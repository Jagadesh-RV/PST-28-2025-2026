import java.util.Scanner;
public class ChartoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch = sc.next().charAt(0);
        String result = Character.toString(ch);
        System.out.println("The string value is: " + result);
    }
}