import java.util.Scanner;

public class float_area_of_circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius value:");
        float r = sc.nextFloat();
        System.out.println("The area of the circle for given radius is: " + (3.14*r*r));

        sc.close();
    }
}
