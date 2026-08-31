class Spynum1to1000 
{
	public static void main(String[] args) 
	{
		for (int a=1;a<=1000 ;a++ )
		{
		int temp=a;
		int sum=0, ld=0, pro=1;
		while (a!=0)
		{
          ld=a%10;
		  sum=sum+ld;
		  pro=pro*ld;
		  a=a/10;
		}
		a=temp;
		if (pro==sum)
		{
			System.out.println(a);
		}
		}
		
	}
}
