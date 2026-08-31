import java.util.Scanner;
class ProductofdigitsNum 
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("enter a digit");
		int x=scan.nextInt();
		int  div, pro=1;
		for (int a=1;a<=x;x=x/10 )
		{
			div=x%10;
			pro=pro*div;
			
		}
		System.out.println(pro);
	}
}
