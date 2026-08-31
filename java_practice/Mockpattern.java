class Mockpattern 
{
	public static void main(String[] args) 
	{
		int x=0;
		int star=1;
		int space=3;
		for (int a=1;a<=7 ;a++ )
		{
			for (int b=1;b<=space ;b++ )
			{
				System.out.print("   ");
			}
			for(int c=1;c<=star;c++)
			{
				System.out.print("  "+x+"  ");
				x=x+2;
			}
			if (a<=3)
			{
				space--;
				star++;
			}
			else
			{
				space++;
				star--;
			}
			   System.out.println();
		}
	}
}
