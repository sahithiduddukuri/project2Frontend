package hello;
import java.io.*;
public class Armstrong {
public static void main(String args[])
{
	int n,r,sum;
	n=153;
	int temp=n;
	sum=0;
	while(n>0)
	{
		r=n%10;
		sum=sum+r*r*r;
		n=n/10;
	}
	if(temp==sum)
	{
		System.out.println("Number is armstrong number");
	}
	else
	{
		System.out.println("numbers not a armstrong number");
	}
}
}
