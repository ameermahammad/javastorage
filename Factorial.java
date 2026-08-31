import java.util.Scanner;
class Factorial 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
        System.out.println("enter a number");
		int a=scan.nextInt();
		for (int b=1; b<=a;b++ )
		{
			if (a%b==0)
			{
				System.out.println(b);
			}
		}
	}
}
