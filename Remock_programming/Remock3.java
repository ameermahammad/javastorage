class Remock3 
{
	public static void main(String[] args) 
	{
		int n=130;
		int rev=0;
		int temp=n;
		int ld=0;
		while (n!=0)
		{
			ld=n%10;
			rev=rev*10+ld;
			n=n/10;
		}
		n=temp;
		if (temp==rev)
		{
			int count1=0;
			int temp1=rev;
			while (temp1!=0)
			{
				count1++;
				temp1=temp1/10;
			}
			rev=temp1;
			int sum=0;
			int ld1=0;
			while (temp1!=0)
			{
				ld1=temp1%10;
				int exp=1;
				for (int i=1;i<=count1 ;i++ )
				{
					exp=exp*ld1;
				}
				sum=sum+exp;
				temp1=temp1/10;
			}
			rev=temp1;
			if (temp1==sum)
			{
				System.out.println("armstrong");
			}
			else
			{
               System.out.println("not armstrong");
			}
		}
	}
}
