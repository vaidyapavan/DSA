package Basic_java;

class FirstRepeat {
    void findFirstRepeatElement() {
        int number = 0;
        int arr[] = {1, 4, 6, 8, 9, 12, 8, 4};
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    number = arr[i];
                    System.out.println("First repeated number is: " + number);
                    return; // Exit the method once the first repeat is found
                }
            }
        }
        
        System.out.println("There is no repeated number in the array.");
    }
}

public class First_repeating_value_in_array{
    public static void main(String[] args) {
        FirstRepeat obj = new FirstRepeat();
        obj.findFirstRepeatElement();
    }
}
