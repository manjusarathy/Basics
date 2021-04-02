import java.io.*;
import java.util.*;
public class Subtraction
{
	public static void main(String args[])
	{
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER A : ");
		a = sc.nextInt();
		System.out.print("ENTER B : ");
		b = sc.nextInt();
		c = a - b;
		System.out.println(a+ " - " +b+ " = " +c);
	}
}