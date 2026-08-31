import java.util.Scanner;
class FirstNFibonacciSeries 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
        System.out.println("enter a num");
		int n=scan.nextInt();
		int x=0;
		int fc=1;
		while (fc<=n)
		{
		int a=0;
		int b=1;
		int sum=0;
		for (int i=1;i<=x ;i++ )
		{
			System.out.println(sum);
			a=b;
			b=sum;
			sum=a+b;
			if (i==x)
			{
			 System.out.println(x);
			  fc++;
			}
			x++;
		}
		}
	}
}
