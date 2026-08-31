import java.util.Scanner;
class Votingifelse
{
	public static void main(String[] args) 
	{
		
		System.out.println("enter your age");
		Scanner scan= new Scanner(System.in);
         int a= scan.nextInt();
		if(a>18)
		{
			System.out.println("elgible for voting");
		}
		else
		{
			System.out.println("not elgible for voting");
		}
	}
}
