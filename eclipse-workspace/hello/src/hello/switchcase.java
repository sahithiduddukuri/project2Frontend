package hello;
import java.util.Scanner;
public class switchcase {
	public static void main(String args[])
	{
		int a,b;
		String ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of a ::");
		a=sc.nextInt();
		System.out.println("enter the value of b ::");
		b=sc.nextInt();
		System.out.println("add for addition");
		System.out.println("sub for subtraction");
		System.out.println("Div for division");
		System.out.println("Mul for Multiplication");
		System.out.println("please enter your appropriate choice");
		ch=sc.next();
		switch(ch)
		{
		case "add" : System.out.println("sum of a and b ::" +(a+b));
					 break;
					 
		case "sub" : System.out.println("sub of a and b ::" +(a-b));
		  			 break;
		
		case "Div" : System.out.println("Div of a and b ::" +(a/b));
		 			 break;
		 			 
		case "Mul" : System.out.println("Mul of a and b ::" +(a*b));
		 		     break;		
		 		     
		 default : System.out.println("Sorry you entered wroung choice");
					 break;
		}
	}
}
