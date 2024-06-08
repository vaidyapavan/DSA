package DSA;

class BubbleSort {
    int arr[] = {45, 90, 78, 12, 43, 70, 56, 100, 500, 1};
    int n = arr.length;

    void sort() {
    	
    	
        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) { 
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Array after sorting:");
    }

    void show() {
        for (int i = 0; i < n; i++) { // Corrected loop condition
            System.out.print(arr[i] + " ");
        }
    }
}

public class Bubble_sort {
    public static void main(String[] args) {
        BubbleSort obj = new BubbleSort();
        obj.sort();
        obj.show();
    }
}
