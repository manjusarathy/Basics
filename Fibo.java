import java.io.*;
import java.util.*;
public class Fibo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		int a,b,n,c,i;
		a=0;
		b=1;
		System.out.print("Enter n : ");
		n = sc.nextInt();
		if (n<=0)
			System.out.print("INVALID INPUT");
		else if(n==1)
			System.out.print(a);
		else if (n==2)
			System.out.print(a+" "+b);
		else
		{
			System.out.print(a+" "+b);
			for(i=2;i<n;i++)
			{
				c = a+b;
				System.out.print(" "+c);
				a = b;
				b = c;
			}
		}
	}
}