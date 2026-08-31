import java.util.Scanner;
class Simplecalucalator
{
	public static void main(String[] args) 
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("welcome to simple calucalator");
		System.out.println("enter 1 for addition");
		System.out.println("enter 2 for subtraction");
		System.out.println("enter 3 for multiplication");
		System.out.println("enter 4 for division(quetiont)");
		System.out.println("enter 5 for division(reminder)");
		System.out.println("enter your choice");
		int choice=scan.nextInt();
		switch(choice)
		{
			case 1:
			{
				System.out.println("you choose addition");
				System.out.println("enter a value");
				int a=scan.nextInt();
				System.out.println("you b value");
				int b=scan.nextInt();
				int c=a+b;
				System.out.println("result:" +c);
			}
			break;
			case 2:
			{
				System.out.println("you choose subtraction");
				System.out.println("enter a value");
				int a=scan.nextInt();
				System.out.println("you b value");
				int b=scan.nextInt();
				int c=a-b;
				System.out.println("result:"+c);
			}
			break;
			case 3:
			{
				System.out.println("you choose multiplication");
				System.out.println("enter a value");
				int a=scan.nextInt();
				System.out.println("you b value");
				int b=scan.nextInt();
				int c=a*b;
				System.out.println("result"+c);
			}
			break;
			case 4:
			{
				System.out.println("you choose division(quetient)");
				System.out.println("enter a value");
				int a=scan.nextInt();
				System.out.println("you b value");
				int b=scan.nextInt();
				int c=a/b;
				System.out.println("result:"+c);
			}
			break;
			case 5:
			{
				System.out.println("you choose division(reminder)");
				System.out.println("enter a value");
				int a=scan.nextInt();
				System.out.println("you b value");
				int b=scan.nextInt();
				int c=a%b;
				System.out.println("result:"+c);
			}
			break;
            default :System.out.println("enter valid input");
		}
	}
}

