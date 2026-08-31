class WilleyEdge
 
{
	public static void main(String[] args) 
	{
		int a=1;
		
		for (int i=1;i<=9;i++ )
		{
			for(int j=1;j<=9;j++)
			{
				if(i+j==10||i==j)
				{
					System.out.print(i+" ");
					
					
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
