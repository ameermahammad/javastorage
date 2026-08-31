import java.util.Scanner;
class Nthstrongnum 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scan.nextInt();
		int x=1;
		int sc=1;
		while (sc<=n)
		{
			int temp=x;
			int ld=0, sum=0;
			while (x!=0)
			{
				ld=x%10;
				int fact=1;
				for (int a=1;a<=ld ;a++ )
				{
					fact=fact*a;
				}
				sum=sum+fact;
				x=x/10;
			}
			x=temp;
			if (temp==sum)
			{
              if (sc==n)
              {
               System.out.println(x);
			  }
			  sc++;
			}
			x++;
		}
	}
}