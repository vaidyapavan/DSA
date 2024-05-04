package Basic_java.copy;
import java.util.*;


class input{
	Scanner s= new Scanner(System.in);
	int a,b,c;
	input()
	{
		System.out.println("enter the value of a abd b:");
		 a= s.nextInt();
		 b= s.nextInt();
		int c;
		
	}
	
}
class addition extends input
{
	void add()
	{
		 
		c=a+b;
		System.out.println("sum of "+a+" and "+b+" is:"+ c);
	}
}
public class Inheritance2 {

	public static void main(String[] args) {
		addition obj= new addition();
		obj.add();
		

	}

}
