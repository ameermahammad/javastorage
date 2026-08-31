import java.util.Scanner;
class Perfect1to100 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		int sum=0;
		for (int i=1;i<num ;i++ )
		{
			if (num%i==0)
			{
				sum=sum+i;
			}
		}
		if (sum==num)
		{
			System.out.println("perfect num");
		}
		else
		{
			System.out.println("not");
		}
	}
}
