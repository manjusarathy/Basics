import java.util.Scanner;
public class DistanceTwoPts
{
	public static void main(String args[])
	{
		int x1,x2,y1,y2;
        double dis;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter x1 point : ");
        x1=sc.nextInt();
        System.out.print("enter y1 point : ");
        y1=sc.nextInt();
        System.out.print("enter x2point : ");
        x2=sc.nextInt();
        System.out.print("enter y2 point : ");
        y2=sc.nextInt();
        dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.print("distancebetween"+"("+x1+","+y1+"),"+"("+x2+","+y2+"): "+dis);

	}
}