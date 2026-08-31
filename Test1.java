class  Test1
{
	public static void main(String[] args) 
	{
		for (int j=1;j<=100 ;j++ )
		{
		
			int a=0;
			int b=1;
			int sum=0;
			for (int i=1;i<=j;i++ )
			{
               a=b;
			   b=sum;
			   sum=a+b;
			
			if (sum==j)
			{
				System.out.println(sum);
			}
			}
		}
		
	}
}
