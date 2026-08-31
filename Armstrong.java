import java.util.Scanner;
class Armstrong 
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		int temp=num;
		int count=0;
		while (num!=0)
		{
			count++;
			num=num/10;
		}
         System.out.println(count);
		num=temp;
		int sum=0, ld=0;
		while (num!=0)
		{
			ld=num%10;
			int exp=1;
			for (int a=1;a<=count ; a++)
			{
				exp=exp*ld;
			}
			sum=sum+exp;
			num=num/10;
		}
		num=temp;
		if (temp==sum)
		{
         System.out.println("armstrong");
		}
		else
		{
			System.out.println("not");
		}
	}
}
