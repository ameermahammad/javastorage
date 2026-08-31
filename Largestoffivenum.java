import java.util.Scanner;
class Largestoffivenum 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter five numbers");
		int large=0;
		for (int a=1;a<=5 ;a++ )
		{
			int n=scan.nextInt();
			if (n>large)
			{
				large=n;
			}
			System.out.println("largest of given five numbers: " +large);
		}
	}
}
