package hello;
import java.util.*;
public class ArrayOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int sum=0;
		int a[]=null;
		System.out.println("Enter size of an array");
		int size=s.nextInt();
		for(int i=0;i<size;i++)
		{
			System.out.println("Enter elements at a "+" [ "+ i +" ] :" );
			a[i]=s.nextInt();
		}
		System.out.print("=====");
		for( int i=0;i<size;i++)
		{
			sum=sum+a[i];
			System.out.println("Elements stored at a "+" [ "+ i +" ] : " + a[i]);
		}
		System.out.println("sum of array elements :" +sum);
	}
}
