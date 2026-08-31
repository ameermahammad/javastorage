class PascalPattren 
{
	public static void main(String[] args) 
	{
		int space = 5;
		int star = 1;
		for (int i = 0;i<=5 ;i++ )
		{
			for (int a = 0;a<=space ;a++ )
			{
				System.out.print(" ");
			}
			int n = 1;
			for (int j = 0;j<star ;j++ )
			{
				System.out.print(n+" ");
				n = n*(i-j)/(j+1); // 1*1/1=1 ; 1*5/1=5; 5*4/2=10; 10*3/3=10; 10*2/4=5; 5*1/5=1//
			}
			space--;
			star++;
			System.out.println();
		}
	}
}
