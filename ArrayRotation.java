public class ArrayRotation {
    public static void leftRotateByOne(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }

        int firstElement = arr[0]; 
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1]; 
        }

        arr[arr.length - 1] = firstElement; 
    }

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        System.out.println("Original Array: " + java.util.Arrays.toString(originalArray));

        leftRotateByOne(originalArray);

        System.out.println("Array after one left rotation: " + java.util.Arrays.toString(originalArray));
    }
}
