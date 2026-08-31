import java.util.Scanner;
class   Areaofcalucalator
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("welcome to area of calucalator ");
		System.out.println("enter 1 to find area of circle");
		System.out.println("enter 2 to find area of triangle");
		System.out.println("enter 3 to find area of square");
		System.out.println("enter 4 to find area of rectangle");
		System.out.println("enter your choice");
		int choice= scan.nextInt();
		if (choice==1)
		{
			System.out.println("your are selected area of circle");
			System.out.println("enter radious of circle");
			double r= scan.nextDouble();
			double result=3.14*r*r;
			System.out.println("area of circle"+result+"centemeters");

		}
       else if (choice==2)
		{
			System.out.println("your are selected area of trianle");
			System.out.println("enter hieght of tra[iangle");
			System.out.println("enter base of triangle");
			double h=scan.nextDouble();
             double b=scan.nextDouble();
			 double result2=0.5*h*b;
           System.out.println("area of triangle"+result2+"centemeters");


		}
		else if (choice==3)
		{
			System.out.println("your are selected area of square");
			System.out.println("enter area of square");
			
			double a= scan.nextDouble();
			double result3=a*a;
			System.out.println("area of square"+result3+"centemeters");

		}
		else if (choice==4)
		{
			System.out.println("your are selected area of rectangle");
			System.out.println("enter width of tra[iangle");
			System.out.println("enter length of triangle");
			double w=scan.nextDouble();
             double l=scan.nextDouble();
			 double result4=w*l;
           System.out.println("area of triangle"+result4+"centemeters");

		}
		else
		{
			System.out.println("enter valid input");
		}

          System.out.println("THANK YOU");


	}
}
