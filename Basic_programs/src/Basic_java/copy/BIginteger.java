package Basic_java.copy;

import java.math.BigInteger;
import java.util.Scanner;

public class BIginteger{

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
       
        BigInteger a = s.nextBigInteger();

        BigInteger b = s.nextBigInteger();
         
        BigInteger sum = a.add(b);
        BigInteger mul = a.multiply(b);
        
        System.out.println( sum);
        System.out.println( mul);
        
        s.close(); // close the scanner
    }
}
