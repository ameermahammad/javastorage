class Pattern14 
{
	public static void main(String[] args) 
	{
		int i=1;
		char ch='a';
		int j=6;
		for (int a=1;a<=5 ;a++ )
		{
			for (int b=1;b<=1 ;b++ )
			{
              System.out.print(" "+i+" ");
			  i++;
			}
			for (char c=1;c<=1 ;c++ )
			{
               if (a==1||c==2)
               {
				   System.out.print("   ");
				   
               }
			   else
				{
				   System.out.print(" "+ch+" ");
			        ch++;
                   
				}
			}
			for (int d=1;d<=1 ;d++ )
			{
				if (a==1||d==4||a==2||d==4)
				{
					System.out.print("   ");
					
				}
                else
				{
					System.out.print(" "+j+" ");
			         j++;
				}
			}
			System.out.println();
		}
		
		
	}
}
