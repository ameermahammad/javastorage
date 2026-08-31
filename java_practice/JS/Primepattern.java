class Primepattern 
{
	public static void main(String[] args) 
	{
		
		for (int a=1;a<=8 ;a++ )
		{
			for (int b=1;b<=8 ;b++ )
			{
				if (a>=b)
				{
					int count=0;
					for (int k=1;k<=a ;k++ )
					{
						if (a%k==0)
						{
							count++;
						}
					}
					if (count==2)
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
