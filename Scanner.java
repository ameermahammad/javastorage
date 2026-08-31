class Scanner
{
	public static void main(String[] args) 
	{
        Scanner scan = new Scanner(System.in);
		double pie=3.14;
		System.out.println("enter hight value");
		int h= scan.nextint();
		System.out.println("enter radious value");
		int r= scan.nextint();
		double a= pie*r*r*h;
		System.out.println("enter volume"+a);
		

	}
}
