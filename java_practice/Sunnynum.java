import java.util.Scanner;
class Sunnynum 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter your number");
		int n=scan.nextInt();
		n++;
		boolean status=false;
		for (int a=1;a<n ;a++ )
		{
			if (a*a==n)
			{
				status=true;
					break;
			}
		}
		if (status)
		{
			System.out.println("sunny number");
		}
		else
		{
			System.out.println(" not a sunny number");
		}
	}
}
