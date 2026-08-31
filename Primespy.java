class Primespy 
{
	public static void main(String[] args) 
	{
		
		for (int b=1;b<=100 ;b++ )
		{
		      int count=0;
		      for (int a=1;a<=b ;a++ )
		      {
			        if (b%a==0)
			        {
				       count++;
			        }
		       }
		
		       if (count==2)
		      {
			
				int temp=b;
				int sum=0;
				int pro=1;
				while (b!=0)
				{
					int ld = b%10;
					sum = sum+ld;
					pro = pro*ld;
					b = b/10;
				}
				b=temp;
				if (sum==pro)
				{
					System.out.println(sum);
				}
				
			
		      }
		}
	}
}
