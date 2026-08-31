import java.util.Scanner;
class Multipleof12 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enteer min value");
		int a=scan.nextInt();
		System.out.println("enterr min value");
		int b=scan.nextInt();
		for (int c=a;c<=b ; c++)
		{
			if (c%12==0)
			{
             System.out.println(c);
			}
		}
	}
}
