import java.util.Scanner;
class NthPrimenum
{
	
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
        System.out.println("enter a value");
		int n=scan.nextInt();
		int x=2;
		int primecount=1;
		while (primecount<=n)
		{
			int count=0;
			for (int a=1;a<=x2;a++ )
			{
				if (x%a==0)
				{
					count++;
				}
			}
			if (count==2)
			{
				if (primecount==n)
				{
					System.out.println(primecount+") "+x);
				}
				
				primecount++;
			}
			
			x++;
		}
	}
}