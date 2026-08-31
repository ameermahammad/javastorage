class String1 
{
	public static void main(String[] args) 
	{
		String s="ameer123";
		String s1=" ";
		String s2=" ";
		for (int i=0;i<s.length() ;i++ )
		{
			char c=s.charAt(i);
			if (c<=0&&c>=9)
			{
				s1=s1+c;
			}
			if (c<='a'&&c>='z')
			{
				s2=s2+c;
			}
		}
		System.out.println(s1);
		System.out.println(s2);
	}
}

