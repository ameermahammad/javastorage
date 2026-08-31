import java.util.Scanner;
class Iasexam
{
	public static void main(String[] args) 
	{
		
		System.out.println("enter your age");
		Scanner scan= new Scanner(System.in);
         int a= scan.nextInt();
		if(a>22)
		{
			System.out.println("elgible for ias exam");
		}
		else
		{
			System.out.println("not elgible for ias exam");
		}
	}
}
