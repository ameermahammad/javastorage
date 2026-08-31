import java.util.Scanner;
class Bill 
{
	 public static void main(String[] args) 
	{
		 Scanner scan= new Scanner(System.in);
		System.out.println("enter a bill");
		double bill= scan.nextDouble();
		if(bill>=5000)
		{
            System.out.println("final paybill" +bill*0.75);
		}
		else
		{
			System.out.println("final paybill bill"+bill*0.90);
		}
		

	}
}
