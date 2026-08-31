class Patternpq 
{
	public static void main(String[] args) 
	{
		int n=1;
		int k=3;
		char ch='a';
		int m=1;
		for (int i=1;i<=5 ;i++ )
		{
			for (int j=1;j<=5 ;j++ )
			{
				if (i>=j)
				{
					if (j==1)
					{
						System.out.print(" * ");
					}
					else if (j==2)
					{
                       System.out.print(" "+n+" ");
					   n++;
					}
					else if (j==3)
					{
                       System.out.print(" "+k+" ");
					   k=k+3;
					}
					else if (j==4)
					{
                       System.out.print(" "+ch+" ");
					   ch++;
					}
					else if (j==5)
					{
                       System.out.print(" "+m+" ");
					   m=m+2;;
					}
					else
					{
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}
