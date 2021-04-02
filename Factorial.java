import java.io.*;
import java.util.*;
public class Factorial
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n,i,f=1;
		System.out.print("Enter N : ");
		n = sc.nextInt();
		for(i=1;i<=n;i++)
		{
			f=f*i;
		}
		System.out.println("Factorial of "+n+" is : "+f);
	}
}