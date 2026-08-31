class Hcf2 
{
	public static void main(String[] args) 
	{
		int n1=374;
		int n2=510;
		while (n2>0)
		{
			int temp=n2;
			n2=n1%n2;
			n1=temp;
		}
		System.out.println(n1);
	}

}
