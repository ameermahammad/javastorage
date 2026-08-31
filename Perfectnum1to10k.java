import java.util.Scanner;
class Perfectnum1to10k
{
	
	public static void main(String[] args) 
	{
	Scanner scan=new Scanner(System.in);
	System.out.println("enter a number");
	int n=scan.nextInt();
		
		for (int i=1;i<=n; i++)
		{
			int sum=0;
			for (int a=1;a<i ;a++ )
			{
			   if (i%a==0)
               {
			    sum=sum+a;
			 
		       }
		    }
		         if (sum==i)
		        {
			       System.out.println(i);
		        }
		
		}
	}
}