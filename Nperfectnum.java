import java.util.Scanner;
class Nperfectnum 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scan.nextInt();
		int x=1;
		int pc=1;
		while (pc<n)
		{
			int sum=0;
			for (int a=1;a<x ;a++ )
			{
				if (x%a==0)
				{
					sum=sum+a;
				}
			}
				if (sum==x)
				{
				 System.out.println(x);
				 pc++;
				}
				x++;
		}
		
	}
}
