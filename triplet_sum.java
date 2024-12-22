package Array;

class Triplet {
    int arr[] = {5, 7, 8, 2, 3, 4, 5, 6, 7, 1, 2, 56, 2};
    int n = arr.length; // Corrected length calculation

    void sum() {
        int target_sum = 10;
        int count = 0;

        // Iterate over all possible triplets
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == target_sum) {
                        count++;
                        System.out.println(arr[i] + ", " + arr[j] + ", " + arr[k]);
                    }
                }
            }
        }
        System.out.println("Number of triplets: " + count);
    }
}

public class TripletSum {
    public static void main(String[] args) {
        Triplet obj = new Triplet();
        obj.sum();
    }
}
