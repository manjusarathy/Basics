import java.util.Scanner;
class AverageNNumbers
{
   public static void main(String arg[])
   {
       int n;
       double res=0;
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter how many numbers to calculate average : ");
       n=sc.nextInt();
       int a[]=new int[n];
       System.out.print("Enter   "+n+"  numbers : ");
       for(int i=0;i<n;i++)
    	   a[i]=sc.nextInt();
       for(int i=0;i<n;i++)
    	   res =res+a[i];
       res = res/n;
        System.out.println("Average="+res);
    }
}