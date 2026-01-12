import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a day: ");
        int day= sc.nextInt();
        switch(day){
            case 1:
                System.out.println("Day 1 - Sunday is not a weekday");
                break;
            case 2:
                System.out.println("Day 2 - Monday is a weekday");
                break;
            case 3:
                System.out.println("Day 3 - Tuesday is a weekday");
                break;
            case 4:
                System.out.println("Day 4 - Wednesday is a weekday");
                break;
            case 5:
                System.out.println("Day 5 - Thursday is a weekday");
                break;
            case 6:
                System.out.println("Day 6 - Friday is a weekday");
                break;
            case 7:
                System.out.println("Day 7 - Saturday is a not a weekday");
                break;
            default:
                System.out.println("Invalid input");
        }
    }

    }
