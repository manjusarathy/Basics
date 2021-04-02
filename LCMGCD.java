import java.io.*;
import java.util.*;
public class LCMGCD 
{
    public static void main(String[] args) 
    {
        int n1,n2, gcd = 1,i,lcm;
        Scanner sc = new Scanner(System.in);
		System.out.print("Enter 2 numbers : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
        for(i = 1; i <= n1 && i <= n2; ++i)
        {
            if(n1 % i == 0 && n2 % i == 0)
                gcd = i;
        }
        lcm = (n1 * n2) / gcd;
        System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
    }
}