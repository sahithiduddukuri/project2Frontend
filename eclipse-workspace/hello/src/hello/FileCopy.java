package hello;
import java.io.*;
public class FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			FileOutputStream f = new FileOutputStream("F:\\copydata\\copy.txt");
			String val = "India is a sub-continent";
			byte []arr = val.getBytes();
			f.write(arr);
			f.close();
			
		}
			catch(IOException e)
			{
			System.out.println(e.getMessage());
			}	
	}
}
