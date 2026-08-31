class Ascci
{
	public static void main(String []args)
	{
		
		for (int i='a';i<='z' ;i++ )
		{
			System.out.println(i);
			
		}
		for (int i='A';i<='Z' ;i++ )
		{
			System.out.println(i);
			
		}
		int a=10;
		int b=20;
		b=b-a;
		a=a+b;
		System.out.println("swap a value is "+a);
		System.out.println("swap b value is "+b);
	}
}