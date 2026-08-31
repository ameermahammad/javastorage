import java.util.Scanner;
class MultipleofNusingWhile 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enteer min value");
		int a=scan.nextInt();
		System.out.println("enterr min value");
		int b=scan.nextInt();
		System.out.println("enterr multiple of number");
		int n=scan.nextInt();
		int c=a;
		while (c<=b)
		{
			if (c%n==0)
			{
				System.out.println(c);
			}
			c++;
		}
	}
}
