
class Mockreturntype 
{
	public static int findPalindrome()
	{
		int a=121;
		int ld=0;
		int rev=0;
		int temp=a;
		while (a!=0)
		{
			ld=a%10;
			rev=rev*10+ld;
			a=a/10;
		}
		a=temp;
		if (temp==rev)
		{
			
		}
		return rev;
	}
	public static void findPrime()
	{
		int b=findPalindrome();
		int count=0;
		for (int i=1;i<=b ;i++ )
		{
			if (b%i==0)
			{
				count++;
			}
		}
		if (count==2)
		{
			System.out.println("prime");
		}
		else
		{
           System.out.println(" not prime");
		}
	}
	public static void main(String[] args) 
	{
		findPrime();
	}
}
