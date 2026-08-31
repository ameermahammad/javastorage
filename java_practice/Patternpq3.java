class Patternpq3 
{
	public static void main(String[] args) 
	{
		for (int a=1;a<=5 ;a++ )
		{
			for (int b=5;b>=1 ;b-- )
			{
				if(a<=b)
				{
				if (b==1)
				{
					for (int m=15;m<=15 ;m++ )
					{
                       System.out.print(" "+m+" ");
					}
				}
				else if (b==2)
				{
					for (int l=13;l<=14 ;l++ )
					{
                       System.out.print(" "+l+" ");
					}
				}
				else if (b==3)
				{
					for (int k=10;k<=12 ;k++ )
					{
                       System.out.print(" "+k+" ");
					}
				}
				else if (b==4)
				{
					for (int j=6;j<=9 ;j++ )
					{
                       System.out.print(" "+j+" ");
					}
					
				}
				else if (b==5)
				{
					for (int i=1;i<=5 ;i++ )
					{
						System.out.print(" "+i+" ");
					}
					
				}
				else
				{
					System.out.print("   ");
				}
				}
			}
			System.out.println();
		}
	}
}
