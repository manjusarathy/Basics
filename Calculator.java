import java.io.*;
import java.util.*;
public class Calculator
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a,b,c,op,ch;
		do
		{
			System.out.print("ENTER A : ");
			a = sc.nextInt();
			System.out.print("ENTER B : ");
			b = sc.nextInt();
			System.out.print("ENTER CHOICE (1/2/3/4/5) : ");
			op = sc.nextInt();
			switch(op)
			{
				case 1:
					c = a + b;
					System.out.println(a+"+"+b+"="+c);
				break;
				case 2:
					c = a - b;
					System.out.println(a+"-"+b+"="+c);
				break;
				case 3:
					c = a * b;
					System.out.println(a+"*"+b+"="+c);
				break;
				case 4:
					c = a / b;
					System.out.println(a+"/"+b+"="+c);
				break;
				case 5:
					c = a % b;
					System.out.println(a+"%"+b+"="+c);
				break;
				default:
					System.out.println("WRONG CHOICE...!!!");
			}
			System.out.print("Do You Want To Continue ? (1-YES. 2-NO)");
			ch = sc.nextInt();
		}while(ch==1);
		System.out.println("END OF PROGRAM...!!!!");
	}
}