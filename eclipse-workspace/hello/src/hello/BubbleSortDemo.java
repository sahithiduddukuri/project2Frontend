package hello;
import java.util.*;
import static java.lang.System.*;
public class BubbleSortDemo {
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
		int temp,i,k,size;
		out.println("Enter the size of an array");
		size=s.nextInt();
		int a[]= new int[size];
		for(i=0;i<size;i++)
		{
			out.println("Enter the elements at a"+"["+i+"]:");
			a[i]=s.nextInt();
		}
		out.println("Elements before sorting:");
		for(i=0;i<size;i++)
		{
			out.println("Element at a"+"["+i+"]:" +a[i]);
		}
		for(i=0;i<size;i++)
		{
			for(k=i+1;k<size;k++)
			{
				if(a[i]>a[k])
				{
					temp=a[i];
					a[i]=a[k];
					a[k]=temp;
				}
			}
		}
		out.println("Elements after sorting:");
		for(i=0;i<size;i++)
		{
			out.println("Element at a"+"["+i+"]:" +a[i]);
		}
	}
}