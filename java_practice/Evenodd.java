import java.util.Scanner;
class Evenodd 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num1=scan.nextInt();
		int count=0;
		while(num1!=0)
		{
		
			if (num1%2==0)
			{
				count++;
				//System.out.println(count);
				if (count==5 )
				{
					int count1=0;
					int num=157;
					int temp=num;
					while (temp!=0)
					{
						count1++;
						temp=temp/10;
					}
					num=temp;
					int sum=0;
					int ld=0;
					while (num!=0)
					{
						ld=num%10;
						int exp=1;
						for (int b=1;b<=count1 ;b++ )
						{
							exp=exp*ld;
						}
						sum=sum+exp;
					}
					num=temp;
				
					if (sum==num)
					{
						System.out.println("armstrong number");
						break;
					}
					else
					{
						System.out.println("not an armstrong");
					}
				}
				
			}
			else
			{
				count++;
				//System.out.println(count);
				if (count==5)
				{
					int num=121;
					int temp=num;
					int rev=0;
					int ld=0;
					while (num!=0)
					{
						ld=num%10;
						rev=rev*10+ld;
						num=num/10;
					}
					num=temp;
					if (rev==temp)
					{
						System.out.println("palindrome");
						break;
					}
					else
					{
						System.out.println("not a palindrome");
					}
				}
			}
		}
	}
}
