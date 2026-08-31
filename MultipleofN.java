import java.util.Scanner;
class MultipleofN 
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
		for (int c=a;c<=b ; c++)
		{
			if (c%n==0)
			{
             System.out.println(c);
			}
		}
	}
}
