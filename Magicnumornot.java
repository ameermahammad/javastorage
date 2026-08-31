import java.util.Scanner;
class Magicnumornot 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		if (num%9==1)
		{
			System.out.println("magic number");

		}
		else
		{
			System.out.println("not a magic number");
		}
	}
}
