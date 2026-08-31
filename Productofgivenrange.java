import java.util.Scanner;
class Productofgivenrange
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("enter min range");
		int a=scan.nextInt();
		System.out.println("enter max range");
		int c=scan.nextInt();
		int pro=1;
		for (int b=a; b<=c;b++ )
		{
		  pro=pro*b;
		    System.out.println(pro);	
		}
	}
}