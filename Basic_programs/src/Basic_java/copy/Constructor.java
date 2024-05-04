package Basic_java.copy;




class add
{
	int a,b;
	 public float sum;
	add()
	{
		a=20;
	     b=60;
		
	}
	
	void addition()
	{
		sum=a+b;
	}
}
public class Constructor {

	public static void main(String[] args) {
		
		add obj =new add();
		obj.addition();
		System.out.println("sum is:"+obj.sum);
		

	}

}
