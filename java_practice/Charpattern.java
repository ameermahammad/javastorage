class Charpattern 
{
	public static void main(String[] args) 
	{
		char ch1='A';
		char ch2='F';
		char ch3='J';
		char ch4='M';
		char ch5='O';
		for (int a=1;a<=5 ;a++ )
		{
			for (int b=1;b<=5 ;b++ )
			{
				if (a>=b)
				{
                   if (b==1)
                   {
					   System.out.print(" "+ch1+" ");
					   ch1++;
                   }
				   else if (b==2)
                   {
					   System.out.print(" "+ch2+" ");
					   ch2++;
                   }
				   else if (b==3)
                   {
					   System.out.print(" "+ch3+" ");
					   ch3++;
                   }
				   else if (b==4)
                   {
					   System.out.print(" "+ch4+" ");
					   ch4++;
                   }
				   else if (b==5)
                   {
					   System.out.print(" "+ch5+" ");
					   ch5++;
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
