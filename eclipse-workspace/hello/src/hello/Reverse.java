package hello;

public class Reverse {

	public static void main(String[] args) {
		int n, r, sum;
		
		n=123;
		sum=0;
		while(n>0)
		{
			r=n%10;
			sum=10*sum+r;
			n=n/10;
		}
		System.out.println("Reverse of a number :" +sum);
	}

}
