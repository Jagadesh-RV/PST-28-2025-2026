import java.util.Scanner;
public class length_of_string_without_length_method
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string:");
	    String str=sc.next();
	    int count=0;
	    try {
	         while(true){
	        str.charAt(count);
            count++;
	         }
	    } catch(Exception e) {
	    }
	    System.out.println("The length of the given strinng is:"+count);
	   
	}
}
