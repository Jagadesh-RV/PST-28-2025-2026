import java.util.Scanner;
public class stringPalindrome{
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = scanner.nextLine();
        String r = "";

        for (int i = 0; i < s.length(); i++){
            r = s.charAt(i) + r; 
        }
        if(s.equals(r)){
            System.out.println("The given string is a palindrome");
        }
        else{
            System.out.println("The string is not a palindrome");
        }
    }
}