import java.util.Scanner;

public class MethodExample {
    static int calculateTotal(int m1, int m2, int m3) {
        return m1 + m2 + m3;
    }
    static double calculateAverage(int total) {
        return total / 3.0;
    }
    static String getGrade(double avg) {
        if (avg >= 90) return "A";
        else if (avg >= 75) return "B";
        else if (avg >= 60) return "C";
        else return "Fail";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Mark 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter Mark 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter Mark 3: ");
        int m3 = sc.nextInt();

        int total = calculateTotal(m1, m2, m3);
        double avg = calculateAverage(total);
        String grade = getGrade(avg);

        System.out.println("Total = " + total);
        System.out.println("Average = " + avg);
        System.out.println("Grade = " + grade);
    }
}
