import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a mark: ");
        int mark = sc.nextInt();
        if(mark>=90){
            System.out.println("A grade is achieved");
        }
        else if(mark>=75){
            System.out.println("B grade is achieved");
        }
        else if(mark>=50){
            System.out.println("C grade is achieved");
        }
        else if(mark<50){
            System.out.println("Fail");
        }
        else{
            System.out.println("Invalid input");
        }
    }

    }
