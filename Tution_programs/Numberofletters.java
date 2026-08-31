import java.util.*;
class Numberofletters 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s=sc.next();
		int l=s.length();
		int count=0;
		for(int i=0;i<l;i++)
		{
			char ch=s.charAt(i);
			count++;
			
		}
        System.out.println("number of charecters are = "+count);
	}
}
