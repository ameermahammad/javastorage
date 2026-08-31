class SumofdigitsRiseCount 
{
	public static void main(String[] args) 
	{
		int sum=0, ld=0;
		int a=143;
		while (a!=0)
		{
			ld=a%10;
			sum=sum+ld;
			a=a/10;
		}
		System.out.println(sum);
	}
}
