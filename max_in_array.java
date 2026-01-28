public class max_in_array {
    public static void main(String[] args) {
        int[] arr={2,4,5,9,10};
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("The maximum number in the array is :"+max);
    }
}
