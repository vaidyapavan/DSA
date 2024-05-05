package java;



 class bublesort
{
	int arr[]= {90,67,5,100,500,1};
	int n= arr.length-1;
	void sort()
	{
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
	}
	void show()
	{
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		
	}
}
public class Bubble_sort {

	public static void main(String[] args) {
		bublesort obj= new bublesort();
		obj.sort();
		obj.show();
	}
		

	}

}
