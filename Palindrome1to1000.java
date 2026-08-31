
class Palindrome1to1000 
{
	public static void main(String[] args) 
	{
		
		for (int a=1;a<=1000 ;a++ )
		{
		int reverse=0,ld=0;
		int temp=a;
		int i=a;
		while (i!=0)
		{
			ld=i%10;
			reverse=reverse*10+ld;
			i=i/10;
			
		}
		
		if (temp==reverse)
		{
			System.out.println(a);
		}
		}
		
	}
}
