class Patternpq7
{
	public static void main(String[] args) 
	{
		int i=15;
		int j=13;
		int k=10;
		int l=6;
		int m=1;
		for (int a=1;a<=5 ;a++ )
		{
			for (int b=5;b>=1 ;b-- )
			{
				if (a<=b)
				{
					if (b==1)
					{
						System.out.print(" "+i+" ");
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
