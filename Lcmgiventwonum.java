class Lcmgiventwonum 
{
	public static void main(String[] args) 
	{
		int a=8;
		int b=12;
		int lcm=1;
		for (int i=1;i<=a&&i<=b;i++ )
		{
			if (a%i==0&&b%i==0)
			{
				lcm=i;
				lcm=(a*b)/lcm;
			}
			 
		}
		System.out.println(lcm);
	}
}
