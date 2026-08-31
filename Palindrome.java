import java.util.Scanner;
class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		int reverse=0,ld=0,temp=num;
		while (num!=0)
		{
			ld=num%10;
			reverse=reverse*10+ld;
			num=num/10;
		}
		if (temp==reverse)
		{
			System.out.println("it is palindrome ");
		}
		else
		{
           System.out.println("it is  not palindrome ");
		}
	}
}
