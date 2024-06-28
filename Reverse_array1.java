package Basic_java;

class ArrayReverse {
    void reverse() {
        int arr[] = {1, 4, 6, 8, 9, 12, 8, 4};
        int j = arr.length - 1;
        for (int i = 0; i < j; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        System.out.println("Array elements after reversing:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // Add a new line for clarity
    }
}

public class Reverse_array1 {
    public static void main(String[] args) {
        ArrayReverse obj = new ArrayReverse();
        obj.reverse();
    }
}
