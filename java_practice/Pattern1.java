class Pattern1 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=5 ;i++ )
		{
			for (int j=10;j>=1 ;j-- )
			{
				if (i>=j)
				{
					System.out.print(" * ");
				}
				else
				{
					System.out.print("   ");
				}
			}
			for (int b=1;b<=10 ;b++ )
			{
				if (i>=b)
				{
					System.out.print(" * ");
				}
				else
				{
					System.out.print("   ");
				}
			}
			System.out.println();
		}

	}
}
