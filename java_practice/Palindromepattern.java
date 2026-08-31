import java.util.Scanner;
class Palindromepattern 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int num=scan.nextInt();
		int reverse=0,ld=0,temp=num;
		while (num!=0)
		{
			ld=num%10;
			reverse=reverse*10+ld;
			num=num/10;
		}
		if (temp==reverse)
		{
			int i=1;
		int j=6;
		int k=10;
		int l=14;
		int m=16;
		for (int a=1;a<=5 ;a++ )
		{
			for (int b=1;b<=1 ;b++ )
			{
				System.out.print(" "+i+" ");
				i++;
			}
			for (int c=1;c<=1 ;c++ )
			{
				if(a==1||c==2)
				{
				   System.out.print("   ");
				}
				else
				{
					System.out.print(" "+j+" ");
				    j++;
				}
			}
			for (int d=1;d<=1 ;d++ )
			{
				if(a==1||d==3||a==2||d==3)
				{
				   System.out.print("   ");
				}
				else
				{
					System.out.print(" "+k+" ");
				    k++;
				}
			}
			for (int e=1;e<=1 ;e++ )
			{
				if(a==4||e==4||a==5||e==4)
				{
					System.out.print(" "+l+" ");
				    l++;
				  
				}
				else
				{
					 System.out.print("   ");
				}
			}
			for (int f=1;f<=1 ;f++ )
			{
				if(a==5||f==5)
				{
					System.out.print(" "+m+" ");
				    
				  
				}
				else
				{
					 System.out.print("   ");
				}
			}
			System.out.println();
		}
		}
		else
		{
           System.out.println("it is  not palindrome ");
		}
	}
}
