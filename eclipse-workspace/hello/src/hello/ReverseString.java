package hello;

public class ReverseString {
	public static void main(String args[])
	{
		String str = "sweety";
		char ch[] = str.toCharArray();
		int count=0;
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.println(ch[i]);
			count++;
		}
		System.out.println("length of the string :"+count);
	}	

}
