import java.util.Scanner;
class Nprimenumber 
{
	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		int x=2;
		int pc=1;
		while (pc<=num)
		{
			int count=0;
			for (int a=1;a<=x ;a++ )
			{
				if (x%a==0)
				{
					count++;
				}
			}
			if (count==2)
			{
				System.out.println(x);
				pc++;
			}
			x++;
		}
	}
}
