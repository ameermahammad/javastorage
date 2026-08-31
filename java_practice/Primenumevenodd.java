import java.util.Scanner;
class Primenumevenodd 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		int count=0;
		for (int i=1;i<=num ;i++ )
		{
			if (num%i==0)
			{
				count++;
			}
		}
		if (count==2)
		{
			for (int j=1;j<=num ;j++ )
			{
				if (j%2==0)
				{
					System.out.println(j);
				}
			}
		}
		else
		{
			for (int k=1;k<=num ;k++ )
			{
				if (k%2!=0)
				{
					System.out.println(k);
				}
			}
		}
	}
}
