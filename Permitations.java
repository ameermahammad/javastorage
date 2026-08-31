import java.util.Scanner;
class Permitations 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a selected elements");
		int p=scan.nextInt();
		System.out.println("enter a count of  elements");
		int r=scan.nextInt();
		int fact=1;
		for (int a=1;a<=p ;a++ )
		{
			fact=fact*a;
		}
		System.out.println(fact);
		int fact2=1;
		for (int b=1;b<=(p-r) ;b++ )
		{
			fact2=fact2*b;
		}
		System.out.println(fact/fact2);
		
		
	}
}
