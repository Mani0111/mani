import java.util.Scanner;

public class Alpha {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		char[] c=s1.toCharArray();
		if(c[0]=='a' || c[0]=='e' || c[0]=='i' || c[0]=='o' || c[0]=='u')
			
		{
			System.out.println("Character "+" "+  c[0]  +" "+" is vowel");
			
		}
		else
		{ 
			System.out.println("Character "+" "+  c[0]  +" "+" is consonant");
		}
		

	}

}
