import java.util.Scanner;
 
class Tables
{
  public static void main(String args[])
  {
    int a, b, c, d;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter starting range of numbers to print their multiplication tables : ");
    a = in.nextInt();
    System.out.println("Enter ending range of numbers to print their multiplication tables : ");
    b = in.nextInt();
    for (c = a; c <= b; c++) 
    {
      System.out.println("Multiplication table of "+c);
      for (d = 1; d <= 10; d++) 
      {
        System.out.println(c+"*"+d+" = "+(c*d));
      }
    }
  }
}