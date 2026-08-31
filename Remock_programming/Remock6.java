class Remock6 
{
	public static void main(String[] args) 
	{
		for (int a=1;a<=5;a++)
		{
			for (int b=1;b<5 ;b++ )
			{
				if (a+b==6||a==5)
				{
					System.out.print(" * ");
				}
				else
				{
					System.out.print("   ");
				}
			}

			for (int c=1;c<=5 ;c++ )
			{
				if (a==c||a==5)
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
