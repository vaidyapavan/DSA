package java;
import java.util.*;

class Sum {
    void check() {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) { // Corrected loop condition
            sum = sum + i;
        }
        System.out.println("Sum of first " + n + " numbers is: " + sum);
    }
}

public class Sum_of_first_n_number {
    public static void main(String[] args) {
        Sum obj = new Sum();
        obj.check();
    }
}
