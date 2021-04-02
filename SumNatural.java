import java.io.*;
import java.util.*;
public class SumNatural
{
	public static void main(String args[])
	{
		int n,sum=0,i;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		n = sc.nextInt();
		for(i=1;i<=n;i++)
			sum+=i;
		System.out.println("Sum : "+sum);
	}
}