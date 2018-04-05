package hello;

import java.util.Scanner;

public class Daimondpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size=0;
		char c;
			System.out.println("enter the size of pattern");
			size=sc.nextInt();	System.out.println("which character you want to use");
			 c = sc.next().charAt(0);
		       for (int row = 0;row < size ; row++){
		           //first print the space
		           for (int space = size - row ; space < size ; space ++){
		               System.out.print(" ");
		           }
		           //print the character
		           for (int i = 0 ; i<size ; i++){
		               System.out.print(c);
		           }
		           //add a newline
		           System.out.println();
		       }
	}

}
