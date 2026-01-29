import java.util.Arrays;
public class odd_even_count_in_array
{
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5};
		int n=arr.length;
		int odd=0,even=0;
		for(int i=0;i<n;i++){
		    if(arr[i]%2==0){
		        even=even+1;
		    }
		    else{
		        odd=odd+1;
		    }
		    
		}
		System.out.println("The odd count in the array is:"+odd);
		System.out.println("The even count in the array is:"+even);
	}
}
