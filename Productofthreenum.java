import java.util.Scanner;
class Productofthreenum 
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a= scan.nextInt();
		System.out.println("Enter 2nd number");
        int b= scan.nextInt();
		System.out.println("Enter 3rd number");
		int c= scan.nextInt();
		System.out.println("product of three numbers:"+(a*b*c));
	}
}
