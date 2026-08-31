import java.util.Scanner;
class Exponential 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter power value");
		int power=scan.nextInt();
        System.out.println("enter base value");
		int base=scan.nextInt();
		int count=0;
		int exp=1;
		for (int a=1;a<=power ;a++ )
		{
         exp=exp*base;
		 count++;
		}
        System.out.println(exp);
	}
}
