import java.util.Scanner;
class Areaofcircle
{
	public static void main(String[] args) 
	{
		double pie=3.14;
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter radious number");
		int a= scan.nextInt();
		double b= pie*a*a;
		 System.out.println("area of circle:"+b);
	}
}
