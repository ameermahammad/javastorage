class Primepattern1 
{
	public static void main(String[] args) 
	{
		int i=2;
		int j=1;
		char k='a';
		for (int a=1;a<=4;a++ )
		{
			for (int b=1;b<=5 ;b++ )
			{
				if (a==1)
				{
					System.out.print(" "+i+" ");
					while(true)
					{
						i++;
					    int count=0;
					    for(int c=1;c<=i;c++)
					   {
					     if (i%c==0)
					     {
						     count++;
					     }
					    }
					         if (count==2)
					        {
						      break;
					        }
					}
				}
				if (a==2)
				{
					System.out.print(" * ");
				}
				if (a==3)
				{
					System.out.print(" "+j+" ");
					j++;
				}
				if (a==4)
				{
					System.out.print(" "+k+" ");
					k++;
				}
			}
			System.out.println();
		}
	}
}
