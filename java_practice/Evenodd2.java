class Evenodd2 
{
	public static void main(String[] args) 
	{
		int n=4;
		int count=0;
		while (n!=0)
		{
			if (n%2==0)
			{
				for(int z=1;z<=n;z++)
				{
					if (n%z==0)
					{
                         count++;
					}
				}
			   if (count==4)
			   {
				   
				   int rev=0;
				   int ld=0;
				   int temp=n;
				   while (n!=0)
				   {
					   ld=n%10;
					   rev=rev*10+ld;
					   n=n/10;
				   }
				   n=temp;
				   if (temp==rev)
				   {
					   System.out.println("palindrome");
					   break;
				   }
				   else
				   {
					   System.out.println("not a palindrome");
					   break;
				   }
			   }
			   else
				{
				   System.out.println("your count is not matching");
				   break;
				}
			}
			else
			{
               count++;
			   if (count==2)
			   {
				   int count3=0;
		           for (int i=1;i<=n;i++)
		           {
			          if (n%i==0)
			          {
				        count3++;
			          }
		            }
		               if (count3==2)
		               {
			              System.out.println("prime number");
			              break;
		               }
		               else
			          {
				          System.out.println("not a prime");
				          break;
			           }
				}
			}
		}
	}
}
