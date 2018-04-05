package hello;
import java.io.*;
public class copyfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char []c= new char[100];
		int cLen= c.length;

		try(FileReader fr = new FileReader("F:\\copydata\\copy.txt");
		FileWriter fw = new FileWriter("F:\\copydata\\hello.txt"))
		{	

			int count =0; int read=0;
			while((read=fr.read(c))!= -1)
			{
				if(read<cLen)
					fw.write(c,0,read);


					count+= read;
			}
			System.out.println("Wrote "+ count+" chars");

		}
		catch(FileNotFoundException f)
		{
		System.out.println(f.getMessage());
		}
		catch(IOException e)
		{
		System.out.println(e.getMessage());
		}
	}
}
