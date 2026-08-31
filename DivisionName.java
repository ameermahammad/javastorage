import java.util.Scanner;
class DivisionName 
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("enter your division number");
		int dno= scan.nextInt();
		if (dno==1)
		{
          System.out.println(" your division name is:-east");
		}
		else if (dno==2)
		{
          System.out.println(" your division name is:-west");
		}
		else if (dno==3)
		{
          System.out.println(" your division name is:-north");
		}
		else if (dno==4)
		{
          System.out.println(" your division name is:-south");
		}
		else if (dno==5)
		{
          System.out.println(" your division name is:-north_east");
		}
		else
		{
			 System.out.println("enter valid input");
		}

	}
}
