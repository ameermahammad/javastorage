import java.util.Scanner;
class ProofNnumbyusingchar 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("how many numbers you want to add:");
		int n=scan.nextInt();
		int pro=1;
		for (int i=1;true ;i++ )
		{ 
			System.out.println("enrer your number");
		  int num=scan.nextInt();
		  char ch = scan.next().charAt(0);
		  if (ch=='*')
		  {
			  pro=pro*num;
		  }
		  else if (ch=='=')
		  {
			  System.out.println("===" );
			  pro=pro*num;
			  System.out.println(pro);
			  break;
		  }
		  
		}
		
	}
}
