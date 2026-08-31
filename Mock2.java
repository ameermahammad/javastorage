class Mock2 
{
	public static void main(String[] args) 
	{
		int space=0;
		int star=1;
		for (int a=1;a<=3 ;a++ )
		{
			for (int b=1;b<=6 ;b++ )
			{
				if (a<=b)
				{
					System.out.print(" * ");
					space++;
					
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
