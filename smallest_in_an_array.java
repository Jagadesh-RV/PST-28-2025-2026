import java.util.Scanner;

public class smallest_in_an_array{
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
       
        for(int i=0;i<len-1;i++){
            int temp=arr[i];
            if(arr[i]>arr[i+1]){
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }
        System.out.println("The smallest element in the given array is :"+arr[0]);
    }
}

