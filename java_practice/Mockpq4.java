class Mockpq4 
{
	public static void main(String[] args) 
	{
		int i=1;
		int j=2;
		int k=4;
		int l=7;
		int m=11;
		for (int a=1;a<=1 ;a++ )
		{
			for (int b=1;b<=5 ;b++ )
			{
				if (a==1&&b==5)
				{
					System.out.print(" "+i+" ");
				}
				else
				{
					System.out.print("   ");
				}
				
				
			}
			System.out.println();
			for (int c=1;c<=5 ;c++ )
			{
			
			if (a==1&&c==5||a==1&&c==4)
				{
					System.out.print(" "+j+" ");
					j++;
				}
				else
				{
					System.out.print("   ");
				}
			}
			System.out.println();
			for (int d=1;d<=5 ;d++ )
			{
			
			if (a==1&&d==1||a==1&&d==2)
				{
					System.out.print("   ");
					
				}
				else
				{
					System.out.print(" "+k+" ");
					k++;
				}
			}
			System.out.println();
			for (int e=1;e<=5 ;e++ )
			{
			
			if (a==1&&e==1)
				{
					System.out.print("   ");
					
				}
				else
				{
					System.out.print(" "+l+" ");
					l++;
				}
			}
			System.out.println();
			for (int f=1;f<=5 ;f++ )
			{
				System.out.print(" "+m+" ");
				m++;
			}
			System.out.println();
		}
	}
}
