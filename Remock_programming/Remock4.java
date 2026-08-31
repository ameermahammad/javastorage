class Remock4 
{
	public static void main(String[] args) 
	{
		int space=3;
		int star=1;
		int space1=0;
		for (int a=1;a<=4 ;a++ )
		{
			for (int b=1;b<=space ;b++ )
			{
               
				System.out.print("   ");
				
			}
			for (int c=1;c<=star ;c++ )
			{
                 
					 System.out.print(" * ");
			}
			System.out.println();
			space--;
			star=star+2;
			
		}
	}
}
