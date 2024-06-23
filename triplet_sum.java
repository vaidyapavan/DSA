package Array;


class triplte
{
	int arr[]= {5,7,8,2,3,4,5,6,7,1,2,56,2};
	int n= arr.length-1;
	void sum()
	{
		int target_sum=10;
		int count=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if(arr[i]+arr[j]+arr[k]==target_sum)
					{
						count++;
						
                         System.out.println(arr[i] + ", " + arr[j] + ", " + arr[k]);
					}
				}
			}
		}
		System.out.println("no og trilets are: "+count);
	}
}
public class triplet_sum {

	public static void main(String[] args) {
		triplte obj = new triplte();
		obj.sum();
		
	}

}
