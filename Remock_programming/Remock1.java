import java.util.Scanner;
class Remock1 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a num1");
		int num1=scan.nextInt();
		System.out.println("enter a num2");
		int num2=scan.nextInt();
		
		int a=10;
		int b=11;
		int c=10;
		for (int i=num1;i<=num2 ;i++ )
		{
			
			if (num1>10)
			{
				a=b;
			b=c;
			c=a+b;
			System.out.println(c);
			}
		}
	}
}
