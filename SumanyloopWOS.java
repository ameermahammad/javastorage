class SumanyloopWOS 
{
	public static void main(String[] args) 
	{
		
		
		int sum=0;
		int last_digit=0;
		for (int num=123;num!=0 ;num=num/10 )
		{
			last_digit=num%10;
			sum=sum+last_digit;
		}
			System.out.println(sum);
	}
}
