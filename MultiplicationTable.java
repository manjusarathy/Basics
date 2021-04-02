import java.io.*;
import java.util.*;
public class MultiplicationTable
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int i,n,m;
		System.out.print("Enter the integer for which multiplication table has to be printed : ");
		n = sc.nextInt();
		System.out.print("Enter the number of steps for the multiplcation table : ");
		m = sc.nextInt();
		for(i=1;i<=m;i++)
		{
			System.out.println(i+"*"+n+"="+(i*n));
		}
	}
}