package Basic_java.copy;



	
	
	class Arithmetic {
	    
	    int add(int a,int b)
	    {
	       
	         return a+b;
	         
	         
	          
	        
	        
	    }
	}
	class Adder extends Arithmetic
	{
	    
	    Adder()
	    {
	        
	    }
	    
	}
	public class Getname_of_superclass {

	    public static void main(String[] args) {
	        
	        
	        Adder adder=new Adder();
	        
	         System.out.println("My superclass is: " + adder.getClass().getSuperclass().getName());
	         int sum = adder.add(42, 13);
	    System.out.println("42 13 20");
	         
	        
	  
	    }
	}
