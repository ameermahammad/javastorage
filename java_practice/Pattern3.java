class Pattern3 
{
	public static void main(String[] args) 
	{
		for (int n=1;n<=11 ;n++ )
			{
				int count=0;
				for (int b=1;b<=n ;b++ )
				{
					if (n%b==0)
					{
						count++;
					}
				}
				if (count==2)
				{
					for (int c=1;c<=n ;c++ )
					{
						System.out.print(" * ");
					}
				}
				
				if (n>=11)
				{
					break;
				}
				n++;
				System.out.println();
			}
	}
}
