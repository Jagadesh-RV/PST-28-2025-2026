import java.util.Scanner;
public class stringReverse{
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = scanner.nextLine();
        String r = "";

        for (int i = 0; i < s.length(); i++){
            r = s.charAt(i) + r; 
        }
        System.out.println(r);
    }
}