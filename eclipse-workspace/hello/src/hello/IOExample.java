package hello;
import java.io.*;
public class IOExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			FileInputStream fi = new FileInputStream("F:\\copydata\\hello.txt");
			int i = 0;
			while((i=fi.read())!=-1)// EOF
			{
				System.out.print((char)i);
			}
			fi.close();
			}
			catch(IOException e)
			{
			System.out.println(e.getMessage());
			}

			}
	}

