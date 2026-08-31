class Pattern6
{
	public static void main(String[] args) 
	{
		for (int a=1;a<=4 ;a++ )
		{
			for (int b=1;b<=6;b++ )
			{
				if (a==3 && b==2)
				{
				 System.out.print(" @ ");
				}
				else if (a==2 && b==5)
				{
					System.out.print(" # ");
				}
				else
				{
                  System.out.print(" * ");
				}
			}
			System.out.println();
			
		}
		
	}
}
