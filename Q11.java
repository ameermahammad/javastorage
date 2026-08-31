class Q11 
{
	public static void main(String[] args) 
	{
		int x=2;
		for (int a=1;a<=4 ;a++ )
		{
			for (int b=1;b<=7 ;b++ )
			{
				if (b==1||b==7||a==4||a==3||a==2&&b==2||a==2&&b==6)
				{
					System.out.print(" "+x+" ");
					while (true)
					{
						x++;
						int count=0;
						for (int y=1;y<=x ;y++ )
						{
							if (x%y==0)
							{
								count++;
							}
						}
						if (count==2)
						{
							break;
						}
					}
				}
				else
				{
                   System.out.print("   ");
				}
			}
			System.out.println("\n");
			System.out.println();
		}
	}
}
