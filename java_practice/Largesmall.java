class Largesmall 
{
	public static void main(String[] args) 
	{
		int num=654689053;
		int ld=0;
		int large=0;
		int small=1;
		while (num!=0)
		{
			ld=num%10;
			if (ld>large)
			{
				large=ld;
			}
			else if(ld<=small)
			{
               small=ld;
			}
			num=num/10;
		}
		System.out.println(large);
		System.out.println(small);
	}
}
