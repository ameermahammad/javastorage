import java.util.Scanner;
class Npalindromes 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
        System.out.println("enter a value");
		int n=scan.nextInt();
		int x=1;
		int slno=1;
		int palindromecount=1;
		while (palindromecount<=n)
		{
			int  temp=x;
			int ld=0, reverse=0;
			while (x!=0)
			{
				ld=x%10;
				reverse=reverse*10+ld;
				x=x/10;
			}
			x=temp;
			if (x==reverse)
			{
				System.out.println(slno+ ")" +x);
				slno++;
				palindromecount++;
			}
			x++;
		}
	}
}