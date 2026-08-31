import java.util.Scanner;
class Practice5
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter m value");
		int m=scan.nextInt();
		System.out.println("enter n value");
		int n=scan.nextInt();
		int sum=0;
		for (int a=m;a<=n ;a=a+2 )
		{
				sum=sum+a;
			

			System.out.println(a);
		}
		System.out.println(sum);

	}
}
