import java.util.Scanner;
public class StringtoDouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");  
        String str = sc.nextLine();
        double result = Double.parseDouble(str);   
        System.out.println("The double value is: " + result);
    }
}