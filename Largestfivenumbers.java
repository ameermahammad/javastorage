import java.util.Scanner;
class Largestfivenumbers 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a number");
		int n1=scan.nextInt();
		System.out.println("enter another number");
		int n2=scan.nextInt();
		int large= (n1>n2)?n1:n2;
		System.out.println("large number is:" +large);
	}
}
