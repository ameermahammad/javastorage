import java.util.Scanner;
class Switch1 
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("enter direction number");
		int dno=scan.nextInt();
		switch (dno)
		{
		case 1:System.out.println("east");
		break;
		case 2:System.out.println("wet");
		break;
		case 3:System.out.println("north");
		break;
		case 4:System.out.println("south");
		break;
		default: System.out.println("enter valid input");

		
		}
	}
}
