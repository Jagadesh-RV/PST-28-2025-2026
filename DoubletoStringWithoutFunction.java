import java.util.Scanner;
public class DoubletoStringWithoutFunction{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a double value:");
        double d = sc.nextDouble();
        int digit=0;
        double temp = d;
        int intPart = (int)temp;
        
        
        int decimalPart = (int)(temp - intPart) ;
        int dp = decimalPart;
        System.out.println(decimalPart);
        while(dp >0){
            dp = dp/10;
            digit++;

        }
        
        String str = "";
        while(intPart > 0){
            int digitInt = intPart % 10;
            char chInt = (char)(digitInt + '0');
            str = chInt + str;
            intPart /= 10;
        }
      
        if(decimalPart > 0){
            str += ".";
            while(decimalPart > 0){
                int digitDecimal = decimalPart % 10;
                char chDecimal = (char)(digitDecimal + '0');
                str = str + chDecimal;
                decimalPart /= 10;
            }
        }

        System.out.println("The string representation of the double value is: " + str);
    }
}