package Basic_java;
import java.util.*;



class perfect_no
{
	void percfct(int n)
	{
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(n==sum)
		{
			System.out.println(n+" is perfect number");
		}
		else
		{
			System.out.println(n+" is  not perfect number");
			
		}
		
	}
}
public class Perfect_number {

	public static void main(String[] args) {
		
		 perfect_no obj= new  perfect_no();
		 obj.percfct(6);

	}

}
