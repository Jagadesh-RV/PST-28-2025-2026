import java.util.Scanner;

public class sum_and_average_of_marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter subject 1 mark:");
        int m1 = sc.nextInt();
        System.out.println("Enter subject 2 mark:");
        int m2 = sc.nextInt();
        System.out.println("Enter subject 3 mark:");
        int m3 = sc.nextInt();
        System.out.println("The sum of three subject mark is:"+(m1+m2+m3));
        System.out.println("The average of three subject mark is :"+((m1+m2+m3)/3));
        
        sc.close();
    }
}
