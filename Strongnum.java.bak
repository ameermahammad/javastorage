import java.util.Scanner;
class Strongnum 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		int sum=0,ld=0;
		int temp=num;
		while (num!=0)
		{
			ld=num%10;
			int factorial=1;
			for (int a=1;a<=ld ;a++ )
			{
			 factorial=factorial*a;
			}
			sum=sum+factorial;
			num=num/10;
		}
		num=temp;
		if (sum==temp)
		{
           System.out.println("srong number");
		}
		else
		{
			System.out.println("not a strong number");
		}
	}
}
