import java.util.Scanner;
class Practice4
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter m value");
		int m=scan.nextInt();
		System.out.println("enter n value");
		int n=scan.nextInt();
		int pro=1;
		for (int a=m;a<=n ;a=a+2 )
		{
			
				pro=pro*a;
			
			
			System.out.println(a);

		}
		System.out.println(pro);

	}
}
