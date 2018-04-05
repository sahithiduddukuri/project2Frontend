package hello;

public class charExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "sahi";
		int count=0;
		char ch[]=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			System.out.println(ch[i]);
			count++;
		}
		System.out.println("Length of the string :"+count);
	}

}
