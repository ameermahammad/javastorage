class Remock5
{
	public static void main(String[] args) 
	{
		int n=121;
		int temp=n;
		int rev=0;
		int ld=0;
		int sum=0;
		while (n!=0)
		{
			ld=n%10;
			rev=rev*10+ld;
			sum=sum+rev;
			n=n/10;
		}
		n=temp;
		if (sum>5)
		{
			System.out.println(sum);
		}
	}
}
