class Primepattern 
{
	public static void main(String[] args) 
	{
		int count=0;
		for (int a=1;a<=5 ;a++ )
		{
			if (5%a==0)
			{
				count++;
			}
		}
		if (count==2)
		{
			System.out.print(" * ");
		}
		System.out.println();
	}
}
