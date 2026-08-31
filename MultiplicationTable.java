import java.util.Scanner;
class MultiplicationTable
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter multiplication number");
		int n=scan.nextInt();
	
		for (int b=1; b<=10;b++ )
		{
		  System.out.println(n+" * "+b+"="+b*n);
				
		}
	}
}
