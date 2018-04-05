package hello;

import java.util.Scanner;

public class VowelConsonent {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character");
		char ch = sc.next().charAt(0);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		{
			System.out.println("Entered character is vowel");
		}
		else
			System.out.println("Entered character is consonent");
	}
}
