class  Armstrongnumber
{
	public static void main(String[] args) 
	{
		for (int a=1;a<=1000 ;a++ )
		{
		
		int count=0;
		int temp=a;
		while (a!=0)
		{
			count++;
			a=a/10;
		}
		a=temp;
		int lastdigit=0;
		int sum=0;
		while (a!=0)
		{
			lastdigit=a%10;
			int exp=1;
			for (int i=1;i<=count ;i++ )
			{
                exp=exp*lastdigit;
			}
			sum=sum+exp;
			a=a/10;
		}
		a=temp;
		if (sum==temp)
		{
			int count1=0;
			for (int b=1;b<=sum ;b++ )
			{
				if (sum%b==0)
				{
					count1++;
				}
			}
			if (count1==2)
			{
				System.out.println(sum);
			}
		}
		
		}
	}
}
