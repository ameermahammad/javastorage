class Spynum 
{
	public static void main(String[] args) 
	{
		int num=1124;
		int temp=num;
		int sum=0, ld=0, pro=1;
		while (num!=0)
		{
          ld=num%10;
		  sum=sum+ld;
		  pro=pro*ld;
		  num=num/10;
		}
		num=temp;
		if (pro==sum)
		{
			System.out.println("spy num");
		}
		else
		{
         System.out.println("not a spy num");
		}
	}
}
