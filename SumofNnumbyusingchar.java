import java.util.Scanner;
class SumofNnumbyusingchar 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("how many numbers you want to add:");
		int n=scan.nextInt();
		int sum=0;
		for (int i=1;true ;i++ )
		{ 
			System.out.println("enrer your number");
		  int num=scan.nextInt();
		  char ch = scan.next().charAt(0);
		  if (ch=='+')
		  {
			  sum=sum+num;
		  }
		  else if (ch=='=')
		  {
			  System.out.println("===" );
			  sum=sum+num;
			  System.out.println(sum);
			  break;
		  }
		  
		}
		
	}
}
