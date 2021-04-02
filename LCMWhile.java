import java.io.*;
import java.util.*;
public class LCMWhile
{
	public static void main(String args[])
	{
		int n1,n2,lcm;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 2 numbers : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		lcm = (n1>n2) ? n1 : n2;
		while(true)
		{
			if( lcm % n1 == 0 && lcm % n2 == 0 )
            {
                System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
                break;
            }
            ++lcm;
		}
	}
}