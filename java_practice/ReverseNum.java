class ReverseNum 
{
	public static void main(String[] args) 
	{
		int num=12345678;
		int ld=0;
		int rev=0;
		int temp=num;
		while (num!=0)
		{
			ld=num%10;
			rev=rev*10+ld;
			num=num/10;
		}
		System.out.println(rev);
	}
}
