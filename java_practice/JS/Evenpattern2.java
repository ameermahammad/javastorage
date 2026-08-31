class Evenpattern2 
{
	public static void main(String[] args) 
	{
		
		for (int a=1;a<=8 ;a++ )
		{
			for (int b=1;b<=8 ;b++ )
			{
				if (a>=b)
				{
					if (a%2==0)
					{
						System.out.print(" * ");
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
