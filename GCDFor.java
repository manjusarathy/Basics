import java.io.*;
import java.util.*;
public class GCDFor
{
	public static void main(String args[])
	{
		int n1,n2,gcd=1,i;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 2 numbers : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		for(i=1; i<=n1 && i<=n2; i++)
		{
			if(n1%i==0&&n2%i==0)
				gcd=i;
		}
		System.out.println("GCD of "+n1+" and "+n2+" is : "+gcd);
	}
}