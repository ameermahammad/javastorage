import java.util.Scanner;
class ProducofdigitsusingWhileloop
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("enter a digit");
		int num=scan.nextInt();
		int product=1;
		int last_digit;
		while (num!=0)
		{
			last_digit=num%10;
			product=product*last_digit;
			num=num/10;
		}
		System.out.println(product);
	}
}
