class  Test1
{
	public static void main(String[] args) 
	{
		for (int a=1;a<=100 ;a++ )
		{
			int a=0;
			int b=1;
			int sum=0;
			for (int b=1;b<=a ;b++ )
			{
				System.out.println(sum);
               a=b;
			   b=sum;
			   sum=a+b;
			}
		}
		
	}
}
