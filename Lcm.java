import java.util.Scanner;
class Lcm
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
        System.out.println(" enter a number");
		int a=scan.nextInt();
		System.out.println(" enter b number");
		int b=scan.nextInt();
		int lcm=1;
		for (int i=1;i<=a&&i<=b;i++ )
		{
			if (a%i==0&&b%i==0)
			{
				lcm=i;
				lcm=(a*b)/lcm;
			} 
		}
		System.out.println("  Least common  value is:" +lcm);
	}
}
