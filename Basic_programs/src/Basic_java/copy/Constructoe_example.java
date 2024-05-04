package Basic_java.copy;




class color
{
	String type1;
	color()   // Constructor
	{
		
	
		System.out.println("This is the constructor oc claanam ecolor:");
	}
	
	void type()
	{
		System.out.println("This is the function in parent class ");
	}
	
}
class blue extends color
{
	blue()
	{
		super.type();
		
		type1="red";
		System.out.println("This is the constructor of child class :");
		System.out.println("Value of type1 in is :"+type1);
		
		
	}
	
}
public class Constructoe_example {

	public static void main(String[] args) {
		
		//color obj= new color();
		blue obj2= new blue();
		obj2.type();
		

	}

}
