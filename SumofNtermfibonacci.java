import java.util.Scanner;
class SumofNtermfibonacci
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
        System.out.println("enter a num");
		int n=scan.nextInt();
		int a=0;
		int b=1;
		int sum=0;
		int total=0;
		for (int i=1;i<=n ;i++ )
		{
			a=b;
			b=sum;
			total=sum+total;
			sum=a+b;
		}
         System.out.println(total);
	}

}