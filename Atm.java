import java.util.Scanner;
class Atm 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("*****  WELCOME TO ATM  *****");
		System.out.println("enter your pin number");
		int pin1=scan.nextInt();
		int pin2=0000;
		int balance=30000;
		if (pin1==pin2)
		{
			System.out.println("option 1 withdraw");
			System.out.println("option 2 balane enquirey");
			System.out.println("option 3 change pin number");
			System.out.println("select your option");
			int choice=scan.nextInt();
			switch (choice)
			{
			case 1:System.out.println("enter your withdraw money");
			 int withdraw=scan.nextInt();
			 System.out.println("your money "+withdraw+" withdraw successfully");
			 System.out.println("your remaing balance "+(balance-withdraw));
               break;
			   case 2: System.out.println("your balance is"+balance);
			  break;
			   case 3:System.out.println("enter your old pin number");
			   int pin3=scan.nextInt();
               System.out.println("enter your new pin number");
			   int pin4=scan.nextInt();
			   System.out.println("your pin number changed successfully");
			   System.out.println("enter your updated pin number");
			   int pin5=scan.nextInt();
			   if (pin5==pin4)
			   {
                    System.out.println("option 1 withdraw");
			        System.out.println("option 2 balane enquirey");
			        System.out.println("option 3 change pin number");
			        System.out.println("select your option");
		            int choice1=scan.nextInt();
			switch (choice1)
			{
			case 1:System.out.println("enter your withdraw money");
			 int withdraw1=scan.nextInt();
			 System.out.println("your money "+withdraw1+" withdraw successfully");
			 System.out.println("your remaing balance "+(balance-withdraw1));
               break;
			   case 2: System.out.println("your balance is"+balance);
			   break;
			   case 3:System.out.println("enter your old pin number");
			   int pin6=scan.nextInt();
               System.out.println("enter your new pin number");
			   int pin7=scan.nextInt();
			   System.out.println("your pin number changed successfully");
			   break;
			   default :System.out.println("enter valid option");
			}
			   }
			   else
				{
				   System.out.println("enter valid pin number");
				}

			   break;
                default :System.out.println("select valid option");
			}
		}
		else
		{
			System.out.println("enter your correct pin number");
		}
	}
}
