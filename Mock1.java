class Mock1 
{
	public static void main(String[] args) 
	{
		for (int a=1;a<=6 ;a++ )
		{
			for (int b=1;b<=6 ;b++ )
			{
				if (a==1&&b==1 || b==1|| a==6|| a==2&& b==2 || a==3&&b==3|| a==4&&b==4 || a==5&&b==5 || a==6&&b==6&&a>=b)
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
