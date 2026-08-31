class Patternpq6
{
	public static void main(String[] args) 
	{
		int i=1;
		int j=6;
		int k=10;
		int l=13;
		int m=15;
		for (int a=1;a<=5 ;a++ )
		{
			for (int b=1;b<=5 ;b++ )
			{
				if (a>=b)
				{
					if (b==1)
					{
						System.out.print(" "+i+" ");
						i++;
					}
					else if (b==2)
					{
                      System.out.print(" "+j+" ");
					  j++;
					}
					else if (b==3)
					{
                      System.out.print(" "+k+" ");
					  k++;
					}
					else if (b==4)
					{
                      System.out.print(" "+l+" ");
					  l++;
					}
					else if (b==5)
					{
                      System.out.print(" "+m+" ");
					  m++;
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
