import java.util.Scanner;
public class StringtoCharacterArray{
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a string:");
         String str = sc.nextLine();
         char[] charArray = str.toCharArray();
         System.out.println("The character array is:");
         for (char ch : charArray) {
             System.out.print(ch + " ");
         }
     }
}