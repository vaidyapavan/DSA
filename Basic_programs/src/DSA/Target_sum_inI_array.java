package DSA;
import java.util.*;

class pair_of_sum
{
	void find_pair()
	{
		int tardet_sum;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the targeted digit number:");
		tardet_sum=s.nextInt();
		int arr[]= {1,4,6,8,96,7,8,90,5,6,7,8,9,1,2,3,4,5,6,7};

		
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1; j<arr.length;j++)
			{
				if(arr[i]+arr[j]==tardet_sum)
				{
					count++;
				}
			}
			
		}
		System.out.println("total no of pairs whose sum is "+tardet_sum+" are "+count);
	}
	
}

public class Target_sum_inI_array {

	public static void main(String[] args) {
		pair_of_sum obj= new pair_of_sum();
		obj.find_pair();
		
	}

}
