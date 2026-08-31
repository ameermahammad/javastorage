import java.util.Scanner;
class CountMultiplication
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a min value");
		int a=scan.nextInt();
		System.out.println("enter a max value");
		int b=scan.nextInt();
		System.out.println("enter a multiplication value");
		int n=scan.nextInt();
		int count=0;
		for (int c=a;c<=b ; c++)
		{
			if (c%n==0)
			{
             System.out.println(c);
			 count++;
			}
		}
		System.out.println(count);
	}
}
