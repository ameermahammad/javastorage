import java.util.Scanner;
class NthSpynum
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int n=scan.nextInt();
		int x=1;
		int spycount=1;
		while (spycount<=n)
		{
		int temp=x;
		int sum=0, ld=0, pro=1;
		while (x!=0)
		{
          ld=x%10;
		  sum=sum+ld;
		  pro=pro*ld;
		  x=x/10;
		}
		x=temp;
		if (pro==sum)
		{
			if (spycount==n)
			{
			 System.out.println(x);
		    }
		    spycount++;
		}
		x++;
		}
	}
}
