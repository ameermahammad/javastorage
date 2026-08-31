import java.util.Scanner;
class Remock1 
{
	public static void main(String[] args) 
	{
		
		
		int a=0;
		int b=1;
		int c=0;
		for (int i=1;i<=20;i++ )
		{
			a=b;
			b=c;
			c=a+b;
			
			if (c>8&&c<=89)
			{
				System.out.println(c);
			}
		}
	}
}
