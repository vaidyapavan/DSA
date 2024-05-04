package Basic_java.copy;




class sum
{
	int sum=0;
	void add(int n)
	{
		for(int i=0;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("sum is:"+sum);
		
	}
	
}
public class SUM_of_n_element {

	
	public static void main(String[] args) {
		sum obj= new sum();
		obj.add(10);
		

	}

}
