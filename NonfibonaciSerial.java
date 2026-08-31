class NonfibonaciSerial 
{
	public static void main(String[] args) 
	{
		int a=0;
		int b=1;
		int sum=1;
		for (int i=1;i>0 ;i++ )
		{
			if (sum==i)
			{
			 a=b;
			 b=sum;
			 sum=a+b;

			if (sum>100)
			{
				break;
			}
			}
			else
			{
				System.out.println(i);
			}
		}
		
	}
}
