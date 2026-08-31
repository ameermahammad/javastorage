class WilleyEdge
 
{
	public static void main(String[] args) 
	{
		int space=4;
		for (int i=1;i<=9 ;i++ )
		{
			for(int j=1;j<=8;j++)
			{
               for (int a=1;a<=i ;a++ )
               {
				   System.out.print(a+"    ");
				   a++;
               }
			   for (int b=1;b<=space ;b++ )
			   {
				   System.out.print("   ");
			   }
			   if(i<=4)
				{
				   space--;
				}
				else
				{
					space++;
				}
			}
			System.out.println();
		}
	}
}
