class Nonfibonacci 
{
	public static void main(String[] args) 
	{
		int a=0, b=1, sum=0;
		int slno=1;
		for (int i=0;i<=100 ;i++ )
		{
			if (sum==i)
			{
				sum=a+b;
				a=b;
				b=sum;
			}
			else
			{
             System.out.println(slno+")" +i);
			 slno++;
			}
		}
		
	}
}
