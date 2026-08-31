import java.util.Scanner;
class Evenodd 
{
	public static void main(String[] args) 
	{
		System.out.println("enter a number");
		Scanner scan= new Scanner(System.in);
		int a= scan.nextInt();
		if(a%2==0)
		{
			System.out.println("even number");
		}
		else
		{
			System.out.println("odd number");
		}
	}
}
