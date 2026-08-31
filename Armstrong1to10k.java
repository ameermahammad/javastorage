
class Armstrong1to10k 
{
	public static void main(String[] args) 
	{
		for (int i=1;i<=10000 ;i++ )
		{
		int temp=i;
		int count=0;
		int num=i;
		while (num!=0)
		{
			count++;
			num=num/10;
		}
		num=temp;
		int sum=0, ld=0;
		while (num!=0)
		{
			ld=num%10;
			int exp=1;
			for (int a=1;a<=count ; a++)
			{
				exp=exp*ld;
			}
			sum=sum+exp;
			num=num/10;
		}
		num=temp;
		if (temp==sum)
		{
         System.out.println(slno+ ")the armstrong numbers are :" +temp);
         
		}
	  }
	}
}
