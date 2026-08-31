import java.util.Scanner;
class Bouncynum 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		int temp=num;
		int last=num%10;
		boolean increasing=true;
		while (num!=0)
		{
           int rem=num%10;
		   if (rem>last)
		   {
			   increasing=false;
			   break;
		   }
		   
		   num=num/10;
		}
		num=temp;
		boolean decreasing=true;
		while (num!=0)
		{
           int rem=num%10;
		   if (rem<last)
		   {
			   decreasing=false;
			   break;
		   }
		   
		   num=num/10;
		}
		if (!increasing==!decreasing)
		{
			System.out.println("Bouncy num");
		}
		else
		{
          System.out.println("not Bouncy num");
		}
	}
}
