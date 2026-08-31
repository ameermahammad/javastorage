class Pattern29
{
	public static void main(String[] args) 
	{
		
		int star=1;
		int space=4;
		for (int i=1;i<=9;i++)
		{
			for (int j=1;j<=space;j++)
			{
				System.out.print("   ");
			}
			if (i<=4)
			{
				space--;
			}
			else
			{
				space++;
			}
			for (int a=1;a<=star ;a++ )
			{
				System.out.print(" * ");
			}
			if (i<=4)
			{
				star++;
			}
			else
			{
				star--;
			}
			System.out.println();
			
			
		}
		
	}
}
 
