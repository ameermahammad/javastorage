class Reverse 
{
	public static void main(String[] args) 
	{
		int a=0;
		int b=1;
		int c=0;
		for (int i=1;i<=10;i++ )
		{
			a=b;
			b=c;
			c=a+b;
			
		}
		for (int j=1;j<=10;j++ )
		{
				System.out.println(c);
				c=b;
				b=a;
				a=c-b;
		}
	}
}
