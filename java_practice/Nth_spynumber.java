import java.util.Scanner;
class Nth_spynumber 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		int sc=1;
		int x=1;
		while (sc<=num)
		{
			int sum=0;
			int pro=1;
			int ld=0;
			int temp=x;
			while (x!=0)
			{
				ld=x%10;
				sum=sum+ld;
				pro=pro*ld;
				x=x/10;
			}
			x=temp;
			if (sum==pro)
			{
				if (sc==num)
				{
					System.out.println(x);
				    
				}
				sc++;
                
			}
			x++;
		}
	}
}
