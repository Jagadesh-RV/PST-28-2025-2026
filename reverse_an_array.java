import java.util.Arrays;
public class reverse_an_array
{
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5};
		int n=arr.length;
		for(int i=0;i<n/2;i++){
		    int temp=arr[n-i-1];
		    arr[n-1-i]=arr[i];
		    arr[i]=temp;
		    
		}
		System.out.println("The reversed array is:"+Arrays.toString(arr));
	}
}
