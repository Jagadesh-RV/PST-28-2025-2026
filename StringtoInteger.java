import java.util.Scanner;
public class StringtoInteger{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        int result = Integer.parseInt(str);
        System.out.println("The integer value is: " + result);
    }
}