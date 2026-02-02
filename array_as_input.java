import java.util.Scanner;

public class array_as_input{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter element "+(i+1) +" in an array:");
            int num=sc.nextInt();
            arr[i]=num;
            
        }
        int len=arr.length;
        System.out.println("The elements in the given array are :");
        for(int i=0;i<len;i++){
            System.out.println(arr[i]);
        }
    }
}

