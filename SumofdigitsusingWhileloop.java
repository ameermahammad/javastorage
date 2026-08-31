import java.util.Scanner;
class SumofdigitsusingWhileloop
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("enter a digit");
		int num=scan.nextInt();
		int sum=0;
		int last_digit;
		while (num!=0)
		{
			last_digit=num%10;
			sum=sum+last_digit;
			num=num/10;
		}
		System.out.println(sum);
	}
}
