import java.util.Scanner;
class  Countofrepeatdigit
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a num");
		int num=scan.nextInt();
        System.out.println("enter a digit how many time is repeated");
		int x=scan.nextInt();
		int ld=0;
		int count=0;
		while (num!=0)
		{
			ld=num%10;
			if (ld==x)
			{
				count++;
			}
			num=num/10;
		}
		System.out.println(count);
	}
}
