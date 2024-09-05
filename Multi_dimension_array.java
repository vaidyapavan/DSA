package DSA;
import java.util.*;


class user_input {
     public void input() {
        Scanner s = new Scanner(System.in);
        int[][] arr = new int[3][3];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = s.nextInt();
            }
            System.out.println();
        }
        System.out.println(" the elements of the arrays are:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
       
    }
    
   
    	
    
}
public class Multi_dimension_array {

	public static void main(String[] args) {
		
		user_input obj =new user_input();
		obj.input();
		
		int[][] arr1= {
				{1,2,3},
				{6,7,8},
				{4,5,6}
		};
		int[][] arr2= {
				{7,8,9},
				{6,7,8},
				{1,2,3}
		};
		
		
		System.out.println(arr1[0][1]);
		System.out.println(arr1[0][2]);
		

	}

}
