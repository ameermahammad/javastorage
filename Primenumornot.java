import java.util.Scanner;
class Primenumornot 
{
	
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
        System.out.println("enter a number");
		int n=scan.nextInt();
		int count=0;
		for (int a=1;a<=n ; a++)
		{
			if (n%a==0)
			{
				count++;
			}
		}
		if (count==2)
		{
			System.out.println("prime number");
		}
		else
		{
			System.out.println("not");
		}
		System.out.println(count);
	}
}
