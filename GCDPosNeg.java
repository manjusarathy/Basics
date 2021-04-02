import java.io.*;
import java.util.*;
public class GCDPosNeg
{
	public static void main(String args[])
	{
		int n1,n2;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 2 numbers : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n1 = ( n1 > 0) ? n1 : -n1;
        n2 = ( n2 > 0) ? n2 : -n2;
		while(n1!=n2)
		{
			if(n1>n2)
				n1-=n2;
			else
				n2-=n1;
		}
		System.out.println("GCD : "+n1);
	}
}