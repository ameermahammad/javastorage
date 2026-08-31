import java.util.Scanner;
class Average
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a= scan.nextInt();
		System.out.println("Enter 2nd number");
        int b= scan.nextInt();
		System.out.println("Enter 3rd number");
		int c= scan.nextInt();
		System.out.println("Enter 4th number");
		int d= scan.nextInt();
		System.out.println("Enter 5rd number");
		int e= scan.nextInt();
		 double i= a+b+c+d+e/5;
		 System.out.println("average value:"+i);
	}
}
