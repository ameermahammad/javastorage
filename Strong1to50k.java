class Strong1to50k 
{
	public static void main(String[] args) 
	{
		for (int a=1;a<=50000 ;a++ )
		{
			int temp=a;
			int ld=0, sum=0;
			int i=a;
			while (i!=0)
			{
				ld=i%10;
				int fact=1;
				for (int n=1;n<=ld ;n++ )
				{
					fact=fact*n;
				}
				sum=sum+fact;
				i=i/10;
			}
			a=temp;
			if (temp==sum)
			{
				System.out.println(temp);
			}
		}
	}
}
