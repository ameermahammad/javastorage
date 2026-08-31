import java.util.Scanner;
class Nextprimenum 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println(" enter given number");
		int num=scan.nextInt();
		while (true)
		{
			num++;
			int count=0;
			for (int a=1;a<=num;a++ )
			{
				if (num%a==0)
				{
					count++;
				}
			}
			if (count==2)
			{
				System.out.println(num);
				break;
			}
		}

		}
}