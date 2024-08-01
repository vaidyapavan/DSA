package DSA;

public class Binary_search {

    public static void main(String[] args) {
        int arr[] = {1, 7, 9, 45, 90, 100};
        int val = 9;

        int end = arr.length - 1; // Initialize end to the last index of the array
        int start = 0;
        int mid;

        while (start <= end) { // Condition should be start <= end
            mid = (start + end) / 2;

            if (arr[mid] == val) {
                System.out.println("Element is found at position: " + mid);
                return; // Exit the loop once the element is found
            } else if (val < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        System.out.println("Element is not present in the array.");
    }
}
