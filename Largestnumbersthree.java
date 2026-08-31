import java.util.Scanner;
class Largestnumbersthree
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter n1 number");
		int n1=scan.nextInt();
		System.out.println("enter n2 number");
		int n2=scan.nextInt();
		System.out.println("enter n3 number");
		int n3=scan.nextInt();
		int large= (n1>n2&&n1>n3)?n1:(n2>n3)?n2:n3;
		System.out.println("large number is:" +large);
	}
}
