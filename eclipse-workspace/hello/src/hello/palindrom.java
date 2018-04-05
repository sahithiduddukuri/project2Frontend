package hello;

public class palindrom {

	public static void main(String[] args) {
		
		int n,r,sum;
		n=121;
	    int  temp=n;
		sum=0;
		while(n>0)
		{
			r=n%10;
			n=n/10;
			sum=10*sum+r;
			
		}
		if(temp==sum)
		{
			System.out.println("Number is palindrom");
		}
		else
		{
			System.out.println("Number is not a palindrom");
		}

	}

}
