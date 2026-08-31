class Practice2 
{
	public static void main(String[] args) 
	{
		for (int a=1;a<=5 ;a++ )
		{
			for (int b=1;b<=5 ;b++ )
			{
				if (a==b)
				{
					for (int i=1;i<=10 ;i++ )
					{
						if (i%2==0)
						{
							System.out.print(" "+i+" ");
						}
					}
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
