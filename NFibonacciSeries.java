import java.util.Scanner;
class NFibonacciSeries 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
        System.out.println("enter a num");
		int n=scan.nextInt();
		int a=0;
		int b=1;
		int sum=0;
		for (int i=1;i<=n ;i++ )
		{
			System.out.println(sum);
			a=b;
			b=sum;
			sum=a+b;
		}
	}
}
