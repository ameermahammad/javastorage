import java.util.Scanner;
class Grade 
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("enter your grade");
		char grade=scan.next().charAt(0);
		if (grade=='a')
		{
			System.out.println("your are got 1st rank");
		}
		else if(grade=='b')
		{
			System.out.println("your got 2nd rank");
		}
		else if (grade=='c')
		{
			System.out.println("you got 3rd rank");
		}
		else if (grade=='d')
		{
			System.out.println("your got 4th rank");
		}
		else if(grade=='e')
		{
			System.out.println("pass");
		}
		else if(grade=='f')
		{
			System.out.println("fail");
		}
		else
		{
			System.out.println("enter a valid input");
		}
	}
}
