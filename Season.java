
import java.util.Scanner;
class Season
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("enter your season name");
		int season=scan.nextInt();
		switch(season)
		{
			case 1:System.out.println("winter");
			break;
			case 2:System.out.println("winter");
			break;
			case 3:System.out.println("summer");
			break;
			case 4:System.out.println("summer");
			break;
			case 5:System.out.println("summer");
			break;
			case 6:System.out.println("rain");
			break;
			case 7:System.out.println("rain");
			break;
			case 8:System.out.println("rain");
			break;
			case 9:System.out.println("spring");
			break;
			case 10:System.out.println("spring");
			break;
			case 11:System.out.println("spring");
			break;
			case 12:System.out.println("winter");
			break;
            default :System.out.println("enter valid input");
		}
	}
}
