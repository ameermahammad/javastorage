import java.util.Scanner;
class Parkfee 
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("enter your category name");
		String category=scan.next();
		switch(category)
		{
			case "male":System.out.println("fee is 100 rupees");
			break;
			case "female":System.out.println("fee is 80rupees");
			break;
			case "transgrnder":System.out.println("fee is 30 rupees");
			break;
			case "children":System.out.println("fee is 20 rupees");
			break;
			case "senior_citizen":System.out.println("fee is  free");
			break;
			default :System.out.println("enter valid input");
		}
	}
}
