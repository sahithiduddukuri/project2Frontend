package hello;
import java.util.*;
public class NumberPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
         
	        //Taking rows value from the user
	         
	        System.out.println("How many rows you want in this pattern?");
	         
	        int rows = sc.nextInt();
	         
	        System.out.println("Here is your pattern....!!!");
	         
	        for (int i = 1; i <= rows; i++) 
	        { 
	            for (int j = rows; j >= i; j--)
	            {
	                System.out.print(j+" ");
	            }
	             
	            System.out.println();
	        }
	         
	        //Closing the resources
	         
	        sc.close();
		       
	}

}