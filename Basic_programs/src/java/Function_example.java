import java.util.Scanner;
package java;
public class Function_example {
    
    // Method to calculate factorial
    static int factorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = scanner.nextInt();
        
        // Check if the number is non-negative
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            int result = factorial(number);
            System.out.println("Factorial of " + number + " is: " + result);
        }
        
    }
}
