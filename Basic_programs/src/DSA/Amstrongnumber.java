package DSA;
import java.util.*;

public class Amstrongnumber {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		int n;
		System.out.println("enter the number:");
		
		n= s.nextInt();
		int originalno;
		originalno=n;
		int count=0;
		while(n>0)
		{
			int rem = n%10;
			n=n/10;
			count=count+(rem*rem*rem);
			
		}
		if(count==originalno)
		{
			System.out.println("is Amstrong number");
			
		}
		else
		{
			System.out.println("is not amstrong number");
		}
		
	
	}

}
